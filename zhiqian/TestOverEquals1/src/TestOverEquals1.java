class Person{
	private String name;
	private int age;
	public Person(String name,int age){
		this.name=name;
		this.age=age;
	}
	public boolean equals(Object o){
		boolean temp=true;
		Person p1=this;
		if(o instanceof Person){
			Person p2=(Person)o;
			if(!(p1.name.equals(p2.name)&&p1.age==p2.age)){
				temp=false;
			}
		}
		else{
			temp=true;
		}
		return temp;
	}
}
public class TestOverEquals1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
          Person p1=new Person("张三",25);
          Person p2=new Person("张三",25);
          System.out.println(p1.equals(p2)?"同一个人":"不是同一人");
	}

}
