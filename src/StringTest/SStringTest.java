package StringTest;

import java.io.File;

//单例模式,只能实例化一次
public class SStringTest {
   
	public static SStringTest  instance; 
	public static SStringTest getInstance(){
		if(instance == null)
			instance=new SStringTest(); 
		return instance;
	}
	//final 来定义常量 ，常量只能初始化一次，并且不能修改，一般常量和static一起使用。
	public static final double PI=3.14;
	//String方法中常用的几种，substring 子串，indexof 索引，split以什么作为分割提取，trim除去中间的间隔  ,lastindexof
	//substring(i,j) 从i位开始，到j的前一位结束，不包含j 
	//substring(i) 从i开始到字符串的最后一位结束  
	
	public  String SubStringtest(){
		String filepath="D:\\workspace\\util\\one.txt";
		File file=new File(filepath);
		String filename=file.getName();
		String filepathname=file.getAbsolutePath();
		String substr=filepath.substring(0, filepath.length()-filename.length());
		System.out.println(substr);
		System.out.println(filepathname);
		System.out.println(filename);
		return  filename;
	}
	
	public void Indexoftest(){
		
		String filepath="D:\\workspace\\util\\one.txt";
	    
		System.out.println(filepath.indexOf("util")); //
		System.out.println(filepath.indexOf("u"));
		System.out.println(filepath.indexOf("\\")); // indexof() 
		System.out.println(filepath.lastIndexOf("\\")); // indexof()  最后一个\的索引 
	}
	
	public void Splittest(){
		String filepath="D:\\workspace\\util\\one.txt";
		String arraystr[]=filepath.split("\\\\");
		System.out.println("=====");
		for(String arg:arraystr){
			System.out.println(arg);
		}
		//把\全部替换成@ 
	    String file= filepath.replaceAll("\\\\","@");
	    
	    System.out.println(filepath.replaceAll("util", "one"));
	    System.out.println(filepath.replace("util", "one"));
	    System.out.println(file);
		
	}
	public void TrimTest(){
		
		String str="   hello   ";
		System.out.println(str.trim());
		System.out.println(str.length()); //11
		System.out.println(str.trim().length());//5  trim() 去除字符串的前后空格，中间不去除 。
	}
	
	
    public static void main(String []args){
    	
    	//PI=12;//常量不能再次赋值 
    	System.out.println(PI);
    	
    	SStringTest.getInstance().SubStringtest();
    	SStringTest.getInstance().Splittest();
    	SStringTest.getInstance().Indexoftest();
    	SStringTest.getInstance().TrimTest();
    	System.out.println("the locale is not exist");
    	System.out.println("the locale is not exist");
    }
};
