<%@page import="java.util.Map"%>
<%@page import="java.util.HashMap"%>
<%@page import="java.util.ArrayList"%>
<%@page import="com.w.pojo.Student"%>
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
		Student stu1 = new Student("张飞", "28", "男");
		pageContext.setAttribute("stu1", stu1);
	%>
	${stu1.name}
	<%
		String name = ((Student) pageContext.findAttribute("stu1")).getName();
		out.print(name);
	%>
	<%
		ArrayList<Student> stus = new ArrayList<Student>();
		Student stu2 = new Student("张飞2", "281", "男");
		Student stu3 = new Student("张飞3", "282", "男");
		Student stu4 = new Student("张飞4", "283", "男");
		stus.add(stu2);
		stus.add(stu3);
		stus.add(stu4);
		pageContext.setAttribute("list", stus);
	%>
	<hr />
	${list}
	<hr />
	${list[0].name}
	<hr />
	${list[1].name}
	<hr />
	${list[2].name}

	<%
		Map<String, Student> stuMap = new HashMap<String, Student>();
		stuMap.put("2", stu2);
		stuMap.put("3", stu3);
		stuMap.put("4", stu4);
		pageContext.setAttribute("map", stuMap);
	%>
	<hr />
	${map }
	<hr />
	${map["2"].name }
	<hr />
	${map["3"].name }

</body>
</html>