/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.52
 * Generated at: 2015-11-17 14:03:04 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.io.File;

public final class work2_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

String getDate(long num) {
		SimpleDateFormat sdf = new SimpleDateFormat("yyy-MM-dd hh-mm-ss");
		Date date = new Date(num);
		return sdf.format(date);
	}
  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

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

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("<script src=\"js/jquery-1.9.1.js\"></script>\r\n");
      out.write("<link rel=\"stylesheet\" href=\"css/layout.css\">\r\n");
      out.write("<title>Insert title here</title>\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("\t$(function() {\r\n");
      out.write("\r\n");
      out.write("\t\r\n");
      out.write("\r\n");
      out.write("\t\t$(\"tbody\").delegate(\"a\", \"click\", function() {\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t\t//var a = window.location.hash;\r\n");
      out.write("\t\t\tvar a = $(this).prop(\"id\");\r\n");
      out.write("\t\t\tvar str = a.replace(/\\\\/g, \"\\\\\\\\\");\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t//$(\".tables\").load(\"getFiles.jsp?path=\" + str);\r\n");
      out.write("\t\t\t$.ajax({\r\n");
      out.write("\t\t\t\turl : \"getFiles.jsp?path=\" + str,\r\n");
      out.write("\t\t\t\tcache : false,\r\n");
      out.write("\t\t\t\tsuccess : function(html) {\r\n");
      out.write("\t\t\t\t\t$(\".tabs\").children().remove();\r\n");
      out.write("\t\t\t\t\t$(\".tabs\").append(html);\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\t\t\t});\r\n");
      out.write("\r\n");
      out.write("\t\t});\r\n");
      out.write("\r\n");
      out.write("\t});\r\n");
      out.write("</script>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\t<div class=\"tables\">\r\n");
      out.write("\t\t<table>\r\n");
      out.write("\t\t\t<tbody class=\"tabs\">\r\n");
      out.write("\t\t\t\t<tr class=\"first\">\r\n");
      out.write("\t\t\t\t\t<th>文件名\r\n");
      out.write("\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t<th>大小\r\n");
      out.write("\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t<th>修改日期\r\n");
      out.write("\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t</tr>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t");

					File fie = new File("D:\\");
					File[] fies = fie.listFiles();

					for (int i = 0; i < fies.length; i++) {
						String src = "img/24.png";
						if (fies[i].isDirectory()) {
							src = "img/11.png";
						}
				
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t");
      out.write("\r\n");
      out.write("\t\t\t\t\t<td><img align='AbsMiddle' src=");
      out.print(src);
      out.write(" /><a\r\n");
      out.write("\t\t\t\t\t\thref=\"javascript:void(0)\" id=");
      out.print(fies[i].getAbsolutePath());
      out.write('>');
      out.print(fies[i].getName());
      out.write("</a></td>\r\n");
      out.write("\t\t\t\t\t<td><a>");
      out.print((int) Math.ceil(fies[i].length() / 1024.0));
      out.write("kb</a></td>\r\n");
      out.write("\t\t\t\t\t<td><a>");
      out.print(getDate(fies[i].lastModified()));
      out.write("</a></td>\r\n");
      out.write("\t\t\t\t</tr>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t");

					}
				
      out.write("\r\n");
      out.write("\t\t\t</tbody>\r\n");
      out.write("\t\t</table>\r\n");
      out.write("\r\n");
      out.write("\t\t<div class=\"texts\"></div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t</div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
