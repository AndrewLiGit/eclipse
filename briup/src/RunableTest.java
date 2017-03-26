

public abstract class RunableTest{
	public static void main(String[] args) {
		new Thread(new Runnable() {
			public void run() {
				System.out.println("Runnable run");
			}
		}){
			public void run(){
				System.out.println("subThread run");
			}
		}.start();
	}
}
