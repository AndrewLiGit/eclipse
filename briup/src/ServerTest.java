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
			
			System.out.println("服务器启动成功，监听端口号"+port);
			System.out.println("服务器正在等待客户端的连接");
			
			client = server.accept();
			
			System.out.println("服务器连接到一个客户端："+client.getInetAddress().getHostName());
			
			out = client.getOutputStream();
			
			pw = new PrintWriter(new OutputStreamWriter(out));
			
			pw.println("你好，请问你是谁？");
			pw.flush();
			
			in = client.getInputStream();
			
			br = new BufferedReader(new InputStreamReader(in));
			
			String string = br.readLine();
			System.out.println("服务器接受到客户端传送的数据："+string);
			
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
