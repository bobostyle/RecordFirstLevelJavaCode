package singletonpattern;

 /**
 * singletonDemoTwo.java
 * 2016年9月4日下午4:54:28
 * @author cbb
 * TODO  线程安全
 */
public class singletonDemoTwo {
	private singletonDemoTwo(){
	}
	private static singletonDemoTwo instance = null; 
	public synchronized static singletonDemoTwo getInstance(){
		if(null == instance){
			instance = new singletonDemoTwo();
		}
		return instance;
	}
}
