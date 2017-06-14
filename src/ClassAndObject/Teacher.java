package ClassAndObject;

 /**
 * Teacher.java
 * 2016年5月3日下午11:11:33
 * @author cbb
 * TODO 测试类与类之间关系之关联关系，一个类的对象作为另外一个类的成员变量
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
