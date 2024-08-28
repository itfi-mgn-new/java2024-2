package lesson14;

import java.util.ArrayList;
import java.util.List;

public class Example<T, U extends Number> {
	
	private T value;
	private U value2;

	public static void main(String[] args) throws NoSuchFieldException, SecurityException {
		// TODO Auto-generated method stub
		System.err.println(Example.class.getDeclaredField("value"));
		System.err.println(Example.class.getDeclaredField("value2"));
		Example<String, Long> s = new Example<String, Long>();
		s.value = "test string";
		s.value2 = Long.valueOf(10);
		
		Example<Integer, Double> i = new Example<Integer, Double>();
		i.value = 10;
		i.value2 = 3.5;
		i.value2.isNaN();
	}

}

class MyExample extends Example<String, Long> {
	
}
