import java.util.Scanner;
public class CheckEmail {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
            System.out.println("请输入邮箱地址：");
            Scanner scanner=new Scanner(System.in);
            String emailAddress=null;
            if(scanner.hasNext()){
            	emailAddress=scanner.next();
            }
            if(emailAddress.length()<3){
            	System.out.println("邮箱地址过短，程序退出。");
            	return;
            }
            if(emailAddress.indexOf('@')<1){
            	System.out.println("邮箱地址格式不正确，缺少@，程序退出。");
            	return;
            }
            String emailParts[]=emailAddress.split("[@]");
            if(emailParts.length!=2){
            	System.out.println("邮箱格式不正确，缺少@，程序退出。");
            	return;
            }
            if(!emailParts[0].matches("\\w+")){
            	System.out.println("邮箱格式不正确，程序退出。");
            	return;
            }
            if(emailParts[1].toLowerCase().indexOf("www")>-1){
            	System.out.println("邮箱格式不正确，程序退出。");
            	return;
            }
            System.out.println("正确的邮箱的地址："+emailAddress);
	}

}
