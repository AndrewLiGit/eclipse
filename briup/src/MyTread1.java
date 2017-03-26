import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PipedOutputStream;
import java.io.PrintWriter;

//作用：读取控制台中输入的数据，并且把数据写到管道里面
public class MyTread1 extends Thread{
	
	private BufferedReader br;
	private PipedOutputStream out;
	private PrintWriter pw;
	
	public MyTread1(PipedOutputStream out) {
		this.out = out;
	}

	@Override
	public void run() {
		try {
			br = new BufferedReader(new InputStreamReader(System.in));
			
			pw = new PrintWriter(new OutputStreamWriter(out));
			
			String str = br.readLine();
			
			while(!"bye".equals(str)&&str!=null){
				pw.println(str);
				pw.flush();
				str = br.readLine();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}finally{
			try {
				if(out!=null) out.close();
				if(pw!=null) pw.close();
				if(br!=null) br.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
