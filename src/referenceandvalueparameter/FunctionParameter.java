package referenceandvalueparameter;

/**
 * Parameter.java
 * 2016年9月8日下午11:02:17
 * @author cbb
 * TODO 方法参数中的值传入和引用传入
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
