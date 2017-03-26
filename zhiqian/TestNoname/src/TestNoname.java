class Person{
	private String name="张三";
	private int age=25;
	public String talk(){
		return "我是："+name+"，年龄："+age+"岁";
	}
}
public class TestNoname {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
          System.out.println(new Person().talk());
          
	}

}
