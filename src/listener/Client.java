package listener;

 /**
 * Client.java
 * 2016��9��4������10:22:47
 * @author cbb
 * TODO 
 */
public class Client {
	
	// �¼��ַ�  
	public void addEntry(Paper paper){
		Event event = new Event(Event.ENTRY_ADDED, paper, null);  
		EventDispatcher.getInstance().dispatchEvent(event);  
	}  
	// �¼��ַ�  
	public void deleteEntry(Paper paper) {  
		Event event = new Event(Event.ENTRY_DELETED, paper, null);  
		EventDispatcher.getInstance().dispatchEvent(event);  
	}  
	// �¼��ַ�  	   
	public void modifyEntry(Paper paper) {  
		Event event = new Event(Event.ENTRY_MODIFIED, paper, null);  
		EventDispatcher.getInstance().dispatchEvent(event);  
	}  
	
	public static void main(String[] args) {
		Paper paper = new Paper();
		paper.setId(1);
		paper.setName("test");
		Client Client = new Client();
		Client.addEntry(paper);
		Client.deleteEntry(paper);
		Client.modifyEntry(paper);
	}
}
