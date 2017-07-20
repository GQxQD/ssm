package cn.gqxqd.test;

import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;

import com.sun.corba.se.impl.orb.ParserTable.TestIORToSocketInfo;

import cn.gqxqd.service.SchoolService;

public class Test {

	@Autowired
	private SchoolService schoolService;

	public void setSchoolService(SchoolService schoolService) {
		this.schoolService = schoolService;
	}
	
	public SchoolService getSchoolService() {
		return schoolService;
	}

	public static void main(String[] args) {
		Test test = new Test();
		test.getSchoolService().findSchoolList();
	}

}
