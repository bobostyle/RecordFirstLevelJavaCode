package listener;

 /**
 * EventTypeNotMatch.java
 * 2016��9��4������10:18:32
 * @author cbb
 * TODO
 */
public class EventTypeNotMatchException extends RuntimeException{

	private static final long serialVersionUID = 1L;
	public EventTypeNotMatchException(){
		
	}

	public EventTypeNotMatchException(String s){
		super(s);
	}
		
	public EventTypeNotMatchException(String s, Throwable throwable){
		super(s, throwable);
	}

	public EventTypeNotMatchException(Throwable throwable){
		super(throwable);
	}
}
