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
		return "���ǣ�"+name+"�����꣺"+age+"��";
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
          Student s=new Student("����",25,"����");
          System.out.println("��ѧУ��"+s.school+"��ͨ��ѧ");
          System.out.println("�ټ�����񣡣����ߣ�������");
	}

}
