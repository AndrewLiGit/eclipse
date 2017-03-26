
public class TestJavashuzu {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
          int[] score={7,3,8,19,6,22};
          largest(score);
	}
	public static void largest(int arr[]){
		int tem=arr[0];
		for(int i=0;i<arr.length;i++)//{
			if(tem<arr[i])
				tem=arr[i];
		//}
		System.out.println("×î´óÊý£º"+tem);
	}

}
