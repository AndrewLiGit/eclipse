class Outer{
	int score=95;
	void inst(final int s){
		final int temp=20;
		class Inner{
			void display(){
				System.out.print("³É¼¨£ºscore="+(score+temp+s));
			}
		}
		Inner in=new Inner();
		in.display();
	}
}
public class TestClassDemo5 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
          Outer outer=new Outer();
          outer.inst(5);
	}

}
