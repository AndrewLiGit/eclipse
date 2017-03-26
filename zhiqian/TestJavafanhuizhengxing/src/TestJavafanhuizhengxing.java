
public class TestJavafanhuizhengxing {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
          int num;
          num=star(8);
          System.out.println(num+" stars printed");
	}
         public static int star(int n){
        	 for(int i=0;i<2*n;i++)
        		 System.out.print("*");
        	 System.out.print("\n");
        	 return 2*n;
         }
}
