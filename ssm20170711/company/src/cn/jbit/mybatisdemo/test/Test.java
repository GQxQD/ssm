package cn.jbit.mybatisdemo.test;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import cn.jbit.mybatisdemo.entity.Emp;
import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

public class Test {
	public static void main(String[] args) {
		List<Object> list = new ArrayList<Object>();
		Emp emp= new Emp();
		list.add(emp);
		JSONArray jsonArray = JSONArray.fromObject(list);
		System.out.println(jsonArray.toString());
	}
}
