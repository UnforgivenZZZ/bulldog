/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.0.M21
 * Generated at: 2017-07-20 21:07:53 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class admin_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

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
      response.setContentType("text/html; charset=UTF-8");
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
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("<title>Insert title here</title>\n");
      out.write("</head>\n");
      out.write("<link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css\">\n");
      out.write("\n");
      out.write("<body>\n");
      out.write("\n");
      out.write("\n");

	int id = session.getAttribute("admin_id")==null ? -1 : (Integer) session.getAttribute("admin_id");
	String admin = session.getAttribute("admin_name")==null ? "" : (String) session.getAttribute("admin_name");
	
	if(id == -1 || admin.equals("")){

      out.write("\n");
      out.write("<div class=\"container\">\n");
      out.write("    <div class=\"row\">\n");
      out.write("\t\t<div class=\"col-md-4 col-md-offset-4\">\n");
      out.write("    \t\t<div class=\"panel panel-default\">\n");
      out.write("\t\t\t  \t<div class=\"panel-heading\">\n");
      out.write("\t\t\t    \t<h3 class=\"panel-title\">Please sign in</h3>\n");
      out.write("\t\t\t \t</div>\n");
      out.write("\t\t\t  \t<div class=\"panel-body\">\n");
      out.write("\t\t\t    \t<form accept-charset=\"UTF-8\" role=\"form\">\n");
      out.write("                    <fieldset>\n");
      out.write("\t\t\t    \t  \t<div class=\"form-group\">\n");
      out.write("\t\t\t    \t\t    <input class=\"form-control\" placeholder=\"E-mail\" name=\"email\" type=\"text\">\n");
      out.write("\t\t\t    \t\t</div>\n");
      out.write("\t\t\t    \t\t<div class=\"form-group\">\n");
      out.write("\t\t\t    \t\t\t<input class=\"form-control\" placeholder=\"Password\" name=\"password\" type=\"password\" value=\"\">\n");
      out.write("\t\t\t    \t\t</div>\n");
      out.write("\t\t\t    \t\t<div class=\"checkbox\">\n");
      out.write("\t\t\t    \t    \t<label>\n");
      out.write("\t\t\t    \t    \t\t<input name=\"remember\" type=\"checkbox\" value=\"Remember Me\"> Remember Me\n");
      out.write("\t\t\t    \t    \t</label>\n");
      out.write("\t\t\t    \t    </div>\n");
      out.write("\t\t\t    \t\t<input class=\"btn btn-lg btn-success btn-block\" type=\"submit\" value=\"Login\">\n");
      out.write("\t\t\t    \t</fieldset>\n");
      out.write("\t\t\t      \t</form>\n");
      out.write("\t\t\t    </div>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</div>\n");
      out.write("\t</div>\n");
      out.write("</div>");
} 
      out.write('\n');
      out.write('\n');
      out.write('\n');
if(id > -1 && !admin.equals("")){ }
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<div class=\"container\">\n");
      out.write("    <div class=\"row\">    \n");
      out.write("        <div class=\"col-xs-12 col-md-6 col-md-offset-3 col-sm-8 col-sm-offset-2\">  \n");
      out.write("            <!-- image-preview-filename input [CUT FROM HERE]-->\n");
      out.write("            <div class=\"input-group image-preview\">\n");
      out.write("                <input type=\"text\" class=\"form-control image-preview-filename\" disabled=\"disabled\"> <!-- don't give a name === doesn't send on POST/GET -->\n");
      out.write("                <span class=\"input-group-btn\">\n");
      out.write("                    <!-- image-preview-clear button -->\n");
      out.write("                    <button type=\"button\" class=\"btn btn-default image-preview-clear\" style=\"display:none;\">\n");
      out.write("                        <span class=\"glyphicon glyphicon-remove\"></span> Clear\n");
      out.write("                    </button>\n");
      out.write("                    <!-- image-preview-input -->\n");
      out.write("                    <div class=\"btn btn-default image-preview-input\">\n");
      out.write("                        <span class=\"glyphicon glyphicon-folder-open\"></span>\n");
      out.write("                        <span class=\"image-preview-input-title\">Browse</span>\n");
      out.write("                        <input type=\"file\" accept=\"image/png, image/jpeg, image/gif\" name=\"input-file-preview\"/> <!-- rename it -->\n");
      out.write("                    </div>\n");
      out.write("                </span>\n");
      out.write("            </div><!-- /input-group image-preview [TO HERE]--> \n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("</div>\n");
      out.write("<script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js\"></script>\n");
      out.write("<script>\n");
      out.write("$(document).on('click', '#close-preview', function(){ \n");
      out.write("    $('.image-preview').popover('hide');\n");
      out.write("    // Hover befor close the preview\n");
      out.write("    $('.image-preview').hover(\n");
      out.write("        function () {\n");
      out.write("           $('.image-preview').popover('show');\n");
      out.write("        }, \n");
      out.write("         function () {\n");
      out.write("           $('.image-preview').popover('hide');\n");
      out.write("        }\n");
      out.write("    );    \n");
      out.write("});\n");
      out.write("\n");
      out.write("$(function() {\n");
      out.write("    // Create the close button\n");
      out.write("    var closebtn = $('<button/>', {\n");
      out.write("        type:\"button\",\n");
      out.write("        text: 'x',\n");
      out.write("        id: 'close-preview',\n");
      out.write("        style: 'font-size: initial;',\n");
      out.write("    });\n");
      out.write("    closebtn.attr(\"class\",\"close pull-right\");\n");
      out.write("    // Set the popover default content\n");
      out.write("    $('.image-preview').popover({\n");
      out.write("        trigger:'manual',\n");
      out.write("        html:true,\n");
      out.write("        title: \"<strong>Preview</strong>\"+$(closebtn)[0].outerHTML,\n");
      out.write("        content: \"There's no image\",\n");
      out.write("        placement:'bottom'\n");
      out.write("    });\n");
      out.write("    // Clear event\n");
      out.write("    $('.image-preview-clear').click(function(){\n");
      out.write("        $('.image-preview').attr(\"data-content\",\"\").popover('hide');\n");
      out.write("        $('.image-preview-filename').val(\"\");\n");
      out.write("        $('.image-preview-clear').hide();\n");
      out.write("        $('.image-preview-input input:file').val(\"\");\n");
      out.write("        $(\".image-preview-input-title\").text(\"Browse\"); \n");
      out.write("    }); \n");
      out.write("    // Create the preview image\n");
      out.write("    $(\".image-preview-input input:file\").change(function (){     \n");
      out.write("        var img = $('<img/>', {\n");
      out.write("            id: 'dynamic',\n");
      out.write("            width:250,\n");
      out.write("            height:200\n");
      out.write("        });      \n");
      out.write("        var file = this.files[0];\n");
      out.write("        var reader = new FileReader();\n");
      out.write("        // Set preview image into the popover data-content\n");
      out.write("        reader.onload = function (e) {\n");
      out.write("            $(\".image-preview-input-title\").text(\"Change\");\n");
      out.write("            $(\".image-preview-clear\").show();\n");
      out.write("            $(\".image-preview-filename\").val(file.name);            \n");
      out.write("            img.attr('src', e.target.result);\n");
      out.write("            $(\".image-preview\").attr(\"data-content\",$(img)[0].outerHTML).popover(\"show\");\n");
      out.write("        }        \n");
      out.write("        reader.readAsDataURL(file);\n");
      out.write("    });  \n");
      out.write("});\n");
      out.write("</script>\n");
      out.write("\t\n");
      out.write("\n");
      out.write("\t\n");
      out.write("</body>\n");
      out.write("\n");
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
