package ClassAndObject;

 /**
 * Teacher.java
 * 2016��5��3������11:11:33
 * @author cbb
 * TODO ����������֮���ϵ֮������ϵ��һ����Ķ�����Ϊ����һ����ĳ�Ա����
 */
public class Teacher {
	public int getStudAge(Student stu){
		return stu.getStudentAge();
	}
	public static void main(String args[]){
		Student student = new Student(26,"cbb");
		Teacher teach = new Teacher(); 
		System.out.println(teach.getStudAge(student));
	}
}
