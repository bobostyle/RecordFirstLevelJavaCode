package Number;

import java.util.ArrayList;
import java.util.List;
import org.apache.log4j.Logger;
/**
 * NumberTest.java
 * 2016年5月19日下午11:51:02
 * @author cbb
 * TODO java的Number类的实现
 */
public class NumberTest {
	//注释部分是最开始写代码时候写的
//	public static void  main(String []args){
//		Integer intnumber;
//		intnumber = 5;
//		System.out.println(2*intnumber+10); 
//	    ArrayList <Integer> array = new  ArrayList();
//	    //对于这种，常用的数据结构，里面定义类型都不是内置数据类型(int float string short等)
//	    //里面的数据都是封装的数据类型的类，如 Integer String Float等,都输Number的子类
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
