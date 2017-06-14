package listener;

 /**
 * NotificationListener.java
 * 2016年9月4日下午8:35:28
 * @author cbb
 * TODO
 */
public interface EventNotificationListener {
	
	//新增博客文
	public abstract void addPaper(Event event); 
	
	//修改博客文
	public abstract void modefiyPaper(Event event);
	
	//删除博客文
	public abstract void deletePaper(Event event);
	
}
