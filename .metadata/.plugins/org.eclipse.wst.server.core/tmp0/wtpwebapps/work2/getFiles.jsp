<%@page import="java.io.FileInputStream"%>
<%@page import="java.util.Date"%>
<%@page import="java.text.SimpleDateFormat"%>
<%@page import="java.io.File"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%!String getDate(long num) {
		SimpleDateFormat sdf = new SimpleDateFormat("yyy-MM-dd hh-mm-ss");
		Date date = new Date(num);
		return sdf.format(date);
	}%>
<%
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
%>
