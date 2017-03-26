
import java.util.Set;
import java.util.TreeSet;

public class TreeSetTest {
	public static void main(String[] args) {
		
		Set<StudentTreeSet> set = new TreeSet<StudentTreeSet>();
		
		set.add(new StudentTreeSet("tom",21,4,6,8));
		set.add(new StudentTreeSet("jack",26,4,6,8));
		set.add(new StudentTreeSet("tin",20,4,6,8));
		set.add(new StudentTreeSet("kaka",28,4,6,8));
		set.add(new StudentTreeSet("mixi",23,4,6,8));
	
		for(StudentTreeSet s:set){
			System.out.println(s);
		}
	}
}
