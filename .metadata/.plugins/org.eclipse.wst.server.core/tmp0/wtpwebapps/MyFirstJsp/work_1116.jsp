<%@page import="java.util.Date"%>
<%@page import="java.text.SimpleDateFormat"%>
<%@page import="java.io.File"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" href="css/layout.css">
<title>Insert title here</title>
</head>
<body>
	<table>
		<tr class="first">
			<th>文件名
			</td>
			<th>大小
			</td>
			<th>修改日期
			</td>
		</tr>

		<%!String getDate(long num) {
		SimpleDateFormat sdf = new SimpleDateFormat("yyy-MM-dd hh-mm-ss");
		Date date = new Date(num);
		return sdf.format(date);
	}%>

		<%
			File fie = new File("C:\\Program Files\\Java\\jdk1.7.0_80\\jre\\bin");
			File[] fies = fie.listFiles();

			for (int i = 0; i < fies.length; i++) {
				String src = "img/24.png";
				if (fies[i].isDirectory()) {
					src = "img/11.png";
				}
		%>
		<%!%>

		<tr>
			<td><img align='AbsMiddle' src=<%=src%>  /><a href="javascript:void(0)"><%=fies[i].getName()%></a></td>
			<td><a><%=(int) Math.ceil(fies[i].length() / 1024.0)%>kb</a></td>
			<td><a><%=getDate(fies[i].lastModified())%></a></td>
		</tr>

		<%
			}
		%>






	</table>

</body>
</html>