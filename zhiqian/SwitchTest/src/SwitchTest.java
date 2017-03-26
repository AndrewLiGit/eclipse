

public class SwitchTest{
	
	public void isGreat(int month){
		int res=10;
		switch(month){
		   case 1:res+=10;
		   case 3:res+=10;
		   case 5:
		   case 7:
		   case 8:
		   case 10:
		   case 12:
			System.out.println("true");
			System.out.println(res);
			break;
		   case 2:
		   case 4:
		   case 6:
		   case 9:
		   case 11:
			System.out.println("false");
			break;  
		 default:
			System.out.println("illege month");

		}	
	}
//	public void swStr(String str){
//
//		switch(str){
//			case "abc":
//				System.out.println("abc....");
//				break;
//			default:
//				System.out.println("false");
//		}
//	}
	public static void main(String[] args){
		SwitchTest st=new SwitchTest();

		st.isGreat(3);
//		st.swStr("abc");
	}

}
