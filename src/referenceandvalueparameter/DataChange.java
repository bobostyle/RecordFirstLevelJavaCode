package referenceandvalueparameter;

 /**
 * DataChange.java
 * 2016��9��8������11:24:52
 * @author cbb
 * TODO ����Data��Ķ������践��
 */
public class DataChange {

	public static void setData(Data data){
		data.setStrValue("new value");
		data.setNum(100);
	}
	
	public static void main(String[] args) {
		Data olddata = new Data("oldValue",10);
		DataChange.setData(olddata);
		System.out.println(olddata.toString());
	}
}
