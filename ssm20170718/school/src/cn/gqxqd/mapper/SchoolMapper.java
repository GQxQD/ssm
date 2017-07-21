package cn.gqxqd.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.jdbc.core.RowMapper;

import cn.gqxqd.entity.School;

public class SchoolMapper implements RowMapper<School> {

	@Override
	public School mapRow(ResultSet rs, int arg1) throws SQLException {
		School school = new School();
		school.setId(rs.getInt("id"));
		school.setAddress(rs.getString("address"));
		school.setEmail(rs.getString("email"));
		school.setName(rs.getString("name"));
		school.setPresident(rs.getString("president"));
		school.setTel(rs.getString("tel"));
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
		try {
			Date schoolDate = simpleDateFormat.parse(rs.getString("schoolDate"));
			school.setSchoolDate(schoolDate);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		int status = rs.getInt("status");
		school.setStatus(status == 1);
		return school;
	}

}
