import java.util.HashSet;
import java.util.Set;


public class SetTest {
	public static void main(String[] args) {
		Set<Character> set = new HashSet<Character>();
		String string = "helloworldnihaosanggegoogabcdabcbufbububbnunununumumujiejie";
		char[] cArray = string.toCharArray();
		for(Character c:cArray){
			set.add(c);
		}
		for(Character c:set){
			System.out.print(c+" ");
		}
	}
}
