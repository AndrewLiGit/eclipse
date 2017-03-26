class Person extends Object
{
     String name="张三";
     int age=25;
     public String toString(){
    	 return "我是："+this.name+"，年龄："+this.age+"岁";
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
