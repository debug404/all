<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<jsp:include page="header.jsp"></jsp:include>
	<br />
	<form action="main.jsp" method="post">
		用户名:<jsp:element name="input">
			<jsp:attribute name="name">username</jsp:attribute>
			<jsp:attribute name="type">text</jsp:attribute>
			<jsp:attribute name="value">${user2.username}</jsp:attribute>
			<jsp:attribute name="placeholder">请输入用户名</jsp:attribute>	
		</jsp:element>

		<br /> 密码:<input type="password" name="password" /> <input
			type="submit" value="提交" />
	</form>
</body>
</html>