package org.charsboll.heapstack.test;

/**
 * MainTest.java
 * 
 * @author CharsBoll
 * @version 2015年8月15日上午10:14:21
 */
public class MainTest {
	/**
	 * 堆栈测试
	 */
	public static void heapstack() {
		// 栈内，静态常量
		String AA = "ABC";
		// 堆内
		String BB = new String("ABC");
		// 堆内
		String DD = new String("ABC");
		// 这个会返回一个对象 == new String(AA + "");放进堆内
		String CC = AA + "";
		System.out.println(StaticA.AStr == StaticB.BStr);
		System.out.println(StaticA.AStr == AA);
		System.out.println(StaticA.AStr == BB);
		System.out.println(StaticA.AStr == CC);
		System.out.println(BB == CC);
		System.out.println(BB == DD);
	}

	public static void main(String[] args) {
		heapstack();
	}
}
