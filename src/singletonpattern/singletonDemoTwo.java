package singletonpattern;

 /**
 * singletonDemoTwo.java
 * 2016��9��4������4:54:28
 * @author cbb
 * TODO  �̰߳�ȫ
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
