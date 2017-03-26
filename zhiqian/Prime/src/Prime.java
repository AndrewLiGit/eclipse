public class Prime{
	public static void main(String[] args){
		int count = 0;
		for(int i = 101;i < 200;i+= 2){
			for(int j=2;j<=i;j++){
				if(i%j==0&&i!=j){
					break;
				}else if(i==j){
					System.out.print(i+" ");
					count++;
				}
		   }
		}
		  System.out.println("\n" + "Total "+ count + " prime number between 101 and 200");
	}
}
