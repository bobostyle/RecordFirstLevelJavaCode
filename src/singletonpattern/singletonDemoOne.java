package singletonpattern;

 /**
 * singletonDemoOne.java
 * 2016年9月4日下午4:45:38
 * @author cbb
 * TODO  
 */
public class singletonDemoOne {

	private singletonDemoOne(){
		// 任何一个单例模式中，这个方法都是不可以少的。它的存在可以避免其他地方使用new方法来初始化实例。
		// 这个构造函数中方法体是空的。因为永远不可以被调用。
	}
	private static singletonDemoOne instance = null; 
	public static singletonDemoOne getInstance(){
		if(null == instance){
			instance = new singletonDemoOne();
		}
		return instance;
	}
}
