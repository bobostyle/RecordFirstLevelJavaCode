package ClassAndObject;

 /**
 * Student.java
 * 2016��5��3������11:11:20
 * @author cbb
 * TODO
 */
public class Student {
 
	private int studentAge;
 	public String studentName;
 	public Student(int age, String name){
 		studentAge = age;
 		studentName = name;
 	}
 	public int getStudentAge(){
 		return studentAge;
 	}
}
