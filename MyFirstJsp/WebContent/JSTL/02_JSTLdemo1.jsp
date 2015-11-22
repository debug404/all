<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>

	<%--set保存数据到域中, 默认是page域 --%>
	<c:set var="name" value="hello" scope="request"></c:set>
	${requestScope.name}

	<%-- 
	default:当value值为null时,使用默认值
	escapeXml:是否对value值进行转义,false不转义,true转义
	
	 --%>
	<c:out value="${requestScope.name}" default="123"></c:out>


	<%--if-单条件判断
		empty 判断是否为空
	 --%>
	<c:if test="${10>5 }">
	条件成立
	</c:if>
	<hr />
	<%--多条件判断 --%>
	<c:choose>
		<c:when test="${1==4 }">1</c:when>
		<c:when test="${1==2 }">3</c:when>
		<c:when test="${1==33 }">5</c:when>
		<c:otherwise>333</c:otherwise>
	</c:choose>

	<%
		String strArr[] = new String[10];
		ArrayList<String> arr = new ArrayList<String>();
		for (int i = 0; i < 10; i++) {
			arr.add(i + "");
			strArr[i] = "" + i;
		}
		pageContext.setAttribute("arr", arr);
		pageContext.setAttribute("strArr", strArr);
	%>
	<hr />
	<%--循环遍历 
	begin="0":开始位置 默认0开始
	end="10":结束位置 默认到最后一个
	step="":步长	默认1
	items="":需要遍历的数据(集合)
	 var="":每个元素的名称
	 varStatus=""当前正在遍历元素的状态
	
	--%>
	<c:forEach items="${arr }" var="ss" varStatus="varStr">
	${ss}
	
	</c:forEach>
	<hr />
	<c:forEach items="${strArr }" var="s" varStatus="varStr">
	${s}
	
	</c:forEach>
	<hr />
	<%
		String arrs = "hello-world-123";
		pageContext.setAttribute("arrs", arrs);
	%>
	<c:forTokens items="${arrs }" delims="-" var="s">

		${s }
	</c:forTokens>
	
	<hr/>
	<c:redirect url="Test.jsp?name=999"></c:redirect>
	
	


	<%-- 
	
	
	
	<c:forTokens items="" delims=""></c:forTokens>
	<c:redirect></c:redirect> --%>




</body>
</html>