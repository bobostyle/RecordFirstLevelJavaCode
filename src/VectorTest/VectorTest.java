package VectorTest;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class VectorTest {
     
	 List<String> list=new ArrayList<String>(10);   //接口和类之间的关系 
	 Map<Integer,String> map=new HashMap<Integer,String>(); 
	 
	 //List
	 public void CreatList()
	 {
      for(int i=0;i<10;i++)
      {
    	  list.add("A"+i+",");
      }
	 } 
	 // Map
	 public void CreatMap()
	 {  
		 for(int i=0;i<10;i++)
		 {
		    map.put(i, "DDD");
		 }
		 
	 }
	 
	 public void PrintList()
	 {
		 Iterator<String> iter=list.iterator();
		 while(iter.hasNext())
		 {
			 System.out.println(iter.next());
		 }
	 }
	 public void PrintMap()
	 {
		 for(Integer it:map.keySet())
		 {
			 String str=map.get(it);
			 System.out.println(str);
		 } 
	 }
	  public static void main(String []args)
	  {
		  VectorTest ve=new VectorTest();
		  ve.CreatList();
		  ve.PrintList();
		  
		  ve.CreatMap();
		  ve.PrintMap();
	  }
}
