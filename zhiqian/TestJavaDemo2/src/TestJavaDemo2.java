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
public class TestJavaDemo2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated 
		
		Person p=new Student();
		Student s=(Student)p;
        p.fun1();
        p.fun2();
	}

}
