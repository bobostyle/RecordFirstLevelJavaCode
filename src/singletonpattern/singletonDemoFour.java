package singletonpattern;

 /**
 * singletonDemoFour.java
 * 2016年9月4日下午5:08:48
 * @author cbb
 * TODO 使用内部静态代码块来初始化，也具有唯一性。
 */
public class singletonDemoFour {
	private singletonDemoFour(){
	}
	private static singletonDemoFour instance = null;
	static{
		instance = new singletonDemoFour();
	}
	public static singletonDemoFour getInstance(){
		return instance;
	}
}
