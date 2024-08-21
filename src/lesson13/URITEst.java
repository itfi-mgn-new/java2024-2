package lesson13;

import java.io.IOException;
import java.io.InputStream;
import java.net.Proxy;
import java.net.URL;

public class URITEst {
	public static void main(final String[] args) throws IOException {
		final URL url = new URL("file://./c:/temp/z.zip");
	
		try(final InputStream is = url.openStream()) {
			System.err.println("Connected");
		}
	}
}
