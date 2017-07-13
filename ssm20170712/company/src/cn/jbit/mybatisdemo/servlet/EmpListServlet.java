package cn.jbit.mybatisdemo.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import cn.jbit.mybatisdemo.dao.IEmpDao;
import cn.jbit.mybatisdemo.dao.impl.IEmpDaoImpl;
import cn.jbit.mybatisdemo.entity.Emp;

@SuppressWarnings("serial")
public class EmpListServlet extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.setCharacterEncoding("utf-8");
		String empno = req.getParameter("empno");
		String empname = req.getParameter("empname");
		System.out.println(empno);
		System.out.println(empname);
		Emp emp = new Emp();
		if (empno != null && !"".equals(empno)) {
			emp.setEmpno(Integer.parseInt(empno));
		}
		if (empname != null && !"".equals(empname)) {
			emp.setEmpname(empname);
		}
		System.out.println(emp.getEmpno());
		IEmpDao empDao = new IEmpDaoImpl();
		List<Emp> list = empDao.findEmpByExampleIf(emp);
		req.setAttribute("empList", list);
		req.getRequestDispatcher("/WEB-INF/jsp/EmpList.jsp").forward(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		this.doGet(req, resp);
	}
}
