class Person{
	String name;
	int age;
	public Person(String name,int age){
		this.name=name;
		this.age=age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
}
class Student extends Person{
	String school;
	public Student(){
		  super("张三",25);
	}
}
public class TestPersonStudentDemo2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
          Student s=new Student();
          s.school="北京";
          System.out.println("姓名："+s.name+"，年龄："+s.age+"，学校："+s.school);
	}

}
