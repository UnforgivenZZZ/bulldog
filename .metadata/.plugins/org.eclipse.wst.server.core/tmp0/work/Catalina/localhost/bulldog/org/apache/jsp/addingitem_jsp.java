/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.0.M22
 * Generated at: 2017-07-15 01:22:38 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class addingitem_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(2);
    _jspx_dependants.put("/css/add-products-style.css", Long.valueOf(1499993241000L));
    _jspx_dependants.put("/css/style.css", Long.valueOf(1499993241000L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
  }

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    final java.lang.String _jspx_method = request.getMethod();
    if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method) && !javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET POST or HEAD");
      return;
    }

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=ISO-8859-1\">\n");
      out.write("<title>Adding new item</title>\n");
      out.write("\n");
      out.write("</head>\n");
      out.write("<style>\n");
      out.write("<!-- This must be include to used css>\n");
      out.write("form {\n");
      out.write("\tmargin-top: 10px;\n");
      out.write("}\n");
      out.write("\n");
      out.write("label {\n");
      out.write("\tfont-size: 16px; \n");
      out.write("\twidth: 100px; \n");
      out.write("\tdisplay: block; \n");
      out.write("\ttext-align: right;\n");
      out.write("\tmargin-right: 10px;\n");
      out.write("\tmargin-top: 8px;\n");
      out.write("\tmargin-bottom: 8px;\n");
      out.write("}\n");
      out.write("\n");
      out.write("input {\n");
      out.write("\twidth: 250px;\n");
      out.write("\tborder: 1px solid \t#1E90FF; \n");
      out.write("\tborder-radius: 5px; \n");
      out.write("\tpadding: 4px; \n");
      out.write("\tfont-size: 16px;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".save {\n");
      out.write("\tfont-weight: bold;\n");
      out.write("\twidth: 130px; \n");
      out.write("\tpadding: 5px 10px; \n");
      out.write("\tmargin-top: 30px;\n");
      out.write("\tbackground: #F08080;\n");
      out.write("}\n");
      out.write("\n");
      out.write("table {   \n");
      out.write("\tborder-style:none;\n");
      out.write("\twidth:50%;\n");
      out.write("}\n");
      out.write("\n");
      out.write("tr:nth-child(even) {background:#4169E1}\n");
      out.write("tr:nth-child(odd) {background: #4169E1}\n");
      out.write("\n");
      out.write("tr {\n");
      out.write("\tborder-style:none;\n");
      out.write("\ttext-align:left;\t\n");
      out.write("}\n");
      out.write("\t\n");
      out.write('\n');
      out.write("html, body{\n");
      out.write("\tmargin-left:15px; margin-right:15px; \n");
      out.write("\tpadding:0px; \n");
      out.write("\tfont-family:Verdana, Arial, Helvetica, sans-serif;\n");
      out.write("}\n");
      out.write("\n");
      out.write("table {   \n");
      out.write("\tborder-collapse:collapse;\n");
      out.write("\tborder-bottom:1px solid gray;\n");
      out.write("\tfont-family: Tahoma,Verdana,Segoe,sans-serif;\n");
      out.write("\twidth:72%;\n");
      out.write("}\n");
      out.write(" \n");
      out.write("th {\n");
      out.write("\tborder-bottom:1px solid gray;\n");
      out.write("\tbackground:none repeat scroll 0 0 #0775d3;\n");
      out.write("\tpadding:10px;\n");
      out.write("\tcolor: #FFFFFF;\n");
      out.write("}\n");
      out.write("\n");
      out.write("tr {\n");
      out.write("\tborder-top:1px solid \t#87CEEB;\n");
      out.write("\ttext-align:center;\t\n");
      out.write("}\n");
      out.write(" \n");
      out.write("tr:nth-child(even) {background: #FFFFFF}\n");
      out.write("tr:nth-child(odd) {background: \t#008080}\t\n");
      out.write(" \n");
      out.write("#wrapper {width: 100%; margin-top: 0px; }\n");
      out.write("#header {width: 70%; background: #0775d3; margin-top: 0px; }\n");
      out.write("#header h2 {width: 100%; margin:auto; color: #FFFFFF;}\n");
      out.write("#container {width: 100%; margin:auto}\n");
      out.write("#container h3 {color: #000;}\n");
      out.write("#container #content {margin-top: 20px;}\n");
      out.write("\n");
      out.write(".add-student-button {\n");
      out.write("\tborder: 1px solid #666; \n");
      out.write("\tborder-radius: 5px; \n");
      out.write("\tpadding: 4px; \n");
      out.write("\tfont-size: 12px;\n");
      out.write("\tfont-weight: bold;\n");
      out.write("\twidth: 120px; \n");
      out.write("\tpadding: 5px 10px; \n");
      out.write("\t\n");
      out.write("\tmargin-bottom: 15px;\n");
      out.write("\tbackground: #cccccc;\n");
      out.write("}");
      out.write("\n");
      out.write("\n");
      out.write("</style>\n");
      out.write("<body>\n");
      out.write("\n");
      out.write("<!-- \tid,sku,pic,name,pict,price,delieverFee,descript,seller,categ,postDate <form action=\"adding\" method=\"post\">-->\n");
      out.write("   <form action=\"productControllerServlet\" method=\"GET\">\n");
      out.write("\t\t\t<input type =\"hidden\" name =\"command\" value =\"ADD\"/>\n");
      out.write("        <table border=\"0\" width=\"45%\" align=\"center\">\n");
      out.write("     \n");
      out.write("\t\n");
      out.write("\t\t\t<caption><h2>Adding a product new item</h2></caption>\n");
      out.write("\t\t\t\n");
      out.write("\t\t\n");
      out.write("             <tr>\n");
      out.write("                <td width=\"50%\">ID: </td>\n");
      out.write("                <td><input type=\"text\" placeholder=\"id\" name=\"_id\"></td>\n");
      out.write("            </tr>\n");
      out.write("             <tr>\n");
      out.write("                <td width=\"50%\">Sku: </td>\n");
      out.write("                <td><input type=\"text\" placeholder=\"Sku\" name=\"_Sku\"></td>\n");
      out.write("            </tr>\n");
      out.write("            <tr>\n");
      out.write("                <td>Pic: </td>\n");
      out.write("                <td><input type=\"text\" placeholder=\"Pictureurl\" name=\"_Pictureurl\"></td>\n");
      out.write("            </tr>\n");
      out.write("            <tr>\n");
      out.write("                <td>Name: </td>\n");
      out.write("                <td><input type=\"text\" placeholder=\"Name\" name=\"_Name\"></td>\n");
      out.write("            </tr>\n");
      out.write("             <tr>\n");
      out.write("                <td>Pict: </td>\n");
      out.write("                <td><input type=\"text\" placeholder=\"Pict\" name=\"_Pict\"></td>\n");
      out.write("            </tr>\n");
      out.write("             <tr>\n");
      out.write("                <td>Pirce: </td>\n");
      out.write("                <td><input type=\"text\" placeholder=\"Price\" name=\"_Price\"></td>\n");
      out.write("            </tr>\n");
      out.write("            <tr>\n");
      out.write("                <td>DelieverFee: </td>\n");
      out.write("                <td><input type=\"text\" placeholder=\"DelieverFee\" name=\"_DelieverFee\"></td>\n");
      out.write("            </tr>\n");
      out.write("            <tr>\n");
      out.write("                <td>Descript: </td>\n");
      out.write("                <td><input type=\"text\" placeholder=\"Descript\" name=\"_Descript\"></td>\n");
      out.write("            </tr>\n");
      out.write("             <tr>\n");
      out.write("                <td>Seller: </td>\n");
      out.write("                <td><input type=\"text\" placeholder=\"Seller\" name=\"_Seller\"></td>\n");
      out.write("            </tr>\n");
      out.write("            <tr>\n");
      out.write("                <td>Categs: </td>\n");
      out.write("                <td><input type=\"text\" placeholder=\"Categ\" name=\"_Categ\"></td>\n");
      out.write("            </tr>\n");
      out.write("\n");
      out.write("            \n");
      out.write("        \n");
      out.write("\t\t\t<br/>\n");
      out.write("\n");
      out.write("            <tr>\n");
      out.write("            <!-- change to onlick cannot proces if not working with duplicate -->\n");
      out.write("                <td colspan=\"2\" align=\"center\"><input type=\"Submit\" value=\"Add item\" class=\"save\"/></td>\n");
      out.write("            </tr>\n");
      out.write("        </table>\n");
      out.write("        \n");
      out.write("        \n");
      out.write("        <div type=\"clear:\" both;\"></div>\n");
      out.write("\n");
      out.write("    </form>\n");
      out.write("    \n");
      out.write("    \t\t\n");
      out.write("\t\t<p>\n");
      out.write("\t\t\t<a href=\"productControllerServlet\">Back to List product</a>\n");
      out.write("\t\t\n");
      out.write("\t\t</p>\n");
      out.write("         \n");
      out.write("    \n");
      out.write("</body>\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
