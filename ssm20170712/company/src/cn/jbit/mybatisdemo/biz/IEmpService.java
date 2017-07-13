package cn.jbit.mybatisdemo.biz;

import java.util.List;

import cn.jbit.mybatisdemo.entity.Emp;

public interface IEmpService {

	List<Emp> selectAll();

	int countAll();

	List<Emp> findEmpByExampleIf(Emp emp);

	Emp selectOne();

	Emp selectByEmpno(int empno);

	int insertEmp(Emp emp);

	int deleteEmp(int empno);

	int updateEmp(Emp emp);
}
