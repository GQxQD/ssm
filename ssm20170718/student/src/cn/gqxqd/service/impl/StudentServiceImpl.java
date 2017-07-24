package cn.gqxqd.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.gqxqd.entity.Student;
import cn.gqxqd.mapper.StudentMapper;
import cn.gqxqd.service.StudentService;

@Service
public class StudentServiceImpl implements StudentService {

	@Autowired
	private StudentMapper studentMapper;
	
	@Override
	public List<Student> findAll() {
		List<Student> list = studentMapper.findAll();
		return list;
	}

}
