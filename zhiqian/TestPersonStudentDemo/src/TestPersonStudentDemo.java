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
          s.name="张三";
          s.age=25;
          s.school="北京";
          System.out.println("姓名："+s.name+"，年龄："+s.age+"，学校："+s.school);
	}

}
