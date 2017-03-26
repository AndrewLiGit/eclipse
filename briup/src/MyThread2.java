import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PipedInputStream;
import java.io.PrintWriter;

//���ã���ȡ�ܵ��е����ݣ����Ұ�����д���ⲿ���ļ�����
public class MyThread2 extends Thread{

	private PipedInputStream in;
	private BufferedReader br;
	private PrintWriter pw;
	
	public MyThread2(PipedInputStream in) {
		this.in = in;
	}

	@Override
	public void run() {

		try {
			br = new BufferedReader(new InputStreamReader(in));
			
			File file = new File("src/myThread.txt");
			pw = new PrintWriter(new OutputStreamWriter(new FileOutputStream(file)));
			
			//�ӹܵ������ȡһ������
			String str = br.readLine();
			
			while(!"bye".equals(str)&&str!=null){
				pw.println(str);
				pw.flush();
				str = br.readLine();
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}finally{
			try {
				if(in!=null) in.close();
				if(br!=null) br.close();
				if(pw!=null) pw.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
