<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>添加员工</title>
<link rel="stylesheet" href="https://cdn.bootcss.com/bootstrap/3.3.7/css/bootstrap.min.css" integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u" crossorigin="anonymous">
<script type="text/javascript" src="<%=request.getContextPath() %>/static/jedate/jedate.js"></script>
</head>
<body>
<div class="col-md-4 col-md-offset-4 col-sm-6 col-sm-offset-3">
<form method="post">
	<table class="table table-striped">
		<caption class="h1 text-center">添加员工</caption>
		<tr>
			<td colspan="2" class="bg-success">
				<a href="<%=request.getContextPath() %>/EmpList" class="btn btn-success">查看所有员工</a>
			</td>
		</tr>
		<tr>
			<th>员工姓名</th>
			<td>
				<input class="form-control" type="text" name="empname"/>
			</td>
		</tr>
		<tr>
			<th>入职时间</th>
			<td>
				<input class="form-control" type="text" name="hireDate" id="hireDate" style="cursor: pointer;" readOnly/>
			</td>
		</tr>
		<tr>
			<th>员工职位</th>
			<td>
				<input class="form-control" type="text" name="job"/>
			</td>
		</tr>
		<tr>
			<th>员工工资</th>
			<td>
				<input class="form-control" type="text" name="salary"/>
			</td>
		</tr>
		<tr>
			<th>经理编号</th>
			<td>
				<input class="form-control" type="text" name="mgr"/>
			</td>
		</tr>
		<tr>
			<th>奖金</th>
			<td>
				<input class="form-control" type="text" name="comm"/>
			</td>
		</tr>
		<tr>
			<th>部门编号</th>
			<td>
				<input class="form-control" type="text" name="deptNo"/>
			</td>
		</tr>
		<tr>
			<td colspan="2" class="text-center">
				<input class="btn btn-primary" type="submit" value="添加"/>
				<input class="btn btn-default" type="reset" value="重置"/>
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