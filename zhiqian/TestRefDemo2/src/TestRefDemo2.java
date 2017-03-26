class Chang{
	int x=0;
}

public class TestRefDemo2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
          Chang c=new Chang();
          c.x=25;
          fun(c);
          System.out.println("x="+c.x);
	}
        public static void fun(Chang c1){
        	c1.x=30;
        }
}
