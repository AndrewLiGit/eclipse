class Outer{
	int score = 95;
	void inst(){
		Inner inner=new Inner();
		inner.display();
	}
	class Inner{
		void display(){
			System.out.println("³É¼¨£ºscore="+score);
		}
	}
}
public class InnerClassDemo3 {
     public static void main(String[] args) {
          Outer outer=new Outer();
          Outer.Inner inner=outer.new Inner();
          inner.display();
	}

}
