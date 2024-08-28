package lesson14;

import java.util.ArrayList;
import java.util.List;

public class CollectionTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer>	l = new ArrayList();
	
		l.add(Integer.valueOf(10));
//		l.add(Double.valueOf(10));
//		l.add("test string");
		
		System.err.println("Size="+l.size());
		System.err.println("l[0]="+l.get(0));
//		System.err.println("l[1]="+l.get(1));
//		System.err.println("l[2]="+l.get(2));
		
		int	x = /*(Integer)*/l.get(0);
		System.err.println("X="+x);
	}

}
