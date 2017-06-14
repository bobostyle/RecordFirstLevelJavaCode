package singletonpattern;

 /**
 * singletonDemoSix.java
 * 2016��9��4������5:14:47
 * @author cbb
 * TODO DCL(˫�ؼ�����������ֱ���ڷ����ϼ�synchronzied������������²���Ҫ���õ����)
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
	// ˫��������Ϊ����null���������ε��ж�
	// ��һ�Σ��ж϶����Ƿ��Ѿ������������������ֱ�ӷ���instance��û�д����ͽ���ͬ��������������ȷ����һ�ε�ʱ��
	// ��ʹ��ͬ����������ʹ�á�������ܡ�
	// �ڶ��Σ����뵽ͬ�����󣬶�null���ж�һ�Σ������ȻΪnull����ô�ʹ���ʵ����
}
