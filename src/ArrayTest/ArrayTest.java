package ArrayTest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
/**
 * ArrayTest.java
 * 2016年5月3日下午10:22:10
 * @author cbb
 * TODO  数组的一些使用测试 
 */
public class ArrayTest {
   
	 public static void main(String []args){
		 String[] str = new String[]{"hello", "world"};
		 System.out.println(Arrays.toString(str));
		 //在java中很少用内置数据类型，包括数组。
		 int arr[] = new int[10];
		 for(int i=0;i<10;i++){
			 arr[i] = i;
		 }
		 for(int i=0;i<10;i++){
			 System.out.println(arr[i]);
		 }
		 //都用封装类去实现
		 List<Integer> arrlist = new ArrayList<Integer>(10);
		 for(int i=0;i<10;i++){
			 arrlist.add(i);
		 }
		 for(Integer ar : arrlist){
			 System.out.println("i="+ar);
		 }
	}
}
