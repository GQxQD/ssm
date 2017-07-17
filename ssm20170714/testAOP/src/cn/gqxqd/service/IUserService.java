package cn.gqxqd.service;

import cn.gqxqd.entity.User;

public interface IUserService {
	boolean addUser(User user);
	boolean updateUser(User user);
	boolean deleteUser(User user);
}
