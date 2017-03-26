
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapTest {
	public static void main(String[] args) {
		Map<Character, Integer> map = new HashMap<Character, Integer>();
		String string = "helloworldnihaosanggegoogabcdabcbufbububbnunununumumujiejie";
		char[] cArray = string.toCharArray();
		for(char c:cArray){
			Integer v = map.get(c);
			if(v==null){
				map.put(c, 1);
			}else{
				map.put(c, v+1);
			}
		}
		Set<Character> set = map.keySet();
		for(Character k:set){
			Integer v = map.get(k);
			System.out.println(k+":"+v);
		}
	}
}
