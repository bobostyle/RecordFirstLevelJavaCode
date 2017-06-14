package referenceandvalueparameter;

 /**
 * DataChange.java
 * 2016年9月8日下午11:24:52
 * @author cbb
 * TODO 传入Data类的对象，无需返回
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
