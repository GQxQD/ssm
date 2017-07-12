<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@page import="java.text.SimpleDateFormat"%>
<%@page import="cn.jbit.mybatisdemo.entity.Emp"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%
	List<Emp> list = (List<Emp>)request.getAttribute("empList");
%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>员工列表</title>
<link rel="stylesheet" href="https://cdn.bootcss.com/bootstrap/3.3.7/css/bootstrap.min.css" integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u" crossorigin="anonymous">
</head>
<body>
<div class="col-md-8 col-md-offset-2">
<table class="table table-hover table-striped">
	<caption class="h1 text-center">员工列表<small>（总员工数：<%=list.size() %>）</small></caption>
	<thead>
		<tr>
			<td colspan="10" class="bg-success">
				<a href="<%=request.getContextPath() %>/AddEmp" class="btn btn-success">添加员工</a>
			</td>
		</tr>
		<tr>
			<th>#</th><th>员工编号</th><th>员工姓名</th><th>入职时间</th><th>员工职位</th><th>员工工资</th><th>经理编号</th><th>奖金</th><th>部门编号</th>
			<th>操作</th>
		</tr>
	</thead>
	<tbody>
		<%
			for(int i = 0; i < list.size(); i++){
				Emp emp = list.get(i);
		%>
		<tr>
			<th><%=i+1 %></th>
			<td><%=emp.getEmpno() %></td>
			<td><%=emp.getEmpname() %></td>
			<td><%
				SimpleDateFormat sdf = new SimpleDateFormat("YYYY-MM-dd");
				out.print(sdf.format(emp.getHireDate()));
			%></td>
			<td><%=emp.getJob() %></td>
			<td><%=emp.getSalary() %></td>
			<td><%=emp.getMgr() %></td>
			<td><%=emp.getComm()==null?0:emp.getComm() %></td>
			<td><%=emp.getDeptNo() %></td>
			<td>
				<a class="btn btn-info">修改</a>
				<a class="btn btn-danger" href="<%=request.getContextPath() %>/deleteEmp?empno=<%=emp.getEmpno() %>">删除</a>
			</td>
		</tr>
		<%
			}
		%>
	</tbody>
</table>
</div>
</body>
</html>