package cn.jbit.mybatisdemo.servlet;

import java.io.IOException;
import java.text.SimpleDateFormat;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import cn.jbit.mybatisdemo.biz.IEmpService;
import cn.jbit.mybatisdemo.biz.impl.EmpService;
import cn.jbit.mybatisdemo.entity.Emp;

@SuppressWarnings("serial")
public class UpdateEmpServlet extends HttpServlet {

	private IEmpService empService;

	public UpdateEmpServlet() {
		if (this.empService == null) {
			this.empService = new EmpService();
		}
	}

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String empno = req.getParameter("empno");
		resp.setContentType("text/html;charset=utf-8");
		if (empno == null) {
			resp.getWriter().print("<script>alert(\"员工编号不能为空！\");window.history.go(-1);</script>");
		} else {
			try {
				Emp emp = this.empService.selectByEmpno(Integer.parseInt(empno));
				req.setAttribute("emp", emp);
				req.getRequestDispatcher("/WEB-INF/jsp/UpdateEmp.jsp").forward(req, resp);
			} catch (Exception e) {
				resp.getWriter().print("<script>alert(\"读取数据出现错误！\");window.history.go(-1);</script>");
				return;
			}
		}
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html;charset=utf8");
		req.setCharacterEncoding("utf-8");
		try {
			String empno = req.getParameter("empno");
			if (empno == null || "".equals(empno)) {
				throw new Exception("员工编号不能为空！");
			}
			String empname = req.getParameter("empname");
			if (empname == null || "".equals(empname)) {
				throw new Exception("员工名称不能为空！");
			}
			Emp emp = this.empService.selectByEmpno(Integer.parseInt(empno));
			if (emp == null) {
				throw new Exception("该员工不存在！");
			}
			emp.setEmpname(empname);
			emp.setJob(req.getParameter("job"));
			String comm = req.getParameter("comm");
			if (comm != null && !comm.equals("")) {
				emp.setComm(Double.valueOf(comm));
			}
			String deptNo = req.getParameter("deptNo");
			if (deptNo != null && !"".equals(deptNo)) {
				emp.setDeptNo(Integer.parseInt(deptNo));
			}
			String hireDate = req.getParameter("hireDate");
			if (hireDate != null && !"".equals(hireDate)) {
				SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
				emp.setHireDate(sdf.parse(hireDate));
			}
			String mgr = req.getParameter("mgr");
			if (mgr != null && !"".equals(mgr)) {
				emp.setMgr(Integer.parseInt(mgr));
			}
			String salary = req.getParameter("salary");
			if (salary != null && !"".equals(salary)) {
				emp.setSalary(Double.valueOf(salary));
			}
			this.empService.updateEmp(emp);
			resp.getWriter().print("<script>alert(\"修改成功！\");window.location.href='EmpList';</script>");
		} catch (Exception e) {
			resp.getWriter()
					.print("<script>alert(\"修改错误！\\\n" + e.getMessage() + "\");window.history.go(-1);</script>");
			return;
		}
	}
}
