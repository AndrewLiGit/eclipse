class Person {
	String name;
	int age;
	Person(String name,int age){
		this.name=name;
		this.age=age;
	}
	boolean compare(Person p){
		if(this.name.equals(p.name)&&this.age==p.age){
			return true;
		}
		else{
			return false;
		}
	}
}
public class TestCompare {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
          Person p1=new Person("����",30);
          Person p2=new Person("����",30);
          System.out.println(p1.compare(p2)?"��ȣ���ͬһ���ˣ�":"����ȣ�����ͬһ���ˣ�");
	}

}
