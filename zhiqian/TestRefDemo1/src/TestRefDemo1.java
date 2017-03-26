class Person{
	String name;
	int age;
}
public class TestRefDemo1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
          Person p1=null;
          Person p2=null;
          p1=new Person();
          p1.name="张三";
          p1.age=25;
          p2=p1;
          System.out.println("姓名："+p2.name);
          System.out.println("年龄："+p2.age);
          p1=null;
          p2=null;
	}

}
