class Person{
	String name;
	int age;
	public Person(){
		System.out.println("1.public Person(){}");
	}
}
class Student extends Person{
	String school;
	public Student(){
		System.out.println("2.public Student(){}");
	}
}
public class TestPersonStudentDemo1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
         Student s=new Student();
	}

}
