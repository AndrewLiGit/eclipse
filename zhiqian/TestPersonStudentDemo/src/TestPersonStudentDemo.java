class Person{
	String name;
	int age;
}
class Student extends Person{
	String school;
}
public class TestPersonStudentDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
          Student s=new Student();
          s.name="����";
          s.age=25;
          s.school="����";
          System.out.println("������"+s.name+"�����䣺"+s.age+"��ѧУ��"+s.school);
	}

}
