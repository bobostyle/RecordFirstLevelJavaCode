package VectorTest;

public class Student  {
  
	public int m_Age;
	public String m_name;
	public String m_sex;
	 
	  Student(int age,String name,String sex){
		  m_Age = age;
		  m_name=name;
		  m_sex=sex;
	}
    
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + m_Age;
		result = prime * result + ((m_name == null) ? 0 : m_name.hashCode());
		result = prime * result + ((m_sex == null) ? 0 : m_sex.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		if (m_Age != other.m_Age)
			return false;
		if (m_name == null) {
			if (other.m_name != null)
				return false;
		} else if (!m_name.equals(other.m_name))
			return false;
		if (m_sex == null) {
			if (other.m_sex != null)
				return false;
		} else if (!m_sex.equals(other.m_sex))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Student [m_Age=" + m_Age + ", m_name=" + m_name + ", m_sex=" + m_sex + "]";
	}

	public static void main(String []args){
		Student stu=new Student(19,"chen","f");
 		System.out.println(stu);
	}
}
