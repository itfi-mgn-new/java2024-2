package lesson13;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetSocketAddress;

public class UdpTest {

	public static void main(String[] args) throws IOException, InterruptedException {
		Thread	t = new Thread(()->{
			try(final DatagramSocket socket = new DatagramSocket(2001)) {
				byte[]	content = new byte[100];
				final DatagramPacket dp = new DatagramPacket(content, content.length); 
				
				socket.receive(dp);
				System.err.println("Receive: "+dp.getLength());
			} catch (Exception exc) {
				exc.printStackTrace();
			}
		});
		t.start();
		Thread.sleep(1000);
		
		try(final DatagramSocket socket = new DatagramSocket(2000)) {
			byte[]	content = "test string".getBytes();
			
			socket.send(new DatagramPacket(content, content.length,
					new InetSocketAddress("localhost", 2001)));
			System.out.println("Sent");
		}
	}

}
