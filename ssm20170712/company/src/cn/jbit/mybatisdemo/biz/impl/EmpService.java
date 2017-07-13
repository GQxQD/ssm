package cn.jbit.mybatisdemo.biz.impl;

import java.util.List;

import cn.jbit.mybatisdemo.biz.IEmpService;
import cn.jbit.mybatisdemo.dao.IEmpDao;
import cn.jbit.mybatisdemo.dao.impl.IEmpDaoImpl;
import cn.jbit.mybatisdemo.entity.Emp;

public class EmpService implements IEmpService {

	private IEmpDao empdao = new IEmpDaoImpl();

	@Override
	public List<Emp> selectAll() {
		return empdao.selectAll();
	}

	@Override
	public int countAll() {
		return empdao.countAll();
	}

	@Override
	public List<Emp> findEmpByExampleIf(Emp emp) {
		return empdao.findEmpByExampleIf(emp);
	}

	@Override
	public Emp selectOne() {
		return empdao.selectOne();
	}

	@Override
	public Emp selectByEmpno(int empno) {
		return empdao.selectByEmpno(empno);
	}

	@Override
	public int insertEmp(Emp emp) {
		return empdao.insertEmp(emp);
	}

	@Override
	public int deleteEmp(int empno) {
		return empdao.deleteEmp(empno);
	}

	@Override
	public int updateEmp(Emp emp) {
		return empdao.updateEmp(emp);
	}

}
