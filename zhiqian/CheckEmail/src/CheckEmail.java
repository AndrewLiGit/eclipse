import java.util.Scanner;
public class CheckEmail {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
            System.out.println("�����������ַ��");
            Scanner scanner=new Scanner(System.in);
            String emailAddress=null;
            if(scanner.hasNext()){
            	emailAddress=scanner.next();
            }
            if(emailAddress.length()<3){
            	System.out.println("�����ַ���̣������˳���");
            	return;
            }
            if(emailAddress.indexOf('@')<1){
            	System.out.println("�����ַ��ʽ����ȷ��ȱ��@�������˳���");
            	return;
            }
            String emailParts[]=emailAddress.split("[@]");
            if(emailParts.length!=2){
            	System.out.println("�����ʽ����ȷ��ȱ��@�������˳���");
            	return;
            }
            if(!emailParts[0].matches("\\w+")){
            	System.out.println("�����ʽ����ȷ�������˳���");
            	return;
            }
            if(emailParts[1].toLowerCase().indexOf("www")>-1){
            	System.out.println("�����ʽ����ȷ�������˳���");
            	return;
            }
            System.out.println("��ȷ������ĵ�ַ��"+emailAddress);
	}

}
