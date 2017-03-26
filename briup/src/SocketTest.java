import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;

public class SocketTest {
	
	private Socket socket;
	private String ip = "127.0.0.1";
	private int port = 9999;
	InputStream in = null;
	BufferedReader br = null;
	OutputStream out = null;
	PrintWriter pw = null;
	public void connect(){
		try {
			//ֻҪ��������ܴ����ɹ�����˵���Ѿ����ӵ���������
			socket = new Socket(ip,port);
			System.out.println("�ͻ����Ѿ����ӵ�������");
			in = socket.getInputStream();
			
			br = new BufferedReader(new InputStreamReader(in));
			
			String str = br.readLine();
			
			System.out.println("�ͻ��˽��ܵ����������͵����ݣ�"+str);
			
			out = socket.getOutputStream();
			
			pw = new PrintWriter(new OutputStreamWriter(out));
			
			pw.println("������ʯ������");
			pw.close();
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}finally{
			try {
				if(in!=null) in.close();
				if(br!=null) br.close();
				if(out!=null) out.close();
				if(pw!=null) pw.close();
				if(socket!=null) socket.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	public static void main(String[] args) {
		SocketTest s = new SocketTest();
		s.connect();
	}
}
