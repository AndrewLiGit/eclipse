
public class TestJavaswitch {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      int a=100,b=7;
      char oper='/';
      switch(oper)
      {
         case'+':
        	 System.out.println(a+"+"+b+"="+(a+b));
        	 break;
         case'-':
        	 System.out.println(a+"-"+b+"="+(a-b));
        	 break;
         case'*':
        	 System.out.println(a+"*"+b+"+"+(a*b));
        	 break;
         case'/':
        	 System.out.println(a+"/"+b+"="+((float)a/b));
        	 break;
         default:
        	 System.out.println("Î´ÖªµÄ²Ù×÷£¡");
      }
	}

}
