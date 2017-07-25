package cn.gqxqd.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Select;

import cn.gqxqd.entity.Student;

public interface StudentSimpleMapper {
	
	@Select("select * from student")
	List<Student> getStudentList();
}
