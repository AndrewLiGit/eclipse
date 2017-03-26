interface Person{
	public void fun1();
}
class Student implements Person{
	public void fun1(){
		System.out.println("Student fun1()");
	}
}
public class TestInterfaceObject {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
          Person p=new Student();
          p.fun1();
	}

}