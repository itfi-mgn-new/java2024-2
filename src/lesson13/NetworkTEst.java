package lesson13;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class NetworkTEst {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Thread	t = new Thread(()->{
			try(final ServerSocket ss = new ServerSocket(2000)) {
				try(final Socket s = ss.accept();
					final InputStream is = s.getInputStream();
					final OutputStream os = s.getOutputStream()) {
					System.err.println("Connected");
					System.err.println("port="+s.getPort());
				}
			} catch(Exception exc) {
				exc.printStackTrace();
			}
		});
		t.start();
		try(final Socket s = new Socket("localhost", 2000);
			final InputStream is = s.getInputStream();
			final OutputStream os = s.getOutputStream()) {
			System.out.println("Connected");
			System.out.println("port="+s.getLocalPort());
		}
	}

}
