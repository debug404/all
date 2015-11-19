<%@page import="java.util.Date"%>
<%@page import="java.text.SimpleDateFormat"%>
<%@page import="java.io.File"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>

<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport"
	content="width=device-width, initial-scale=1,user-scalable=no">
<!-- 上述3个meta标签*必须*放在最前面，任何其他内容都*必须*跟随其后！ -->
<title>主页</title>
<!-- Bootstrap -->
<meta charset="utf-8">

<link rel="stylesheet" type="text/css"
	href="jquery-easyui-1.4.4/themes/default/easyui.css">
<link rel="stylesheet" type="text/css"
	href="jquery-easyui-1.4.4/themes/icon.css">
<!--<script type="text/javascript" src="jquery-easyui-1.4.4/jquery.min.js"></script>-->
<script src="js/jquery-1.11.3.min.js" type="text/javascript"
	charset="utf-8"></script>
<script type="text/javascript"
	src="jquery-easyui-1.4.4/jquery.easyui.min.js"></script>
<script src="bootstrap-3.3.5-dist/js/bootstrap.min.js"
	type="text/javascript" charset="utf-8"></script>
<link rel="stylesheet" type="text/css"
	href="bootstrap-3.3.5-dist/css/bootstrap.min.css" />
<link rel="stylesheet" type="text/css" href="css/layout_index.css" />
<script type="text/javascript" src="js/index.js"></script>
<!--HTML5 shim and Respond.js for IE8 support of HTML5 elements and media queries-->
<!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
<!--[if lt IE 9]>
      <script src="//cdn.bootcss.com/html5shiv/3.7.2/html5shiv.min.js"></script>
      <script src="//cdn.bootcss.com/respond.js/1.4.2/respond.min.js"></script>
    <![endif]-->


</head>

<body>
	<%
		request.setCharacterEncoding("utf-8");
		String fileadd = config.getServletContext().getInitParameter("file");
	%>


	<div class="navbar navbar-default  navbar-fixed-top">

		<div class="navbar-header">
			<span class="navbar-brand"> Andriod班网盘 </span>
		</div>

		<div class="col-lg-offset-5 col-lg-2">
			<form class="navbar-form" role="search">

				<div class="form-group">

					<div class="input-group">

						<input type="text" class="form-control " name="searchs"
							id="searchs" placeholder="文章.标题.内容" /> <span
							class="input-group-btn"> <input type="button"
							class="btn btn-default" value="搜索" />
						</span>
					</div>
				</div>

			</form>
		</div>




		<div class="dright">

			<ul class="nav navbar-nav ">

				<li><a href="javascript:void(0)"><span class="user">
							<%
								Object user = session.getAttribute("username");
								if (user != null) {
									String userStr = (String) user;
									out.println(userStr);
								} else {
									response.sendRedirect("login.jsp");
								}
							%>
					</span> </a></li>
				<li><a href="javascript:void(0)">会员中心</a></li>
				<li><a href="javascript:void(0)">客户端下载</a></li>
				<li><a href="javascript:void(0)">通知</a></li>

			</ul>

		</div>

	</div>

	<div class="contain">
		<div class="row">
			<div class="col-lg-offset-1 col-lg-3">
				<div class="panel panel-default">
					<div class="panel-body tree">
						<ul id="tt"></ul>
					</div>
				</div>

			</div>
			<div class="col-lg-7">
				<div class="panel panel-default">
					<div class="panel-body">
						<button class="btn btn-primary" type="button" name="upload"
							id="upload">
							<span class="glyphicon glyphicon-open"> </span>上传文件
						</button>
						<button class="btn btn-default create" type="button" name="create"
							id="create">
							<span class="glyphicon glyphicon-plus"> </span>新建文件夹
						</button>
						<div class="text">
							<a class="backIndex" href="javascript:void(0)">全部文件</a> <a
								class="back" href="javascript:void(0)">返回上级</a> 
								<a href="javascript:void(0)" class="thisLoc"></a>
						</div>

						<div class="tables">
							<table>
								<tbody class="tabs" address=<%=fileadd%>>

								</tbody>
							</table>

							<div class="texts"></div>



						</div>


					</div>
				</div>

			</div>

		</div>

	</div>
<!--模态窗口-->
		<div id="wids" class="modal fade" role="dialog" aria-labelledby="myTextarea">
			<div class="modal-dialog">
				<div class="modal-content">

				</div>

			</div>

		</div>

</body>

</html>