package ArrayTest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
/**
 * ArrayTest.java
 * 2016��5��3������10:22:10
 * @author cbb
 * TODO  �����һЩʹ�ò��� 
 */
public class ArrayTest {
   
	 public static void main(String []args){
		 String[] str = new String[]{"hello", "world"};
		 System.out.println(Arrays.toString(str));
		 //��java�к����������������ͣ��������顣
		 int arr[] = new int[10];
		 for(int i=0;i<10;i++){
			 arr[i] = i;
		 }
		 for(int i=0;i<10;i++){
			 System.out.println(arr[i]);
		 }
		 //���÷�װ��ȥʵ��
		 List<Integer> arrlist = new ArrayList<Integer>(10);
		 for(int i=0;i<10;i++){
			 arrlist.add(i);
		 }
		 for(Integer ar : arrlist){
			 System.out.println("i="+ar);
		 }
	}
}
