<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<jsp:include page="Head.jsp"></jsp:include>
	<%
		String path = request.getContextPath();
	%>
	<%--  <jsp:forward page="${path}/getInfo.jsp"></jsp:forward>--%>
	<%
		//request.getRequestDispatcher("Test.jsp?name=hello").forward(request, response);
	%>
	<%-- <jsp:forward page="Test.jsp">
		<jsp:param value="hello2" name="name" />
	</jsp:forward> --%>

</body>
</html>