
public class ArrayMultiple {
	public static void main(String[] args) {
		int sub=1;
		int[] a = new int[10];
		for(int i=0;i<10;i++){
			a[i]=i+1;
			sub*=a[i];
		}
		System.out.println("����a[10]������Ԫ����˵ã�"+sub);
	}
}
