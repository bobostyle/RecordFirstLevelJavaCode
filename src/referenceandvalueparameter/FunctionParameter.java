package referenceandvalueparameter;

/**
 * Parameter.java
 * 2016��9��8������11:02:17
 * @author cbb
 * TODO ���������е�ֵ��������ô���
 */
public class FunctionParameter {
	
	
	public static void test(String str, String[] strValue){
		str = "new value";
		strValue[0] = "new value";
	}
	
	public static void main(String[] args) {
		String str = "old value";
		String[] strValue = new String[1];
		FunctionParameter.test(str, strValue);
		System.out.println(str);
		System.out.println(strValue[0]);
}
		
	
	
	
	
}
