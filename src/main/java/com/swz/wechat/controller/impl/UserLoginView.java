package com.swz.wechat.controller.impl;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.swz.wechat.controller.IUserLoginView;

/**
 * IUserLogin 用户登录接口模块
 * 
 * @author CharsBoll
 * @version 2015年8月15日下午2:26:00
 */
@Controller
@RequestMapping(value = "/mgr")
public class UserLoginView extends AUserLogin implements IUserLoginView {
	@Override
	@RequestMapping(value = "/login")
	public ModelAndView login() {
		System.out.println("请求用户界面！！！！！！！");
		return null;
	}

}
