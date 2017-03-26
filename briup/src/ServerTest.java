import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerTest {

	private ServerSocket server;
	private int port = 9999;
	PrintWriter pw = null;
	OutputStream out = null;
	Socket client = null;
	InputStream in = null;
	BufferedReader br = null;
	
	public void start(){
		try {
			server = new ServerSocket(port);
			
			System.out.println("�����������ɹ��������˿ں�"+port);
			System.out.println("���������ڵȴ��ͻ��˵�����");
			
			client = server.accept();
			
			System.out.println("���������ӵ�һ���ͻ��ˣ�"+client.getInetAddress().getHostName());
			
			out = client.getOutputStream();
			
			pw = new PrintWriter(new OutputStreamWriter(out));
			
			pw.println("��ã���������˭��");
			pw.flush();
			
			in = client.getInputStream();
			
			br = new BufferedReader(new InputStreamReader(in));
			
			String string = br.readLine();
			System.out.println("���������ܵ��ͻ��˴��͵����ݣ�"+string);
			
		} catch (IOException e) {
			e.printStackTrace();
		}finally{
			try {
				if(pw!=null) pw.close();
				if(out!=null) out.close();
				if(client!=null) client.close();
				if(in!=null) in.close();
				if(br!=null) br.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	public static void main(String[] args) {
		ServerTest t = new ServerTest();
		t.start();
	}
}
