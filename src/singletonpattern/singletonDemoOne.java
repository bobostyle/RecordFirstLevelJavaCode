package singletonpattern;

 /**
 * singletonDemoOne.java
 * 2016��9��4������4:45:38
 * @author cbb
 * TODO  
 */
public class singletonDemoOne {

	private singletonDemoOne(){
		// �κ�һ������ģʽ�У�����������ǲ������ٵġ����Ĵ��ڿ��Ա��������ط�ʹ��new��������ʼ��ʵ����
		// ������캯���з������ǿյġ���Ϊ��Զ�����Ա����á�
	}
	private static singletonDemoOne instance = null; 
	public static singletonDemoOne getInstance(){
		if(null == instance){
			instance = new singletonDemoOne();
		}
		return instance;
	}
}
