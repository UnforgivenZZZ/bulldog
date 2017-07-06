package com.server;
import com.connection.*;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.sql.*;
/**
 * Servlet implementation class register
 */
@WebServlet("/register")
public class register extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private Connection con;
	private static final String qry = "INSERT INTO users(name,contact,password) "+
			" VALUES(?,?,?) ";
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public register() {
        super();
        // TODO Auto-generated constructor stub
		con = ConnectionManager.getConnection();

    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		request.getRequestDispatcher("/signup.html").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PreparedStatement ps = null;
		String contact = request.getParameter("contact");
		String pin = request.getParameter("pin");
		String uname = request.getParameter("username");
		
		try{
			con.setAutoCommit(false);
			ps = con.prepareStatement(qry);
			ps.setString(1, uname);
			ps.setString(2, contact);
			ps.setString(3, pin);
			ps.executeUpdate();
			con.commit();
			
		}catch(Exception ex){
			System.out.println(ex.getMessage());
		}finally{
			try{
				con.setAutoCommit(true);
				ps.close();
			}catch(Exception ex){
				System.out.println(ex.getMessage());

			}
		}
	}

}
