package cn.gqxqd.service.impl;

import cn.gqxqd.dao.IUserDao;
import cn.gqxqd.entity.User;
import cn.gqxqd.service.IUserService;

public class UserServiceImpl implements IUserService {

	IUserDao userDao;
	
	public void setUserDao(IUserDao userDao) {
		this.userDao = userDao;
	}

	public boolean addUser(User user) {
		return userDao.addUser(user);
	}

}
