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
          p1.name="����";
          p1.age=25;
          p2=p1;
          System.out.println("������"+p2.name);
          System.out.println("���䣺"+p2.age);
          p1=null;
          p2=null;
	}

}
