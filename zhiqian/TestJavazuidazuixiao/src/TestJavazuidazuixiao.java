
public class TestJavazuidazuixiao {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      int i,max,min;
      int A[]={74,48,30,17,62};
      min=max=A[0];
      System.out.print("����A��Ԫ�ذ����� ");
      for(i=0;i<A.length;i++)
      {
    	  System.out.print(A[i]+"\t");
    	  if(A[i]>max)
    		  max=A[i];
    	  if(A[i]<min)
    		  min=A[i];
      }
      System.out.println("\n��������ֵ�ǣ�"+max);
      System.out.println("�������Сֵ�ǣ�"+min);
	}

}
