public class Selection{
	public static void main(String []args){

		int []array=new int[]{2,5,1,6,3,8,4};
		
		System.out.println("===before sort");
		for(int i=0;i<array.length;i++){
			System.out.print(array[i]+"\t");
		}
		System.out.println();

		for(int i=0;i<array.length-1;i++){
			int index=i;
			for(int j=i+1;j<array.length;j++){
				if(array[index]>array[j]){
					index=j;
				}
			}
			if(index!=i){
				int temp=array[i];
				array[i]=array[index];
				array[index]=temp;
			}
		}

		System.out.println("===After sort");

		for(int i=0;i<array.length;i++){
			System.out.print(array[i]+"\t");
		}
		System.out.println();
	}
}
