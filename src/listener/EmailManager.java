package listener;

import org.apache.log4j.Logger;

/**
 * DeletePaper.java
 * 2016年9月4日下午8:42:52
 * @author cbb
 * TODO
 */
public class EmailManager implements EventNotificationListener{
	
	
	@Override
	public String toString() {
		return "EmailManager []";
	}

	private static Logger logger = Logger.getLogger(EmailManager.class.getName());

	@Override
	public void addPaper(Event event) {
		logger.info("EmailManager addPaper");
	}

	@Override
	public void modefiyPaper(Event event) {
		logger.info("EmailManager modefiyPaper");
	}

	@Override
	public void deletePaper(Event event) {
		logger.info("EmailManager deletePaper");
	}
	
	
}
