/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.52
 * Generated at: 2015-11-19 00:31:51 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.io.FileInputStream;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.io.File;

public final class getFiles_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\r\n");
      out.write("\r\n");
      out.write('\r');
      out.write('\n');

	request.setCharacterEncoding("utf-8");
	String tables = "";
	String path1 = request.getParameter("path");
	
	String path = new String(path1.getBytes("ISO8859-1"), "UTF-8");
	System.out.println(path);
	File fie = new File(path);
	if (fie.isDirectory()) {
		File[] fies = fie.listFiles();

		for (int i = 0; i < fies.length; i++) {
			String src = "img/11.png";
			if (fies[i].isFile()) {
				src = "img/24.png";
			}

			tables = tables + "<tr><td><img align=AbsMiddle src=" + src + " />" + "<a tag=" + path
					+ " class='open' href=javascript:void(0) id=" + fies[i].getAbsolutePath() + "  >"
					+ fies[i].getName() + "</a></td>" + "<td><a>" + (int) Math.ceil(fies[i].length() / 1024.0)
					+ "kb</a></td>" + "<td><a>" + getDate(fies[i].lastModified()) + "</a></td></tr>";
		}

		String srcs = "<tr class=first><th>文件名</th><th>大小</th><th>修改日期</th></tr>" + tables;

		out.println(srcs);
	}

	else {
		out.print("download");
		

	}

      out.write('\r');
      out.write('\n');
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
