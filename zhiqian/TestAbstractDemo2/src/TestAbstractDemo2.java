abstract class Person{
	String name;
	int age;
	String occupation;
	public Person (String name,int age,String occupation){
		this.name=name;
		this.age=age;
		this.occupation=occupation;
		
	}
	public abstract String talk();
}
class Student extends Person{
    public Student(String name,int age,String occupation){   
	super(name,age,occupation);
    }
    public String talk(){
    	return "ѧ������>������"+this.name+"�����䣺"+this.age+"��ְҵ��"+this.occupation+"!";
    }
}
public class TestAbstractDemo2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
         Student s=new Student("����",25,"ѧ��");
         System.out.println(s.talk());
         
	}

}
