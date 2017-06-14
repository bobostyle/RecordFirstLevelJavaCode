package singletonpattern;

 /**
 * singletonDemoFive.java
 * 2016��9��4������5:10:28
 * @author cbb
 * TODO �����ڲ���̬�࣬��������������ʱ���ص����⡣
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
