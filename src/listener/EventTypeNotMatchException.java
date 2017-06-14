package listener;

 /**
 * EventTypeNotMatch.java
 * 2016年9月4日下午10:18:32
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
