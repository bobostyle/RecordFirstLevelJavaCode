package Number;

import java.util.ArrayList;
import java.util.List;
import org.apache.log4j.Logger;
/**
 * NumberTest.java
 * 2016��5��19������11:51:02
 * @author cbb
 * TODO java��Number���ʵ��
 */
public class NumberTest {
	//ע�Ͳ������ʼд����ʱ��д��
//	public static void  main(String []args){
//		Integer intnumber;
//		intnumber = 5;
//		System.out.println(2*intnumber+10); 
//	    ArrayList <Integer> array = new  ArrayList();
//	    //�������֣����õ����ݽṹ�����涨�����Ͷ�����������������(int float string short��)
//	    //��������ݶ��Ƿ�װ���������͵��࣬�� Integer String Float��,����Number������
//	    array.add(10);
//	    array.add(22);
//	    
//	    for(Integer inter : array){
//	    	System.out.println(inter);
//	    }
//	}
	private static Logger log = Logger.getLogger(NumberTest.class.getName());
	public static void main(String[] args) {
		Integer number = new Integer(5);
		int num = number.intValue();
		log.info("num=" + num);
		List<Integer> array = new ArrayList<Integer>();
		array.add(10);
		array.add(20);
		for(Integer arr : array){
			log.info("arr = " + arr);		}
	}
}	
