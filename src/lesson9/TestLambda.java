package lesson9;

import java.util.Arrays;

public class TestLambda {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		abcde(new TestInterface() {
			@Override
			public int process(int x, int y) {
				return x + y;
			}
		});
		abcde(new TestInterface() {
			@Override
			public int process(int x, int y) {
				return x - y;
			}
		});
// typedef int (*call)(int, int);
// (*call)(3,5)
		int z = 10;
		TestInterface	ti = TestLambda::add;
		TestInterface	ti2 = (x,y)->x+y+z;
		
		abcde(TestLambda::add);
		abcde(TestLambda::subtract);
		abcde((x,y)->{
			// sdkjfhkjsdfhkjsdhf
			return x+y;
		});
		Class	cl = TestLambda.class;
		System.err.println("MEthods: "+Arrays.toString(cl.getDeclaredMethods()));
	}

	static void abcde(final TestInterface p) {
		System.err.println("result="+p.process(3, 5));
	}
	
	static int add(int x, int y) {
		return x + y;
	}

	static int subtract(int x, int y) {
		return x - y;
	}
}
