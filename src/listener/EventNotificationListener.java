package listener;

 /**
 * NotificationListener.java
 * 2016��9��4������8:35:28
 * @author cbb
 * TODO
 */
public interface EventNotificationListener {
	
	//����������
	public abstract void addPaper(Event event); 
	
	//�޸Ĳ�����
	public abstract void modefiyPaper(Event event);
	
	//ɾ��������
	public abstract void deletePaper(Event event);
	
}
