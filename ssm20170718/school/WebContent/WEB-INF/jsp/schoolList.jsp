<%@page import="cn.gqxqd.entity.School"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core_rt" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%
	List<School> list = (List<School>)request.getAttribute("list");
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Insert title here</title>
</head>
<body>
	<h1>SchoolList</h1>
	<a href="?name=kohai&c=${count+1}">click!</a>
	<hr>
	<h1>${name}</h1>
	<h1>${count}</h1>
	<c:if test="${list!=null && list.size()!=0}">
	<table border="1">
		<tr>
			<th>学校编号</th>
			<th>学校名称</th>
			<th>学校地址</th>
			<th>开学日期</th>
		</tr>
		<c:forEach items="${list}" var="item">
		<tr>
			<td>${item.id}</td>
			<td>${item.name}</td>
			<td>${item.address}</td>
			<td>
				<fmt:formatDate value="${item.schoolDate}" pattern="YYYY-MM-dd HH:mm:ss"/>
			</td>
		</tr>
		</c:forEach>
	</table>
	</c:if>
</body>
</html>