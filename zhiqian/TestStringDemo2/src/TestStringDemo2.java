class Person extends Object
{
     String name="����";
     int age=25;
     public String toString(){
    	 return "���ǣ�"+this.name+"�����䣺"+this.age+"��";
     }
}
public class TestStringDemo2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
         Person p=new Person();
         System.out.println(p);
	}

}
