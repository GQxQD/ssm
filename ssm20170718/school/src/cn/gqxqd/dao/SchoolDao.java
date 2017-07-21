package cn.gqxqd.dao;

import java.util.List;

import cn.gqxqd.entity.School;

public interface SchoolDao {
	
	/**
	 * 获取所有学校信息
	 * @return List<School> 学校List
	 */
	List<School> findSchoolList();
	
	/**
	 * 添加学校
	 * @param school
	 * @return boolean 是否添加成功
	 */
	boolean addSchool(School school);
}
