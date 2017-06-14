package referenceandvalueparameter;

 /**
 * Data.java
 * 2016年9月8日下午11:04:28
 * @author cbb
 * TODO java 里面全部是对象，所以
 */
public class Data {
	
	private String strValue;
	private int num;
	public Data(String strValue, int num){
		this.strValue = strValue;
		this.num = num;
 	}
	public String getStrValue() {
		return strValue;
	}
	
	public void setStrValue(String strValue) {
		this.strValue = strValue;
	}
	
	public int getNum() {
		return num;
	}
	
	public void setNum(int num) {
		this.num = num;
	}
	
	@Override
	public String toString() {
		return "Data [strValue=" + strValue + ", num=" + num + "]";
	}
}
