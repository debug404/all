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
		String username = request.getParameter("username");
	%>
	<%
		if (username.equals("admin")) {
	%>
	<jsp:forward page="admin.jsp"></jsp:forward>

	<%
		}
	%>
	员工管理系统<%=username%><a href="login.jsp?username=<%=username%>">返回</a>
	
</body>
</html>