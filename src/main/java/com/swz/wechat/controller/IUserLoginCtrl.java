package com.swz.wechat.controller;

import java.util.Map;

import com.swz.wechat.model.Student;

/**
 * IUserLogin 用户登录接口模块
 * 
 * @author CharsBoll
 * @version 2015年8月15日下午2:26:00
 */
public interface IUserLoginCtrl {
	/**
	 * 用户登录
	 * 
	 * @return 登录信息：JSON格式
	 */
	public Map<String, Object> login(Student person);

	/**
	 * 用户注销
	 * 
	 * @return 返回注销网页：JSON格式
	 */
	public Map<String, Object> logout();

	/**
	 * 用户注册
	 * 
	 * @return 默认跳转到个人信息网页
	 */
	public Map<String, Object> register();

	/**
	 * 用户个人信息修改，或者提交新的数据
	 * 
	 * @return
	 */
	public Map<String, Object> reset();
}
