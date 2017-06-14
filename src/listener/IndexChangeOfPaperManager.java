package listener;

import org.apache.log4j.Logger;

/**
 * PublishPaper.java
 * 2016��9��4������8:42:20
 * @author cbb
 * TODO
 */
public class IndexChangeOfPaperManager implements EventNotificationListener{
	@Override
	public String toString() {
		return "IndexChangeOfPaperManager []";
	}

	private static Logger logger = Logger.getLogger(IndexChangeOfPaperManager.class.getName());

	@Override
	public void addPaper(Event event) {
		logger.info("IndexChangeOfPaperManager addPaper");
	}

	@Override
	public void modefiyPaper(Event event) {
		logger.info("IndexChangeOfPaperManager modefiyPaper");
	}

	@Override
	public void deletePaper(Event event) {
		logger.info("IndexChangeOfPaperManager deletePaper");
	}
}
