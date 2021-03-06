<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@page import="java.text.SimpleDateFormat"%>
<%@page import="cn.jbit.mybatisdemo.entity.Emp"%>
<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%
Emp emp = (Emp)request.getAttribute("emp");
if(emp==null){
	out.print("<script>alert('用户不存在！');window.location.href='EmpList';</script>");
}
%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>员工修改</title>
<link rel="stylesheet" href="https://cdn.bootcss.com/bootstrap/3.3.7/css/bootstrap.min.css" integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u" crossorigin="anonymous">
<script type="text/javascript" src="<%=request.getContextPath() %>/static/jedate/jedate.js"></script>
</head>
<body>
<div class="col-md-4 col-md-offset-4 col-sm-6 col-sm-offset-3">
<form method="post">
	<table class="table table-striped">
		<caption class="h1 text-center">员工修改</caption>
		<tr>
			<td colspan="2" class="bg-success">
				<a href="<%=request.getContextPath() %>/EmpList" class="btn btn-success">查看所有员工</a>
			</td>
		</tr>
		<tr>
			<th>员工编号</th>
			<td>
				<input class="form-control" type="text" name="empno" value="<%=emp.getEmpno() %>" readonly="readonly"/>
			</td>
		</tr>
		<tr>
			<th>员工姓名</th>
			<td>
				<input class="form-control" type="text" name="empname" value="<%=emp.getEmpname() %>"/>
			</td>
		</tr>
		<tr>
			<th>入职时间</th>
			<td>
				<input class="form-control" type="text" name="hireDate" id="hireDate" style="cursor: pointer;" readOnly value="<%
					if(emp.getHireDate()!=null){
						SimpleDateFormat sdf= new SimpleDateFormat("YYYY-MM-dd");
						out.print(sdf.format(emp.getHireDate()));
					}
				%>"/>
			</td>
		</tr>
		<tr>
			<th>员工职位</th>
			<td>
				<input class="form-control" type="text" name="job" value="<%=emp.getJob() %>"/>
			</td>
		</tr>
		<tr>
			<th>员工工资</th>
			<td>
				<input class="form-control" type="text" name="salary" value="<%=emp.getSalary()==null?0:emp.getSalary() %>"/>
			</td>
		</tr>
		<tr>
			<th>经理编号</th>
			<td>
				<input class="form-control" type="text" name="mgr" value="<%=emp.getMgr()==null?0:emp.getMgr() %>"/>
			</td>
		</tr>
		<tr>
			<th>奖金</th>
			<td>
				<input class="form-control" type="text" name="comm" value="<%=emp.getComm()==null?0:emp.getComm() %>"/>
			</td>
		</tr>
		<tr>
			<th>部门编号</th>
			<td>
				<input class="form-control" type="text" name="deptNo" value="<%=emp.getDeptNo()==null?0:emp.getDeptNo() %>"/>
			</td>
		</tr>
		<tr>
			<td colspan="2" class="text-center">
				<input class="btn btn-success form-control" type="submit" value="修改"/>
			</td>
		</tr>
	</table>
</form>
</div>
<script type="text/javascript">
jeDate({
	dateCell:"#hireDate",//isinitVal:true,
	format:"YYYY-MM-DD",
	isTime:false, //isClear:false,
})
</script>
</body>
</html>