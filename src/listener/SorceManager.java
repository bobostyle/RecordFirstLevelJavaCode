package listener;

import org.apache.log4j.Logger;

/**
 * EditPaper.java
 * 2016��9��4������8:42:40
 * @author cbb
 * TODO
 */
public class SorceManager implements EventNotificationListener{

	@Override
	public String toString() {
		return "SorceManager []";
	}

	private static Logger logger = Logger.getLogger(SorceManager.class.getName());

	@Override
	public void addPaper(Event event) {
		logger.info("SorceManager addPaper");
	}

	@Override
	public void modefiyPaper(Event event) {
		logger.info("SorceManager modefiyPaper");
	}

	@Override
	public void deletePaper(Event event) {
		logger.info("SorceManager deletePaper");
	}
}
