package AlarmCovertImpl;

 /**
 * AbstratAlarmCovertimpl.java
 * 2016��5��4������10:42:58
 * @author cbb
 * TODO
 */
public class AbstratAlarmCovertimpl implements ICovert {
	public String GetUid(){
		return " "; 
	}
	@Override
	public void covert() {
		System.out.println("sub class");
	}
}
