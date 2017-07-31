package cn.gqxqd.test;

import java.security.NoSuchAlgorithmException;

import cn.gqxqd.util.NoteUtil;

public class NoteTest {

	public static void main(String[] args) throws NoSuchAlgorithmException {
		System.out.println(NoteUtil.createId());
		System.out.println(NoteUtil.md5("123456"));
	}
}
