interface Person{
	String name="张三";
	int age=25;
	String occupation="学生";
	public abstract String talk();
}
class Student implements Person{
	public String talk(){
		return "学生——>姓名："+this.name+"，年龄："+this.age+"，职业："+this.occupation+"!";
	}
}
public class TestInterfaceDemo1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
         Student s=new Student();
         System.out.println(s.talk());
	}

}
