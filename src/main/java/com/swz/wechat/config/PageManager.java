package com.swz.wechat.config;

/**
 * PageManager 登录，注销，注册等静态页面参数嘻嘻你
 * 
 * @author CharsBoll
 * @version 2015年8月13日上午11:35:25
 */
public class PageManager {
	/**
	 * 主Home页面
	 */
	public final static String PAGE_HOME = "/mgr/home";
	/**
	 * 登录页面，位置
	 */
	public final static String PAGE_LOGIN = "/mgr/login";
	/**
	 * 程序异常页面，位置 50X页面
	 */
	public final static String PAGE_EXCEPT = "/exception/except";
	/**
	 * 404未找到
	 */
	public final static String PAGE_NOFUND = "/exception/error";
	// 页面权限值配置:-127 -> +127,一个char的权限 没有登录 0
}
