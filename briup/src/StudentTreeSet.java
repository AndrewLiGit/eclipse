
public class StudentTreeSet implements Comparable<StudentTreeSet>{
	
	private String name;
	private int age;
	private float english;
	private float computer;
	private float math;
	
	public StudentTreeSet() {}
	public StudentTreeSet(String name, int age, float english, float computer,
			float math) {
		this.name = name;
		this.age = age;
		this.english = english;
		this.computer = computer;
		this.math = math;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public float getEnglish() {
		return english;
	}
	public void setEnglish(float english) {
		this.english = english;
	}
	public float getComputer() {
		return computer;
	}
	public void setComputer(float computer) {
		this.computer = computer;
	}
	public float getMath() {
		return math;
	}
	public void setMath(float math) {
		this.math = math;
	}
	@Override
	//x>0     s1>s2
	//x<0     s1<s2
	//int x = s1.compareTo(s2)
	public int compareTo(StudentTreeSet o) {	
		return this.age-o.age;
	}
	@Override
	public String toString() {
		return "name=" + name + ", age=" + age + ", english="
				+ english + ", computer=" + computer + ", math=" + math;
	}
}