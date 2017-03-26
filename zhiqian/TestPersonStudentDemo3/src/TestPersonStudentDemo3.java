class Person{
	String name;
	int age;
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
	
	public Person(){
		
	}
	public String talk(){
		return "我是："+name+"，今年："+age+"岁";
	}
}
class Student extends Person{
	String school;
	public Student(String name,int age,String school){
		super.name=name;
		super.age=age;
		System.out.print(super.talk());
		this.school=school;
	}
}
public class TestPersonStudentDemo3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
          Student s=new Student("张三",25,"北京");
          System.out.println("，学校："+s.school+"交通大学");
          System.out.println("再见，李怀振！！！哼！！！！");
	}

}
