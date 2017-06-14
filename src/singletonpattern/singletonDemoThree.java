package singletonpattern;

 /**
 * singletonDemoThree.java
 * 2016��9��4������5:02:07
 * @author cbb
 * TODO �������ӳٲ��ԣ����౻���ص�ʱ���ʵ�����˶���,����ִ��getInstance()֮ǰ�Ϳ��ܱ������ˡ�
 * ע����ļ��أ�������jvmһ�����ͰѴ�������˼��ء��Ǳ����õ�ʱ��ż��ء�
 * �̰߳�ȫ�ǿ��Ա�֤�ġ�
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
