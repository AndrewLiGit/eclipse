import java.io.IOException;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;

public class MyThreadTest {
	
	public static void main(String[] args) {
		
		try {
			PipedInputStream in = new PipedInputStream();
			PipedOutputStream out = new PipedOutputStream();
			
			in.connect(out);
			
			Thread t1 = new MyTread1(out);
			Thread t2 = new MyThread2(in);
			
			t1.start();
			t2.start();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
