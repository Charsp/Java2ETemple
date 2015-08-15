package org.charsboll.datasource.multi;

/**
 * 客户端数据配置类
 * 
 * @author Charsp
 *
 * @Date 2015年4月24日
 */
public class CustomerContextHolder {

	private static final ThreadLocal<String> contextHolder = new ThreadLocal<String>();

	public static void setDBType(String dbType) {
		contextHolder.set(dbType);
	}

	public static String getDBType() {
		return contextHolder.get();
	}

	public static void clearDBType() {
		contextHolder.remove();
	}
}
