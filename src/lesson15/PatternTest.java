package lesson15;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// *.txt
		final Pattern	p = Pattern.compile("(.*)\\.txt");
		final Matcher	m = p.matcher("vassya.txt");
	
		if (m.find()) {
			System.err.println("FOund: "+m.group(1));
		}
		else {
			System.err.println("NOT FOund");
		}
	}

}
