package com.swz.wechat.intercepter;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import net.sf.json.JSONObject;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

public class UserRequestIntercepter extends HandlerInterceptorAdapter {
	// private static final String lineSeparator = System
	// .getProperty("line.separator");
	// private final Logger log = LoggerFactory
	// .getLogger(UserRequestInterceptor.class);

	@Override
	public boolean preHandle(HttpServletRequest request,
			HttpServletResponse response, Object handler) throws Exception {
		// 直接交给过滤器判断是否为微信界面
		if ("GET".equalsIgnoreCase(request.getMethod())) {
			// 保存网页
			// + ":" + request.getServerPort() 不能添加默认端口号:80,腾讯不给识别
			String url = request.getScheme() + "://" + request.getServerName()
					+ request.getRequestURI();
			String paramString = request.getQueryString();
			if (paramString != null) {
				url += "?" + paramString;
			}
			String contextPath = request.getContextPath();
			System.out.println(url + contextPath);
		}
		return true;
	}

	/**
	 * 以JSON格式输出
	 * 
	 * @param response
	 */
	protected void responseOutWithJson(HttpServletResponse response,
			Object responseObject) {
		// 将实体对象转换为JSON Object转换
		JSONObject responseJSONObject = JSONObject.fromObject(responseObject);
		response.setCharacterEncoding("UTF-8");
		response.setContentType("application/json; charset=utf-8");
		PrintWriter out = null;
		try {
			out = response.getWriter();
			out.append(responseJSONObject.toString());
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (out != null) {
				out.close();
			}
		}
	}

	@Override
	public void postHandle(HttpServletRequest request,
			HttpServletResponse response, Object handler,
			ModelAndView modelAndView) throws Exception {
		if (modelAndView != null) { // 加入当前时间
			modelAndView.addObject("var", "测试postHandle");
		}
	}

	@Override
	public void afterCompletion(HttpServletRequest request,
			HttpServletResponse response, Object handler, Exception ex)
			throws Exception {
		super.afterCompletion(request, response, handler, ex);
	}

}
