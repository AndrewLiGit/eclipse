
public class ArrayBasic{
	//基本数据类型的数组
	public void primTest(){
		int[] a;//数组的声明
		//int b[];
		a=new int[3];//创建对象
		System.out.println(a.length);
		System.out.println(a[0]);
		a[0]=23;
		a[1]=24;
		a[2]=25;
	//  b=new int[]{2,3,45,56};
	//  int[] c=new int[]{34,56};
	//  int[] d={2,3,4,45};
	//	int[] e;
	//	e={3,4,5};		
	}
	public void classTest(){
		Student[] stus;
	//	Student stuss[];
		stus=new Student[2];
		System.out.println(stus.length);
		System.out.println(stus[0]);
		stus[0]=new Student("tom",23);
	//	stus[3]=new Student();
		System.out.println(stus[0].name);
	}
	public static void main(String[] args){
		ArrayBasic ab=new ArrayBasic();
		System.out.println(args.length+"  ....");
		ab.primTest();
		ab.classTest();
	}
}

class Student{
	 String name;
	 int age;
	public Student(){}
	public Student(String name,int age){
		this.age=age;
		this.name=name;
	}

}
