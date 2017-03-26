class Person{
	private String name;
	private int age;
	public Person(String name,int age){
		this.name=name;
		this.age=age;
	}
}
public class TestOverEquals {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
           Person p1=new Person("张三",25);
           Person p2=new Person("张三",25);
           System.out.println(p1.equals(p2)?"是同一个人":"不是同一个人");
	}

}
