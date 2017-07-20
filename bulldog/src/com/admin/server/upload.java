package com.admin.server;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collectors;

import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;

import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;


/**
 * Servlet implementation class UploadServlet
 */
@WebServlet("/upload")
@MultipartConfig
public class upload extends HttpServlet {
	private final String UPLOAD_DIRECTORY = "/Users/jialiangzhou/Desktop/ss1";
	private static final long serialVersionUID = 1L;
    /*
	insert into products(sku,name,price,delieverFee,descript,seller) 
	Values(?,?,?,?,?,?) returning id --> int id;
	
	
    /**
     * @see HttpServlet#HttpServlet()
     */
    public upload() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doPost(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		// compare type
		int seller = Integer.parseInt(request.getParameter("seller"));
		if(ServletFileUpload.isMultipartContent(request))
		{
			try
			{	
				System.out.println(request.getParameter("user"));
				List<Part> fileParts = request.getParts().stream().filter(part -> "file".equals(part.getName())).collect(Collectors.toList()); // Retrieves <input type="file" name="file" multiple="true">
				File uploads = new File(UPLOAD_DIRECTORY);
			    for (Part filePart : fileParts) {
			        String fileName = Paths.get(filePart.getSubmittedFileName()).getFileName().toString(); // MSIE fix.
			        File file = new File(uploads, fileName);

			        InputStream fileContent = filePart.getInputStream();
			        Files.copy(fileContent, file.toPath());
			        
			        String pic = UPLOAD_DIRECTORY + fileName;
			        //insert into image(pic,prod) values(pic,id)
			    }
			    
/*		This part did excatly same as the loop above but i dont know why it doesnt work	*/
//				List<FileItem> multiparts = new ServletFileUpload(new DiskFileItemFactory()).parseRequest(request);
//				System.out.println(request.getParameter("user"));
//				for(FileItem item : multiparts)
//				{
//					if(!item.isFormField())
//					{
//						String name = new File(item.getName()).getName();
//						item.write(new File(UPLOAD_DIRECTORY + File.separator + name));
//						System.out.println(UPLOAD_DIRECTORY + File.separator + name);
//
//					}
//					
//				}
/*		It is 玄学																				*/
				request.setAttribute("message", "File uploaded successfully.");
			}
			catch(Exception ex)
			{
				request.setAttribute("message", "File upload failed due to : " + ex);
			}
		}
		else
		{
			request.setAttribute("message", "Sorry this servlet only handles file upload request.");
		}
		//request.getRequestDispatcher("/result.jsp").forward(request, response);
	}

}
