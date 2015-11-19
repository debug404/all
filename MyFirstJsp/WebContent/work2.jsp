<%@page import="java.util.Date"%>
<%@page import="java.text.SimpleDateFormat"%>
<%@page import="java.io.File"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<script src="js/jquery-1.9.1.js"></script>
<link rel="stylesheet" href="css/layout.css">
<title>Insert title here</title>
<script type="text/javascript">
	$(function() {

	

		$("tbody").delegate("a", "click", function() {
		
			//var a = window.location.hash;
			var a = $(this).prop("id");
			var str = a.replace(/\\/g, "\\\\");
			
			//$(".tables").load("getFiles.jsp?path=" + str);
			$.ajax({
				url : "getFiles.jsp?path=" + str,
				cache : false,
				success : function(html) {
					$(".tabs").children().remove();
					$(".tabs").append(html);
				}
			});

		});

	});
</script>
</head>
<body>
	<div class="tables">
		<table>
			<tbody class="tabs">
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
					File fie = new File("D:\\");
					File[] fies = fie.listFiles();

					for (int i = 0; i < fies.length; i++) {
						String src = "img/24.png";
						if (fies[i].isDirectory()) {
							src = "img/11.png";
						}
				%>


				<tr>
					<%-- <td><img align='AbsMiddle' src=<%=src%> /><a
						href="work2.jsp#path=<%=fies[i].getAbsolutePath()%> "><%=fies[i].getName()%></a></td> --%>
					<td><img align='AbsMiddle' src=<%=src%> /><a
						href="javascript:void(0)" id=<%=fies[i].getAbsolutePath()%>><%=fies[i].getName()%></a></td>
					<td><a><%=(int) Math.ceil(fies[i].length() / 1024.0)%>kb</a></td>
					<td><a><%=getDate(fies[i].lastModified())%></a></td>
				</tr>

				<%
					}
				%>
			</tbody>
		</table>

		<div class="texts"></div>



	</div>


</body>
</html>