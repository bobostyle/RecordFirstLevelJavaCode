package listener;

import java.util.Collections;
import java.util.Date;
import java.util.Map;

/**
 * Event.java
 * 2016��9��4������9:01:18
 * @author cbb
 * TODO
 */
public class Event {
	
	public static final int ENTRY_ADDED = 100; //�¼�����:���±�����  
	public static final int ENTRY_DELETED = 101;//�¼�����:���±�ɾ��  
	public static final int ENTRY_MODIFIED = 102;//�¼�����:���±��޸�
	 
	private int eventType; //�¼�����  
	private Paper paper; //�������¶���  
	private Date date; //�¼���������  
	private Map<?, ?>  params; //�¼���������  
	 
	public Event(int eventType, Paper paper, Map<?, ?> params) {
		this.eventType = eventType;
		this.paper = paper;
		this.params = ((params != null)? Collections.unmodifiableMap(params): null);  
		date = new Date();
	}

	public int getEventType() {
		return eventType;
	}

	public void setEventType(int eventType) {
		this.eventType = eventType;
	}
	
	public Paper getPaper() {
		return paper;
	}

	public void setPaper(Paper paper) {
		this.paper = paper;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public Map<?, ?> getParams() {
		return params;
	}

	public void setParams(Map<?, ?> params) {
		this.params = params;
	}
}
