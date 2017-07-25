<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core_rt" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>用户登录中心</title>
<!-- 最新版本的 Bootstrap 核心 CSS 文件 -->
<link rel="stylesheet" href="https://cdn.bootcss.com/bootstrap/3.3.7/css/bootstrap.min.css">
<style type="text/css">
	.container{
		margin-top:10px;
	}
</style>
</head>
<body>
	<div class="container col-md-6 col-md-offset-3 col-lg-4 col-lg-offset-4">
		<form action="" method="post">
		<div class="panel panel-primary">
			<div class="panel-heading">
				用户登录中心
			</div>
			<div class="panel-body">
				<div class="form-group">
					<label for="username">用户名</label>
					<input type="text" class="form-control" id="username" name="username" placeholder="username">
				</div>
				<div class="form-group">
					<label for="password">密码</label>
					<input type="password" class="form-control" id="password" name="password" placeholder="password">
				</div>
				<div class="form-group">
					<label for="identity">身份</label>
					<select class="form-control" name="identity" id="identity">
						<option value="user" >普通用户</option>
						<option value="student" >学生</option>
					</select>
				</div>
			</div>
			<div class="panel-footer clearfix">
				<button type="submit" class="btn btn-primary pull-right">登录</button>
				<a href="register.html" class="btn btn-default pull-left">注册</a>
			</div>
		</div>
		</form>
	</div>
</body>
</html>