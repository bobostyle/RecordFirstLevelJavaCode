package ExceptionTest;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * LogPro.java
 * 2016��4��10������6:48:59
 * @author cbb
 * TODO ��ΰ��쳣��ӡ����־�� 
 */
public class LogPro {
     
	public static void PrintLogInfo(){
		Logger.getGlobal().info("log:"+123);
		Logger.getGlobal().info("log:"+456);
		Logger.getGlobal().info("log:"+789);
	}
	
    public static void main(String args[]){
    	LogPro.PrintLogInfo();
        Logger mylogger = Logger.getLogger("com.zte.app");
    	Logger.getGlobal().setLevel(Level.OFF); 
    	Logger.getGlobal().info("log:"+101112);
    	System.out.println("Hello world!");
    }

}
