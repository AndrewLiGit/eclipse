class Person{
	private String name="����";
	private int age=25;
	public String talk(){
		return "���ǣ�"+name+"�����䣺"+age+"��";
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
