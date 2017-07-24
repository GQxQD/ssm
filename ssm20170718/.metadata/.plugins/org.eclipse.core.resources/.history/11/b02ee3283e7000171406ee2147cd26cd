<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core_rt" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Student List</title>
<!-- 最新版本的 Bootstrap 核心 CSS 文件 -->
<link rel="stylesheet" href="https://cdn.bootcss.com/bootstrap/3.3.7/css/bootstrap.min.css">
<style type="text/css">
	.container{
		margin-top: 10px;
	}
</style>
<%-- <link href="<%=request.getContextPath() %>/static/css/test.css" rel="stylesheet"> --%>
</head>
<body>
<div class="container">
	<div class="clearfix">
		<a class="btn btn-success pull-right" href="?"><span class="glyphicon glyphicon-search"></span> Select All</a>
		<form action="" class="form-inline pull-right">
			<input type="text" name="id" class="form-control" placeHolder="Enter a student id!">
			<button type="submit" class="form-control btn btn-primary">search</button>
		</form>
	</div>
	<hr class="bg-danger">
	<table class="table table-hover">
		<caption class="text-center">Student List<small> (${studentList.size() }) </small></caption>
		<thead>
			<tr>
				<td>id</td>			
				<td>name</td>			
				<td>password</td>			
				<td>age</td>			
				<td>gender</td>			
				<td>email</td>			
				<td>phone</td>			
				<td>create_time</td>			
			</tr>
		</thead>
		<tbody>
		<c:forEach items="${studentList}" var="student">
			<tr>
				<th>#${student.id }</th>
				<td>${student.name }</td>
				<td>${student.password }</td>
				<td>${student.age }</td>
				<td>${student.gender }</td>
				<td>${student.email }</td>
				<td>${student.phone }</td>
				<td><fmt:formatDate value="${student.create_time }" pattern="yyyy-MM-dd HH:mm:ss"/></td>
			</tr>	
		</c:forEach>
		</tbody>
	</table>
</div>
</body>
</html>