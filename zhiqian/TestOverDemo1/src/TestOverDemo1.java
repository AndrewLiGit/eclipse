class Person {
	String name;
	int age;
	public String talk(){
		return "���ǣ�"+this.name+"�����꣺"+this.age+"��";
	}
}
class Student extends Person{
	String school;
	public Student(String name,int age,String school){
		this.name=name;
		this.age=age;
		this.school=school;
	}
	public String talk(){
		return super.talk()+".\n����"+this.school+"��ѧ.";
	}
}
public class TestOverDemo1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
          Student s=new Student("����",25,"����");
          System.out.println(s.talk());
	}

}
