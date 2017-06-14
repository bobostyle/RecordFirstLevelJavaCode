package StringTest;

import org.apache.log4j.Logger;

public class StringBufferTest {
	private static Logger log = Logger.getLogger(StringBufferTest.class.getName());
	public static void main(String []args){
		 StringBuffer sb = new StringBuffer();
		 sb.append("Nice:");
		 sb.append("to").append("meet");
		 log.info("sb=" + sb.toString());
	}
}
