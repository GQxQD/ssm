package cn.gqxqd.mapper;

import java.util.List;

import cn.gqxqd.entity.Student;

public interface StudentMapper{
	List<Student> findAll();
	Student get(int id);
}