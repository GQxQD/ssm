package cn.gqxqd.service;

public interface UserService {
	String getError();

	boolean login(String username, String password);

	boolean register(String username, String password);
}
