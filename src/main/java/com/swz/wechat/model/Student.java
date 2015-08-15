package com.swz.wechat.model;

/**
 * Student.java
 * 
 * @author CharsBoll
 * @version 2015年8月15日下午4:10:19
 */
public class Student extends APerson {
	/** 班级 */
	private String clazz;
	/** 年级 */
	private String grade;

	public String getClazz() {
		return clazz;
	}

	public void setClazz(String clazz) {
		this.clazz = clazz;
	}

	public String getGrade() {
		return grade;
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}

}
