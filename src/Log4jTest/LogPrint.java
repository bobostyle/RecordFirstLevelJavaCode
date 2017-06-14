package Log4jTest;

import org.apache.log4j.Logger; 

 /**
 * LogPrint.java
 * 2016年4月10日下午11:37:05
 * @author cbb
 * TODO
 */
public class LogPrint {
	private static Logger log = Logger.getLogger(LogPrint.class.getName());
	public static void main(String[] args) {
		log.info("log4j demo");
		log.debug("log4j debug");
		log.warn("log4j warn");
		log.error("log4j error");
	}
}
