package cn.gqxqd.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.gqxqd.dao.SchoolDao;
import cn.gqxqd.entity.School;
import cn.gqxqd.service.SchoolService;

@Service("schoolService")
public class SchoolServiceImpl implements SchoolService {

	@Autowired
	private SchoolDao schoolDao;

	public void setSchoolDao(SchoolDao schoolDao) {
		this.schoolDao = schoolDao;
	}

	@Override
	public List<School> findSchoolList() {
		return schoolDao.findSchoolList();
	}

	@Override
	public boolean addSchool(School school) {
		return schoolDao.addSchool(school);
	}

	@Override
	public boolean deleteSchoolById(int id) {
		return schoolDao.deleteSchoolById(id);
	}

	@Override
	public List<School> findSchoolsByName(String name) {
		return schoolDao.findSchoolsByName(name);
	}

}
