public class Divide{

public static void main(String[] args){
	//if(args.length<1){
	//	System.out.println("please input one numbers!");
	//	System.exit(0);
	//}
	int num=8;
	//int num = Integer.parseInt(args[0]);
	System.out.print(num+"=");
	
	int k = 2;
	for(;k<=num;k++){
		while(k!=num){
			if(num%k==0){
				System.out.print(k+"*");
				num = num/k;
			}else
				break;
		}
	}
	System.out.print(k-1);
	System.out.println();
}}
