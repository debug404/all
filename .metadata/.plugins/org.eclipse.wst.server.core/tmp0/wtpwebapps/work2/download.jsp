<%@page import="java.io.*"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
	request.setCharacterEncoding("UTF-8");
	String f = request.getParameter("path");
	String path = new String(f.getBytes("ISO8859-1"), "UTF-8");
	File fie = new File(path);
	response.setContentType("application/octet-stream");
	response.setHeader("Content-Disposition",
			"attachment;filename=" + new String(fie.getName().getBytes("utf-8"), "ISO8859-1"));

	FileInputStream input = new FileInputStream(fie);
	ServletOutputStream outStream = response.getOutputStream();
	int len = 0;
	byte[] by = new byte[2048];

	while ((len = input.read(by)) > 0) {
		outStream.write(by);

	}
	outStream.flush();
	outStream.close();
	input.close();
	out.clear();
	out = pageContext.pushBody();
	%>
</body>
</html>