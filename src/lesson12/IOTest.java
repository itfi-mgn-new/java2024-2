package lesson12;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.io.Reader;
import java.io.Writer;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;

public class IOTest {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		// TODO Auto-generated method stub
		try(final OutputStream	os = new FileOutputStream("c:/temp/zzz.bin");
			final GZIPOutputStream	gzos = new GZIPOutputStream(os);
			final PrintWriter	pw = new PrintWriter(gzos)) {
			
//			os.write('a');
//			os.write('b');
//			os.write('c');
//			os.write('d');
//			os.write('e');
//			os.write(new byte[] {'e','d','c','b','a'});
//			
//			os.flush();

			pw.println("vassya pupkin");
			pw.flush();
			
		} // finally {
		// os2.close();
		// os.close();
		// }
		try(final InputStream	is = new FileInputStream("c:/temp/zzz.bin");
			final GZIPInputStream	gzis = new GZIPInputStream(is);
			final Reader		rdr = new InputStreamReader(gzis);
			final BufferedReader	brdr = new BufferedReader(rdr)) {
			
			System.err.println("line="+brdr.readLine());
			
//			char[]	buffer = new char[100];
//			System.err.println(rdr.read(buffer));
//			System.err.println(rdr.read(buffer));
			
		}
	}

}
