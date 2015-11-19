<%@page import="java.io.File"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%
	String f = request.getParameter("path");
	String name = request.getParameter("name");
	String path = new String(name.getBytes("ISO8859-1"), "UTF-8");
	File fie = new File(f + "\\" + path);
	fie.mkdirs();
%>
