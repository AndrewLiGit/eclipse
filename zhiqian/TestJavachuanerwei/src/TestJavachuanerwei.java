
public class TestJavachuanerwei {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int A[][]={{51,38,22,12,34},{72,64,19,31}};
        print_mat(A);
	}
          public static void print_mat(int arr[][]){
        	  for(int i=0;i<arr.length;i++){
        		  for(int j=0;j<arr[i].length;j++)
        			  System.out.print(arr[i][j]+"  ");
        		  System.out.print("\n");
        	  }
          }
}
