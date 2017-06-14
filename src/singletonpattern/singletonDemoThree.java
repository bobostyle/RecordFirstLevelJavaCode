package singletonpattern;

 /**
 * singletonDemoThree.java
 * 2016年9月4日下午5:02:07
 * @author cbb
 * TODO 不满足延迟策略，在类被加载的时候就实例化了对象,所以执行getInstance()之前就可能被加载了。
 * 注意类的加载，并不是jvm一上来就把此类进行了加载。是被调用的时候才加载。
 * 线程安全是可以保证的。
 */
public class singletonDemoThree {
	private singletonDemoThree(){
		System.out.println("abc");
	}
	private static singletonDemoThree instance = new singletonDemoThree(); 
	public static singletonDemoThree getInstance(){
		return instance;
	}
	public static void test(){
		System.out.println("bcd");
	}
	public static void main(String[] args) {
		singletonDemoThree.test();
	}
	
}
