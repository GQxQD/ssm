package cn.jbit.mybatisdemo.test;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import cn.jbit.mybatisdemo.dao.IEmpDao;
import cn.jbit.mybatisdemo.dao.impl.IEmpDaoImpl;
import cn.jbit.mybatisdemo.entity.Emp;

public class TestEmp {

	public static void main(String[] args) {
		selectEmps();
		findEmpByExampleIf();
	}

	public static void findEmpByExampleIf() {
		System.out.println("-------------findEmpByExampleIf-------------");
		IEmpDao empDao = new IEmpDaoImpl();
		Emp emp1 = new Emp();
		emp1.setDeptNo(10086);
//		emp1.setEmpname("李");
		List<Emp> list = empDao.findEmpByExampleIf(emp1);
		System.out.println("员工编号\t员工姓名\t入职时间\t员工职位\t员工工资\t经理编号\t奖金\t部门编号");
		for (Emp emp : list) {
			SimpleDateFormat sdf = new SimpleDateFormat("YYYY-MM-dd");
			String date = sdf.format(emp.getHireDate());
			System.out.println(emp.getEmpno() + "\t" + emp.getEmpname() + "\t"
					+ date + "\t" + emp.getJob() + "\t" + emp.getSalary()
					+ "\t" + emp.getMgr() + "\t" + emp.getComm() + "\t"
					+ emp.getDeptNo());
		}
		System.out.println("---------------------------------------");
	}

	public static void countAll() {
		System.out.println("-------------countAll-------------");
		IEmpDao empDao = new IEmpDaoImpl();
		int count = empDao.countAll();
		System.out.println("员工总人数为：" + count);
		System.out.println("---------------------------------------");
	}

	public static void updateEmp() {
		System.out.println("-------------updateEmp-------------");
		IEmpDao empDao = new IEmpDaoImpl();
		Emp emp = empDao.selectByEmpno(7935);
		emp.setEmpname("李四");
		empDao.updateEmp(emp);
		System.out.println("---------------------------------------");
	}

	public static void deleteEmpByNo(int empno) {
		System.out.println("-------------deleteEmpByNo-------------");
		IEmpDao empDao = new IEmpDaoImpl();
		System.out.println(empDao.deleteEmp(empno) == 1 ? "删除成功！" : "没有删除内容！");
		System.out.println("---------------------------------------");
	}

	public static void selectEmps() {
		System.out.println("-------------selectOneEmp-------------");
		IEmpDao empDao = new IEmpDaoImpl();
		List<Emp> list = empDao.selectAll();
		System.out.println("员工编号\t员工姓名\t入职时间\t员工职位\t员工工资\t经理编号\t奖金\t部门编号");
		for (Emp emp : list) {
			SimpleDateFormat sdf = new SimpleDateFormat("YYYY-MM-dd");
			String date = sdf.format(emp.getHireDate());
			System.out.println(emp.getEmpno() + "\t" + emp.getEmpname() + "\t"
					+ date + "\t" + emp.getJob() + "\t" + emp.getSalary()
					+ "\t" + emp.getMgr() + "\t" + emp.getComm() + "\t"
					+ emp.getDeptNo());
		}
		System.out.println("---------------------------------------");
	}

	public static void selectOneEmp() {
		System.out.println("-------------selectOneEmp-------------");
		System.out.println("员工编号\t员工姓名\t入职时间\t员工职位\t员工工资\t经理编号\t奖金\t部门编号");
		IEmpDao empDao = new IEmpDaoImpl();
		Emp emp = empDao.selectOne();
		SimpleDateFormat sdf = new SimpleDateFormat("YYYY-MM-dd");
		String date = sdf.format(emp.getHireDate());
		System.out.println(emp.getEmpno() + "\t" + emp.getEmpname() + "\t"
				+ date + "\t" + emp.getJob() + "\t" + emp.getSalary() + "\t"
				+ emp.getMgr() + "\t" + emp.getComm() + "\t" + emp.getDeptNo());
		System.out.println("---------------------------------------");
	}

	public static void selectEmpByNo(int empno) {
		System.out.println("-------------selectEmpByNo-------------");
		System.out.println("员工编号\t员工姓名\t入职时间\t员工职位\t员工工资\t经理编号\t奖金\t部门编号");
		IEmpDao empDao = new IEmpDaoImpl();
		Emp emp = empDao.selectByEmpno(empno);
		SimpleDateFormat sdf = new SimpleDateFormat("YYYY-MM-dd");
		String date = sdf.format(emp.getHireDate());
		System.out.println(emp.getEmpno() + "\t" + emp.getEmpname() + "\t"
				+ date + "\t" + emp.getJob() + "\t" + emp.getSalary() + "\t"
				+ emp.getMgr() + "\t" + emp.getComm() + "\t" + emp.getDeptNo());
		System.out.println("---------------------------------------");
	}

	public static void insertEmp() {
		System.out.println("-------------insertEmp-------------");
		IEmpDao empDao = new IEmpDaoImpl();
		Emp emp2 = new Emp();
		emp2.setEmpname("张三");
		emp2.setComm(3.14);
		emp2.setDeptNo(10086);
		emp2.setHireDate(new Date());
		emp2.setJob("程序猿");
		emp2.setSalary(520.0);
		emp2.setMgr(10010);
		empDao.insertEmp(emp2);
		System.out.println(emp2.getEmpno());
		System.out.println("---------------------------------------");
	}

}