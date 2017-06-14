package singletonpattern;

 /**
 * singletonDemoFour.java
 * 2016��9��4������5:08:48
 * @author cbb
 * TODO ʹ���ڲ���̬���������ʼ����Ҳ����Ψһ�ԡ�
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
