package com.swz.wechat.intercepter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

/**
 * 拦截非404的定义路径
 * 
 * @author Charsp
 * @version 2015年8月12日上午8:42:39
 */
public class AdminRequestIntercepter extends HandlerInterceptorAdapter {

	@Override
	public boolean preHandle(HttpServletRequest request,
			HttpServletResponse response, Object handler) throws Exception {
		if ("GET".equalsIgnoreCase(request.getMethod())) {
			// 系统拦截
		}
		// 允许访问
		return true;
	}

}
