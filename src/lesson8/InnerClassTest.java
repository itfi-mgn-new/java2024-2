package lesson8;

import java.util.Arrays;

public class InnerClassTest {
	static int	x = 10;
	int y = 20;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final Class	cl = NestedClass.class;
		
		System.err.println("COnstructors: "+Arrays.toString(cl.getDeclaredConstructors()));
		System.err.println("Fields: "+Arrays.toString(cl.getDeclaredFields()));
		InnerClassTest owner = new InnerClassTest();
		NestedClass  nc = owner.new NestedClass(/*owner*/);
		NestedStatic ns = new NestedStatic();

		int	a = 100;
		
		class Local {
			int z = 30;
			// int val$a

			public Local(/*int _a*/) {
				// val$1 = _a;
			}
			
			public void print() {
				System.err.println("Sum="+(x+/*val$*/a+z));
			}
		}
		
		Class	cc = Local.class;
		System.err.println("Local constructors: "+Arrays.toString(cc.getDeclaredConstructors()));
		System.err.println("Local fields: "+Arrays.toString(cc.getDeclaredFields()));
		Local	v = new Local();
		
		owner.test();

		TestInterface	ti = new TestInterface() {
			{
				System.err.println("sdlfjksdjkljs");
			}
			@Override
			public void print() {
				// TODO Auto-generated method stub
				System.err.println("SUm="+(x+a));
			}
		};
		
		Class	ac = ti.getClass();

		System.err.println("Anon local constructors: "+Arrays.toString(ac.getDeclaredConstructors()));
		System.err.println("Anon fields: "+Arrays.toString(ac.getDeclaredFields()));
		System.err.println("Interfaces: "+Arrays.toString(ac.getInterfaces()));

		Object	x = new Object(){
			public void test() {
				// sdlvsdlkfjlksdjflkjsdlkfj
			}
		};
		Class	xc = x.getClass();
		System.err.println("Name: "+xc.getName());
		System.err.println("SuperClass: "+xc.getSuperclass());

	
	}

	void test() {
		int a = 20;
		
		class Local {
			int z = 30;

			public Local() {
			}
			
			public void print() {
				System.err.println("Sum="+(x+y+z+a));
			}
		}

		Class	cc = Local.class;
		System.err.println("Non-static local constructors: "+Arrays.toString(cc.getDeclaredConstructors()));
		System.err.println("Local fields: "+Arrays.toString(cc.getDeclaredFields()));
		Local	v = new Local();
		
		TestInterface	ti = new TestInterface() {
			@Override
			public void print() {
				// TODO Auto-generated method stub
				System.err.println("SUm="+(x+y+a));
			}
		};
		
	}
	
	private static class NestedStatic {	// 85%
		static double y = Math.random();
		final static int t = 10;
		int	z = 30;
		
		public NestedStatic() {
		}
		
		public void print() {
			System.err.println("Sum="+(/*InnerClassTest.*/x+/*this$0.*/y+/*this.*/z));
		}
	}
	
	private class NestedClass {		// 15%
		final static int t = 10;
		// INnerClassTest this$0;
		int	z = 30;
		
		public NestedClass(/*_this*/) {
			// this$0 = _this;
		}
		
		public void print() {
			// InnerClassTest.this
			System.err.println("Sum="+(/*InnerClassTest.*/x+/*this$0.*/y+/*this.*/z));
		}
	}
}

interface TestInterface {
	void print();
}
