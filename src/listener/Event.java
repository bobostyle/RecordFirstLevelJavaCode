package listener;

import java.util.Collections;
import java.util.Date;
import java.util.Map;

/**
 * Event.java
 * 2016年9月4日下午9:01:18
 * @author cbb
 * TODO
 */
public class Event {
	
	public static final int ENTRY_ADDED = 100; //事件类型:文章被创建  
	public static final int ENTRY_DELETED = 101;//事件类型:文章被删除  
	public static final int ENTRY_MODIFIED = 102;//事件类型:文章被修改
	 
	private int eventType; //事件类型  
	private Paper paper; //博客文章对象  
	private Date date; //事件触发日期  
	private Map<?, ?>  params; //事件辅助参数  
	 
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
