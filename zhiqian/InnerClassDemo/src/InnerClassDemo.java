class Outer{
	int score=95;
	void inst(){
		Inner in = new Inner();
		in.display();
	}
	class Inner{
		void display(){
			System.out.println("�ɼ���score="+score);
		}
	}
}
public class InnerClassDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
          Outer outer=new Outer();
          outer.inst();
	}

}
