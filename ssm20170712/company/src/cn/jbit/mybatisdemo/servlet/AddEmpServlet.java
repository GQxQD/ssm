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
public class AddEmpServlet extends HttpServlet {

	private IEmpService empService;

	public AddEmpServlet() {
		if (this.empService == null) {
			this.empService = new EmpService();
			System.out.println("new EmpService...");
		}
	}

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.getRequestDispatcher("/WEB-INF/jsp/AddEmp.jsp").forward(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html;charset=utf8");
		req.setCharacterEncoding("utf-8");
		try {
			String empname = req.getParameter("empname");
			if (empname == null || "".equals(empname)) {
				throw new Exception("员工名称不能为空！");
			}
			Emp emp = new Emp();
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
			System.out.println("hi" + hireDate);
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
			this.empService.insertEmp(emp);
			resp.sendRedirect("EmpList");
		} catch (Exception e) {
			e.printStackTrace();
			resp.getWriter()
					.print("<script>alert(\"添加错误！\\\n" + e.getMessage() + "\");window.history.go(-1);</script>");
			return;
		}
	}
}
