package lesson11;

import java.io.UnsupportedEncodingException;
import java.util.Arrays;

public class StringTest {

	public static void main(String[] args) throws UnsupportedEncodingException {
		// TODO Auto-generated method stub
		String	s = "vassya";
		
		System.err.println("Length="+s.length());
		System.err.println("s[0]="+s.charAt(0));
		System.err.println("s[0]="+s.codePointAt(0));
		System.err.println("index="+s.indexOf("a"));
		System.err.println("lastindex="+s.lastIndexOf("a"));
		System.err.println("index="+s.indexOf("a", 2));
		System.err.println("index="+s.indexOf(118, 0));
	
		System.err.println("equals="+s.equals("vassya"));
		System.err.println("equals="+(s == "vassya"));
		System.err.println("equalsIgnoreCase="+s.equalsIgnoreCase("vAsSyA"));
	
		System.err.println("lower="+s.toLowerCase());
		System.err.println("upper="+s.toUpperCase());
	
		System.err.println("equalsIgnoreCase="+s.toUpperCase().equals("VASSYA"));

		System.err.println("compareTo="+s.compareTo("petya"));
		System.err.println("compareToIgnoreCase="+s.compareToIgnoreCase("petya"));

		System.err.println("Starts with: "+s.startsWith("vas"));
		System.err.println("Ends with: "+s.endsWith("sya"));
		System.err.println("Contains: "+s.contains("ass"));
		
		System.err.println(/*new StringBuider().append(*/"Replace: "/*).append(*/+s.replace("v",""));
		System.err.println("Split: "+Arrays.toString(s.split("a")));
		
		System.err.println("Bytes: "+Arrays.toString(s.getBytes("cp866")));
		
		System.err.println("Get: "+new String(new byte[] {118,97}, "cp866"));
	
		System.err.println(String.format("%1$d = %2$s", 5, "пять"));
		
		StringBuilder	sb = new StringBuilder();
		
		String q = sb.append("I'm ").append(21).append(" years old!").toString();
	
		System.err.println(q);

		switch (s/*.hashCode()*/) {
			case "vassya"/*.hashCode()*/ :
				/*if (s.equals("vassya")) {*/
				System.err.println("Vassya detected!");
				/*}*/
				break;
			case "petya" :
				System.err.println("Petya detected!");
				break;
			default :
				System.err.println("Others detected!");
		}
	}

}
