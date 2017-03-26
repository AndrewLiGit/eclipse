class Outer{
	int score = 95;
	void inst(){
		class Inner{
			void display(){
				System.out.println("³É¼¨£ºscore="+score);
			}
		}
		Inner in=new Inner();
		in.display();
	}
	
}
public class InnerClassDemo4 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
          Outer outer = new Outer();
          outer.inst();
          }

}
