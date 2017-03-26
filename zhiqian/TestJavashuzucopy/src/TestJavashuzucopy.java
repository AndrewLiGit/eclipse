
public class TestJavashuzucopy {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      int a1[]={1,2,3,4,5};
      int a2[]={9,8,7,6,5,4,3};
      System.arraycopy(a1, 2, a2, 2, 2);
      System.out.print("a1数组中的内容：");
      for(int i=0;i<a1.length;i++)
    	  System.out.print("a1["+i+"]="+a1[i]+"  ");
    	  System.out.println();
      System.out.print("a2数组中的内容：");
      for(int i=0;i<a2.length;i++)
    	  System.out.print("a2["+i+"]="+a2[i]+"  ");
      System.out.println("\n数组拷贝完成！");
	}

}