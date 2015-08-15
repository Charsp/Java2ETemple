package com.swz.wechat.model;

/**
 * Teacher.java
 * 
 * @author CharsBoll
 * @version 2015年8月15日下午4:13:01
 */
public class Teacher extends APerson {
	/** 入职时间 */
	private String entydate;
	/** 薪水 */
	private String salary;

	public String getEntydate() {
		return entydate;
	}

	public void setEntydate(String entydate) {
		this.entydate = entydate;
	}

	public String getSalary() {
		return salary;
	}

	public void setSalary(String salary) {
		this.salary = salary;
	}

}
