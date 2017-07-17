package cn.gqxqd.entity;

import java.util.Set;

public class User {
	private String username;
	private String password;
	private String words;
	private Set<String> hobbies;

	public void say() {
		System.out.println(this.username + ":" + this.words);
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getWords() {
		return words;
	}

	public void setWords(String words) {
		this.words = words;
	}

	public Set<String> getHobbies() {
		return hobbies;
	}

	public void setHobbies(Set<String> hobbies) {
		this.hobbies = hobbies;
	}

}
