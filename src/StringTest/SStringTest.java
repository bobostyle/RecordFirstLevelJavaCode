package StringTest;

import java.io.File;

//����ģʽ,ֻ��ʵ����һ��
public class SStringTest {
   
	public static SStringTest  instance; 
	public static SStringTest getInstance(){
		if(instance == null)
			instance=new SStringTest(); 
		return instance;
	}
	//final �����峣�� ������ֻ�ܳ�ʼ��һ�Σ����Ҳ����޸ģ�һ�㳣����staticһ��ʹ�á�
	public static final double PI=3.14;
	//String�����г��õļ��֣�substring �Ӵ���indexof ������split��ʲô��Ϊ�ָ���ȡ��trim��ȥ�м�ļ��  ,lastindexof
	//substring(i,j) ��iλ��ʼ����j��ǰһλ������������j 
	//substring(i) ��i��ʼ���ַ��������һλ����  
	
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
		System.out.println(filepath.lastIndexOf("\\")); // indexof()  ���һ��\������ 
	}
	
	public void Splittest(){
		String filepath="D:\\workspace\\util\\one.txt";
		String arraystr[]=filepath.split("\\\\");
		System.out.println("=====");
		for(String arg:arraystr){
			System.out.println(arg);
		}
		//��\ȫ���滻��@ 
	    String file= filepath.replaceAll("\\\\","@");
	    
	    System.out.println(filepath.replaceAll("util", "one"));
	    System.out.println(filepath.replace("util", "one"));
	    System.out.println(file);
		
	}
	public void TrimTest(){
		
		String str="   hello   ";
		System.out.println(str.trim());
		System.out.println(str.length()); //11
		System.out.println(str.trim().length());//5  trim() ȥ���ַ�����ǰ��ո��м䲻ȥ�� ��
	}
	
	
    public static void main(String []args){
    	
    	//PI=12;//���������ٴθ�ֵ 
    	System.out.println(PI);
    	
    	SStringTest.getInstance().SubStringtest();
    	SStringTest.getInstance().Splittest();
    	SStringTest.getInstance().Indexoftest();
    	SStringTest.getInstance().TrimTest();
    	System.out.println("the locale is not exist");
    	System.out.println("the locale is not exist");
    }
};
