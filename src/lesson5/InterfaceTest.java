package lesson5;

public class InterfaceTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Class1	cl1 = new Class1();
		call(cl1);	//cl1.print();
		Class2	cl2 = new Class2();
		call(cl2);	//cl2.print();
	}
	
	static void call(PrintOwner x) {
		x.print();	// invokeinterface
	}
}

interface PrintOwner {
	/*public static final */ int x = (int)Math.random();
	/*public abstract */ void print();
	static int add(int x, int y) {
		return x + y;
	}
	
	default void print(int x) {
		print();
	}
}

interface Test {
	void print();
}

class Class1 implements PrintOwner, Test {
	public void print() {
		System.err.println("CLASS 1 print");
	}
}

class Class2 implements PrintOwner {
	public void print() {
		System.err.println("CLASS 2 print");
	}
}
