package com.swz.wechat.controller.impl;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.swz.wechat.controller.IUserLoginCtrl;
import com.swz.wechat.model.Student;

/**
 * IUserLogin 用户登录接口模块
 * 
 * @author CharsBoll
 * @version 2015年8月15日下午2:26:00
 */
@Controller
@RequestMapping(value = "/mgr")
@ResponseBody
public class UserLoginCtrl extends AUserLogin implements IUserLoginCtrl {
	private Map<String, Object> remap = new HashMap<String, Object>();

	public void ClearReturn() {
		remap.clear();
	}

	@Override
	@RequestMapping("/userlogin")
	public Map<String, Object> login(Student person) {
		remap.put("result", person);
		System.out.println("用户登录请求返回的代码");
		return remap;
	}

	@Override
	@RequestMapping("/logout")
	public Map<String, Object> logout() {
		remap.put("errcode", 0);
		System.out.println("用户注销请求返回的代码");
		return remap;
	}

	@Override
	public Map<String, Object> register() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Map<String, Object> reset() {
		// TODO Auto-generated method stub
		return null;
	}

}
