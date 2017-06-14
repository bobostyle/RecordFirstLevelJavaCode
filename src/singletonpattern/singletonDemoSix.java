package singletonpattern;

 /**
 * singletonDemoSix.java
 * 2016年9月4日下午5:14:47
 * @author cbb
 * TODO DCL(双重检测锁，是针对直接在方法上加synchronzied方法多数情况下不需要调用的情况)
 */
public class singletonDemoSix {
	private static volatile singletonDemoSix instance = null; 
	private singletonDemoSix(){
		
	}
	public static singletonDemoSix getInstance(){
		if(null == instance){
			synchronized(singletonDemoSix.class){
				if(null == instance){
					instance = new singletonDemoSix();
				}
			}
		}
		return instance;
	}
	// 双重锁是因为对于null进行了两次的判断
	// 第一次：判断对象是否已经创建，如果创建。就直接返回instance，没有创建就进入同步区。这样可以确保第一次的时候
	// 才使用同步，其他不使用。提高性能。
	// 第二次：进入到同步区后，对null再判断一次，如果仍然为null，那么就创建实例。
}
