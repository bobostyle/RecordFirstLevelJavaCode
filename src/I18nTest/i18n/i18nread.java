package I18nTest.i18n;

import java.util.Locale;
import java.util.MissingResourceException;
import java.util.ResourceBundle;

import sun.rmi.runtime.Log;

public class i18nread {

	   Locale locale1 = new Locale("zh","CN");  //zh 代指语言，CN代指地区  en US 
	    
	   Locale locale2 = Locale.CHINA;  
	     
	    public void PrintInfo(){
	    	
	    	String  bundlename="I18nTest.i18n.resource.resource"; //需要把文件的前缀加上resource 
	    	Locale  localecn=Locale.CHINA;
	    	Locale  localeus=Locale.US;
	    	ResourceBundle  rb1 = ResourceBundle.getBundle(bundlename, localecn);
	    	ResourceBundle  rb2 = ResourceBundle.getBundle(bundlename, localeus); 
	    	ResourceBundle  rb3 = ResourceBundle.getBundle(bundlename);
        	ResourceBundle  rb4 = ResourceBundle.getBundle(bundlename,Locale.CANADA); 
	    	//CANDA加载的时候不存在，那么就会
	       try{
	    	System.out.println("cn:"+rb1.getString(I18nConstant.COMMON));
	    	System.out.println("en:"+rb2.getString(I18nConstant.COMMON));
	     	//System.out.println("default:"+rb3.getString(null));
	    	System.out.println("default:"+rb4.getString(I18nConstant.TIMEOUT));
	    	//抛出异常之后，不会往下执行，在日志中可以直接打印异常
	    	//一个函数会排抛出哪些异常，可以根据函数自身来决定，查询API就知道了
	       }
	       catch(MissingResourceException exception){
	    	   System.out.println("exception:"+exception);
	       }
	       catch(NullPointerException  nullpointexp){   
	    	   System.out.println("exception:"+nullpointexp);
	       }
	       finally{
	    	   System.out.println("Ok!");
	       }
	    }
	    
	    public static void main(String []args){
	    	i18nread i18ntest=new i18nread(); 
	    	i18ntest.PrintInfo();
	    }
}
