package singletonpattern;

 /**
 * singletonDemoFive.java
 * 2016年9月4日下午5:10:28
 * @author cbb
 * TODO 采用内部静态类，这样可以满足延时加载的问题。
 */
public class singletonDemoFive {
	private singletonDemoFive(){
	}
	static class singletonLoad {
		private static final singletonDemoFive instance = new singletonDemoFive();
	}
	
	public static singletonDemoFive getInstance(){
		return singletonLoad.instance;
	}
}
