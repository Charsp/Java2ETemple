package com.swz.wechat.controller.view;

import org.springframework.web.servlet.ModelAndView;

/**
 * IUserLogin 用户登录接口模块
 * 
 * @author CharsBoll
 * @version 2015年8月15日下午2:26:00
 */
public interface IUserLoginView {
	/**
	 * 用户登录
	 * 
	 * @return 登录信息：JSON格式
	 */
	public ModelAndView login();
}
