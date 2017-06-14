package listener;

import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;

/**
 * EventDispatcher.java
 * 2016��9��4������9:22:08
 * @author cbb
 * TODO �¼��ַ���
 */
public class EventDispatcher {
	
	private static Logger logger = Logger.getLogger(EventDispatcher.class.getName());
	private static EventDispatcher instance = new EventDispatcher();
	public static EventDispatcher getInstance(){
		return instance;
	}
	
	private List<EventNotificationListener> listeners = new ArrayList<EventNotificationListener>();  
	private EventDispatcher(){
		String[] observers = {"listener.EmailManager", "listener.IndexChangeOfPaperManager", "listener.SorceManager"};
		for(String observer : observers){
			logger.info(observer);
			try{
				addListener((EventNotificationListener)Class.forName(observer).newInstance());
			}catch(Exception ex){
				logger.info("exception:", ex);
			}
		}
	}
	
	public void addListener(EventNotificationListener listener){
		logger.info("add event:" + listener);
		if(null == listener){
			logger.info("listener null");
			throw new NullPointerException();
		}else{
			listeners.add(listener);
		}
	}
	
	public void removeListener(EventNotificationListener listener){
		listeners.remove(listener);
	}
	
	public void dispatchEvent(Event event){
		int eventType = event.getEventType();
		logger.info("eventType:" + eventType);
		for(int i = 0; i < listeners.size(); i++){
			EventNotificationListener notificationListener = (EventNotificationListener)listeners.get(i);
			switch(eventType){
			
				case Event.ENTRY_ADDED: //����������
					notificationListener.addPaper(event);
					break;
					
				case Event.ENTRY_DELETED: //ɾ�����¡�
					notificationListener.deletePaper(event);
					break;
					
				case Event.ENTRY_MODIFIED: //�༭����
					notificationListener.modefiyPaper(event);
					break;
					
				default: 
					throw new EventTypeNotMatchException("the eventtype does not match");
			}
		}
	}
	
	
	
}
