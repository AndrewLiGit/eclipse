
public class TestJavaerwei {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
         int A[][]={{51,38,82,12,34},{72,64,19,34}};
         int B[][]=new int[2][5];
         B=add10(A);
         for(int i=0;i<B.length;i++){
        	 for(int j=0;j<B[i].length;j++)
        		 System.out.print(B[i][j]+" ");
        	 System.out.print("\n");
         }
	}
           public static int[][] add10(int arr[][]){
        	   for(int i=0;i<arr.length;i++)
        		   for(int j=0;j<arr[i].length;j++)
        			   arr[i][j]+=10;
               return arr;
           }
}
