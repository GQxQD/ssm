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
	 * 通过学校名称模糊查找学校信息
	 * @param name
	 * @return
	 */
	List<School> findSchoolsByName(String name);
	
	/**
	 * 添加学校
	 * @param school
	 * @return boolean 是否添加成功
	 */
	boolean addSchool(School school);
	
	/**
	 * 删除学校
	 * @param id删除学校id
	 * @return 是否删除成功
	 */
	boolean deleteSchoolById(int id);
}
