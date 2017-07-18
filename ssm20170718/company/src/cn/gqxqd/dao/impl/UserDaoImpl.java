package cn.gqxqd.dao.impl;


import org.springframework.stereotype.Repository;

import cn.gqxqd.dao.IUserDao;

@Repository("userDao")
public class UserDaoImpl implements IUserDao {

	public void addUser() {
		System.out.println("Add User...");
	}

}
