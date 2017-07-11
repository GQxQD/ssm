package cn.jbit.mybatisdemo.dao.impl;

import java.util.ArrayList;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import cn.jbit.mybatisdemo.dao.IEmpDao;
import cn.jbit.mybatisdemo.entity.Emp;

public class IEmpDaoImpl implements IEmpDao {

	public List<Emp> selectAll() {
		SqlSession session = MyBatisUtil.getSession();
		List<Emp> list = new ArrayList<Emp>();
		try {
			list = session
					.selectList("cn.jbit.mybatisdemo.dao.IEmpDao.selectAll");
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			MyBatisUtil.closeSession();
		}
		return list;
	}

	public Emp selectOne() {
		SqlSession session = MyBatisUtil.getSession();
		Emp emp = null;
		try {
			emp = session
					.selectOne("cn.jbit.mybatisdemo.dao.IEmpDao.selectOne");
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			MyBatisUtil.closeSession();
		}
		return emp;
	}

	public Emp selectByEmpno(int empno) {
		SqlSession session = MyBatisUtil.getSession();
		Emp emp = null;
		try {
			emp = session.selectOne(
					"cn.jbit.mybatisdemo.dao.IEmpDao.selectByEmpno", empno);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			MyBatisUtil.closeSession();
		}
		return emp;
	}

	public int insertEmp(Emp emp) {
		int result = -1;
		SqlSession session = MyBatisUtil.getSession();
		try {
			result = session.insert(
					"cn.jbit.mybatisdemo.dao.IEmpDao.insertEmp", emp);
			session.commit();
		} catch (Exception e) {
			System.out.println("插入失败！");
		} finally {
			MyBatisUtil.closeSession();
		}
		return result;
	}

	public int deleteEmp(int empno) {
		int result = -1;
		SqlSession session = MyBatisUtil.getSession();
		try {
			result = session.delete(
					"cn.jbit.mybatisdemo.dao.IEmpDao.deleteEmp", empno);
			session.commit();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			MyBatisUtil.closeSession();
		}
		return result;
	}

	public int updateEmp(Emp emp) {
		int result = -1;
		SqlSession session = MyBatisUtil.getSession();
		try {
			result = session.update(
					"cn.jbit.mybatisdemo.dao.IEmpDao.updateEmp", emp);
			session.commit();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			MyBatisUtil.closeSession();
		}
		return result;
	}

	public int countAll() {
		int count = 0;
		SqlSession session = MyBatisUtil.getSession();
		try {
			count = session
					.selectOne("cn.jbit.mybatisdemo.dao.IEmpDao.countAll");
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			MyBatisUtil.closeSession();
		}
		return count;
	}

}