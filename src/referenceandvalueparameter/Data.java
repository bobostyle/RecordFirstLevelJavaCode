package referenceandvalueparameter;

 /**
 * Data.java
 * 2016��9��8������11:04:28
 * @author cbb
 * TODO java ����ȫ���Ƕ�������
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
