abstract class Person{
	String name;
	int age;
	String occupation;
	public abstract String talk();
}
class Student extends Person{
	public Student(String name,int age,String occupation)
	{
		this.name=name;
		this.age=age;
		this.occupation=occupation;
		
	}
	public String talk(){
        return "ѧ����������>������"+this.name+"�����䣺"+this.age+"��ְҵ��"+this.occupation+"��";		
	}
}
class Worker extends Person{
	public Worker(String name,int age,String occupation){
	this.name=name;
	this.age=age;
	this.occupation=occupation;
	}
	public String talk(){
        return "���ˡ�������>������"+this.name+"�����䣺"+this.age+"��ְҵ��"+this.occupation+"��";		
   }
}
class TestAbstractDemo1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
         Student s=new Student("����",25,"ѧ��");
         Worker w=new Worker("����",30,"����");
         System.out.println(s.talk());
         System.out.println(w.talk());       
     }
}
