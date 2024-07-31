package lesson9;

public class Exercies {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		test(/*вложенный нестатический*/);
		test(/*вложенный статический*/);
		test(/*анонимный*/);
		test(/*лямбда*/);
	}

	static void test(TestInterface ti) {
		System.err.println("Result="+ti.process(2, 4));
	}
}
