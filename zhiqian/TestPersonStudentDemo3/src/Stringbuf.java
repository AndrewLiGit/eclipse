import java.lang.*;
public class Stringbuf {

	public static void main(String[] args) {

		StringBuffer buf=new StringBuffer();
		StringBuilder builder=new StringBuilder();
		String str1="heihei";
		String str2="hha";
		
		buf.append(str1);
		buf.append(str2);
		//buf.toString();
		builder.append(str1);
		builder.append(str2);
		System.out.println(buf.toString());
		System.out.println(builder.toString());
	}
 
}
