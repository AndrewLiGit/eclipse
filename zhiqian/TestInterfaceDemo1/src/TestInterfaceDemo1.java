interface Person{
	String name="����";
	int age=25;
	String occupation="ѧ��";
	public abstract String talk();
}
class Student implements Person{
	public String talk(){
		return "ѧ������>������"+this.name+"�����䣺"+this.age+"��ְҵ��"+this.occupation+"!";
	}
}
public class TestInterfaceDemo1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
         Student s=new Student();
         System.out.println(s.talk());
	}

}
