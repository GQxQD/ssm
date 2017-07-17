package cn.gqxqd.dao.impl;

import cn.gqxqd.dao.IUserDao;
import cn.gqxqd.entity.User;

public class UserDaoImpl implements IUserDao {

	public boolean addUser(User user) {
		System.out.println("--添加用户--");
		System.out.println("用户名：" + user.getUsername());
		System.out.println("密码：" + user.getPassword());
		System.out.print("爱好：");
		for (String hobby : user.getHobbies()) {
			System.out.print(" " + hobby);
		}
		System.out.println();
		System.out.println("--添加用户成功！--");
		return true;
	}

	public boolean updateUser(User user) {
		System.out.println("--更新用户--");
		System.out.println("用户名：" + user.getUsername());
		System.out.println("密码：" + user.getPassword());
		System.out.print("爱好：");
		for (String hobby : user.getHobbies()) {
			System.out.print(" " + hobby);
		}
		System.out.println();
		System.out.println("--更新用户成功！--");
		return false;
	}

	public boolean deleteUser(User user) {
		System.out.println("--删除用户" + user.getUsername() + "成功！--");
		return false;
	}

	public User findUser(String username) {
		User user = new User();
		user.setUsername(username);
		user.setPassword("123");
		return null;
	}

}
