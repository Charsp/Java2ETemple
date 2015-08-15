package org.charsboll.interceptor;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class PageFilter implements Filter {

	private static Logger log = LoggerFactory.getLogger(PageFilter.class);
	private String encoding;

	@Override
	public void destroy() {
		log.info("JSP编码过滤器注销！");
		this.encoding = null;
	}

	@Override
	public void doFilter(ServletRequest request, ServletResponse response,
			FilterChain filterChain) throws IOException, ServletException {
		HttpServletResponse resp = (HttpServletResponse) response;
		// 禁止所有的jsp网页被访问
		resp.sendError(404);
	}

	@Override
	public void init(FilterConfig filterConfig) throws ServletException {
		// 本过滤器默认编码是UTF-8，但也可以在web.xml配置文件里设置自己需要的编码
		this.encoding = filterConfig.getInitParameter("encoding");
		log.info("注册JSP编码" + encoding + "过滤器");
	}

}