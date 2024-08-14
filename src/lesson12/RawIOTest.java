package lesson12;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.util.Arrays;

public class RawIOTest {

	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
		// TODO Auto-generated method stub
		try(final OutputStream	os = new FileOutputStream("c:/temp/ttt.bin");
			final ObjectOutputStream	dos = new ObjectOutputStream(os)) {
		
			dos.writeInt(12);
			dos.writeBoolean(true);
			dos.writeDouble(1.3);
			dos.writeUTF("vassya pupkin");
			dos.writeObject(new int[] {1,2,3});
			dos.writeObject(new FIO("1","2","3",100));
			dos.writeObject(new FIO("3","2","1",10));
			dos.flush();
		}
		try(final InputStream	is = new FileInputStream("c:/temp/ttt.bin");
			final ObjectInputStream	dis = new ObjectInputStream(is)) {
		
			System.err.println(dis.readInt());
			System.err.println(dis.readBoolean());
			System.err.println(dis.readDouble());
			System.err.println(dis.readUTF());
			System.err.println(Arrays.toString((int[])dis.readObject()));
			System.err.println(dis.readObject());
			System.err.println(dis.readObject());
		}

	}

}
