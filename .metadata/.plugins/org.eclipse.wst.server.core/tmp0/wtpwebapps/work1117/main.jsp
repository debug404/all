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
		request.setCharacterEncoding("utf-8");
		String username = request.getParameter("username");
		//String username = "hello";
	%>
	<%
		if (username.equals("admin")) {
	%>
	<jsp:forward page="admin.jsp"></jsp:forward>

	<%
		}
	%>
	<jsp:useBean id="user2" class="com.w.test.Users" scope="session"></jsp:useBean>
	<jsp:setProperty property="username" name="user2" value="<%=username%>" />
	员工管理系统${user2.username}
	<a href="login.jsp">返回</a>
</body>
</html>