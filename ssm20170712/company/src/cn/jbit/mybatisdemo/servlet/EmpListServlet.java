package cn.jbit.mybatisdemo.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import cn.jbit.mybatisdemo.biz.IEmpService;
import cn.jbit.mybatisdemo.biz.impl.EmpService;
import cn.jbit.mybatisdemo.entity.Emp;

@SuppressWarnings("serial")
public class EmpListServlet extends HttpServlet {

	private IEmpService empService;

	public EmpListServlet() {
		if (this.empService == null) {
			this.empService = new EmpService();
			System.out.println("new EmpService...");
		}
	}

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.setCharacterEncoding("utf8");
		resp.setContentType("text/html;charset=utf-8");
		String empno = req.getParameter("empno");
		String empname = req.getParameter("empname");
		Emp emp = new Emp();
		if (empno != null && !"".equals(empno)) {
			emp.setEmpno(Integer.parseInt(empno));
		}
		if (empname != null && !"".equals(empname)) {
			emp.setEmpname(empname);
		}
		List<Emp> list = this.empService.findEmpByExampleIf(emp);
		req.setAttribute("empList", list);
		req.getRequestDispatcher("/WEB-INF/jsp/EmpList.jsp").forward(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		this.doGet(req, resp);
	}
}
