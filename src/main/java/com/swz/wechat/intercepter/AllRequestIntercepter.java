package com.swz.wechat.intercepter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

/**
 * 总的数据拦截器
 * 
 * @author Charsp
 * @version 2015年7月31日下午3:43:13
 */
public class AllRequestIntercepter extends HandlerInterceptorAdapter {
	private Logger log = LoggerFactory.getLogger(AllRequestIntercepter.class);

	public String getIpAddr(HttpServletRequest request) {
		String ip = request.getHeader("x-forwarded-for");
		if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {
			ip = request.getHeader("Proxy-Client-IP");
		}

		if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {
			ip = request.getHeader("WL-Proxy-Client-IP");
		}

		if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {
			ip = request.getRemoteAddr();
		}
		return ip;
	}

	@Override
	public boolean preHandle(HttpServletRequest request,
			HttpServletResponse response, Object handler) throws Exception {
		System.out.println("用户为" + getIpAddr(request) + "的ip地址访问服务器");
		if ("GET".equalsIgnoreCase(request.getMethod())) {
			// 保证session不为空
			HttpSession session = request.getSession();
			if (session.getAttribute("currpageip") == null) {
				// 新增加一名用户访问，一天失效
				session.setAttribute("currpageip", "currpageip");
				String userDevice = request.getHeader("user-agent");
				String operateSystem = null;
				// 操作系统
				if (userDevice.contains("Android")) {
					// 安卓系统
					operateSystem = "Android";
				} else if (userDevice.contains("Linux")) {
					// Linux系统
					operateSystem = "Linux";
				}
				if (userDevice.contains("like Mac OS X")) {
					// IOS系统
					operateSystem = "IOS";
				}
				if (userDevice.contains("BlackBerry")) {
					// 黑莓系统
					operateSystem = "BlackBerry";
				}
				if (userDevice.contains("Symbian")) {
					// 塞班系统
					operateSystem = "Symbian";
				}
				if (userDevice.contains("Macintosh")) {
					// Apple系统
					operateSystem = "Macintosh";
				}
				if (userDevice.contains("Windows")) {
					// 微软系统
					operateSystem = "Windows";
				}
				if (operateSystem == null) {
					operateSystem = "未识别";
				}
				// 从iphone开始
				if (userDevice.contains("MicroMessenger/")) {
					log.info("微信端网页请求网页" + request.getRequestURI() + "\n 客户端"
							+ ":" + userDevice);
					request.setAttribute("httpstype", "weixin");
				} else {
					log.info("来自" + operateSystem + "平台的正常浏览器");
					request.setAttribute("httpstype", "noweixin");
				}
			}
		}
		// 允许访问
		return true;
	}
}
