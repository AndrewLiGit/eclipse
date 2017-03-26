
public class Insertion{
	public static void main(String []args){

		int array[]=new int[]{3,6,1,9,2,6};
		System.out.println("======Before sort======");
		for(int i=0;i<array.length;i++){
			System.out.print(array[i]+"\t");
		}
		System.out.println("\n======After sort======");
		
		for(int i=0;i<array.length;i++){
			int index=i;
			while(index>0&&array[index-1]>array[i]){
				index--;
			}
			int temp=array[i];
			for(int j=i;j>index;j--){
				array[j]=array[j-1];
			}
			array[index]=temp;
		}
		
		for(int i=0;i<array.length;i++){
			System.out.print(array[i]+"\t");
		}
		System.out.println();
	}
}
