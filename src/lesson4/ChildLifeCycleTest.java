package lesson4;

public class ChildLifeCycleTest extends LifeCycleTest {
	static final int	x = 1000+10;		// ConstantValue			
	static final double	y = 1000+Math.random();

	static {
		System.err.println("Child class init");
	}
	
	final int		z = 1000+20;
	final double 	t = 1000+Math.random();
	
	{
		System.err.println("Child Creation");
	}
	
	public ChildLifeCycleTest() {
		super(123.0);
	}
	
	public static void main(String[] args) {
		System.err.println("Hello world");
		ChildLifeCycleTest	clc = new ChildLifeCycleTest();
		System.err.println("After create");
		
		int x = 30;
		
		System.err.println("X="+LifeCycleTest.x);
		System.err.println("Z="+((LifeCycleTest)clc).z);
		
		clc.staticPrint();	// ChildLifeCycleTest.staticPrint();
		clc.print(/*clc*/);

		LifeCycleTest	clc2 = new ChildLifeCycleTest();

		clc2.staticPrint();	// LifeCycleTest.staticPrint();
		clc2.print(/*clc2*/);
	
		clc = null;
	}

	static void staticPrint() {
		System.err.println("Child lifecycle static "+x);
	}

	@Override
	void print(/*ChildLifeCycleTest this*/) {
		System.err.println("Child lifecycle print "+this.z);
		super.print(/*this*/);	// 
	}
	//										VMT		this
	// static				invokestatic	-		-
	// non static			invokevirtual   +       +
	// non static super		invokespecial   -       +

	
}
