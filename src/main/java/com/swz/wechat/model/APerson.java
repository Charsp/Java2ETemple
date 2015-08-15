package com.swz.wechat.model;

/**
 * AStudent.java
 * 
 * @author CharsBoll
 * @version 2015年8月15日下午3:56:10
 */
public abstract class APerson {
	/** 姓名 */
	private String name;
	/** 用户名称：用于登录系统 */
	private String username;
	/** 用户密码：用户登录系统 */
	private String password;
	/** 手机号码：用于识别身份 */
	private String phonenum;
	/**
	 * 用户性别 <br/>
	 * null:未指定;<br/>
	 * false:女;<br/>
	 * true:男
	 */
	private Boolean sexy;
	/** 用户图像信息 */
	private byte[] img;
	/** 所属学院 */
	private String college;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getPhonenum() {
		return phonenum;
	}

	public void setPhonenum(String phonenum) {
		this.phonenum = phonenum;
	}

	public Boolean getSexy() {
		return sexy;
	}

	public void setSexy(Boolean sexy) {
		this.sexy = sexy;
	}

	public byte[] getImg() {
		return img;
	}

	public void setImg(byte[] img) {
		this.img = img;
	}

	public String getCollege() {
		return college;
	}

	public void setCollege(String college) {
		this.college = college;
	}
}
