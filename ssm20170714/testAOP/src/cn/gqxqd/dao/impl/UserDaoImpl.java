package cn.gqxqd.dao.impl;

import cn.gqxqd.dao.IUserDao;
import cn.gqxqd.entity.User;

public class UserDaoImpl implements IUserDao {

	public boolean addUser(User user) {
		System.out.println("--�����û�--");
		System.out.println("�û�����" + user.getUsername());
		System.out.println("���룺" + user.getPassword());
		System.out.print("���ã�");
		for (String hobby : user.getHobbies()) {
			System.out.print(" " + hobby);
		}
		System.out.println();
		System.out.println("--�����û��ɹ���--");
		return true;
	}

	public boolean updateUser(User user) {
		System.out.println("--�����û�--");
		System.out.println("�û�����" + user.getUsername());
		System.out.println("���룺" + user.getPassword());
		System.out.print("���ã�");
		for (String hobby : user.getHobbies()) {
			System.out.print(" " + hobby);
		}
		System.out.println();
		System.out.println("--�����û��ɹ���--");
		return false;
	}

	public boolean deleteUser(User user) {
		System.out.println("--ɾ���û�" + user.getUsername() + "�ɹ���--");
		return false;
	}

	public User findUser(String username) {
		User user = new User();
		user.setUsername(username);
		user.setPassword("123");
		return null;
	}

}