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
		String name = "Hello World";
		pageContext.setAttribute("name1", "Hello World!");
		pageContext.setAttribute("name2", "Hello world2!", pageContext.REQUEST_SCOPE);
	%>

	<a><%=name%></a>
	<hr />
	<a>${name1}</a>
	<hr />
	<a>${requestScope.name2}</a>



</body>
</html>