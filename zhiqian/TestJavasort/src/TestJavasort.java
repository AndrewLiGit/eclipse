import java.util.*;
public class TestJavasort {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      int a[]={4,32,45,32,65,32,2};
      System.out.print("��������ǰ��˳��");
      for(int i=0;i<a.length;i++)
    	  System.out.print(a[i]+"  ");
      Arrays.sort(a);
      System.out.print("\n����������˳��");
      for(int i=0;i<a.length;i++)
    	  System.out.print(a[i]+"  ");
	}

}
