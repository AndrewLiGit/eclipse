
public class ArrayMultiple {
	public static void main(String[] args) {
		int sub=1;
		int[] a = new int[10];
		for(int i=0;i<10;i++){
			a[i]=i+1;
			sub*=a[i];
		}
		System.out.println("数组a[10]的所有元素相乘得："+sub);
	}
}
