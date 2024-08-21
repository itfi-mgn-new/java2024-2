package lesson13;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintStream;
import java.io.Reader;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;
import java.util.zip.ZipOutputStream;

public class ZipTEst {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		try(final OutputStream	os = new FileOutputStream("c:/temp/z.zip");
			final ZipOutputStream zos = new ZipOutputStream(os)) {
			
			ZipEntry ze = new ZipEntry("mytest/part1");
			ze.setMethod(ZipEntry.DEFLATED);
			
			zos.putNextEntry(ze);
			final PrintStream ps = new PrintStream(zos);

			ps.println("test string");
			ps.flush();
			
			ze = new ZipEntry("mytest/part2");
			ze.setMethod(ZipEntry.DEFLATED);
			
			zos.putNextEntry(ze);

			final PrintStream ps1 = new PrintStream(zos);

			ps1.println("test string 2");
			ps1.flush();
			
			zos.finish();
		}
		
		try(final InputStream is = new FileInputStream("c:/temp/z.zip");
			final ZipInputStream zis = new ZipInputStream(is)) {
			ZipEntry ze = zis.getNextEntry();
			System.err.println("Name="+ze.getName());
			final Reader rdr = new InputStreamReader(zis);
			final BufferedReader brdr = new BufferedReader(rdr); 
			
			System.err.println("Content: "+brdr.readLine());

			ZipEntry ze2 = zis.getNextEntry();
			System.err.println("Name="+ze2.getName());
			final Reader rdr2 = new InputStreamReader(zis);
			final BufferedReader brdr2 = new BufferedReader(rdr); 
			
			System.err.println("Content: "+brdr2.readLine());
		
			ZipEntry ze3 = zis.getNextEntry();
			System.err.println("Ze3= "+ze3);
		}
	}

}
