package lesson13;

import java.io.File;

public class FileTEst {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File	f = new File("c:/temp/");
		for (File item : f.listFiles()) {
			System.err.println("Item="+item);
		};
	}
}
