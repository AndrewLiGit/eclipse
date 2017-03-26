class Person{
     public void fun1(){
    	 System.out.println("1.Person{fun1()}");
     }
     public void fun2(){
    	 System.out.println("2.Person{fun2()}");
     }
}
class Student extends Person{
	public void fun1(){
		System.out.println("3.Person{fun1()}");
	}
	public void fun4(){
		System.out.println("4.person{fun4()}");
	}
}
public class TestJavaDemo1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
          Person p=new Student();
          p.fun1();
          p.fun2();
	}

}
