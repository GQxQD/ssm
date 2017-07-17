package cn.gqxqd.dao;

import cn.gqxqd.entity.User;

public interface IUserDao {
	boolean addUser(User user);
	boolean updateUser(User user);
	boolean deleteUser(User user);
	User findUser(String username);
}
