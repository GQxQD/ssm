package cn.gqxqd.service;

import java.util.List;

import cn.gqxqd.entity.Student;

public interface StudentService {
	String getError();

	List<Student> findAll();
	List<Student> getStudentList();

	Student getStudentById(int id);

	boolean login(String name, String password);

	boolean register(String name, String password);
}
