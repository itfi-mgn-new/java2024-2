package lesson4;

public class LifeCycleTest {
	static final int	x = 10;		// ConstantValue			
	static final double	y = Math.random();
	
    /* public static void <clinit>(){
     * y = Math.random();
     * System.err.println("Before main");
     */
	
	static {
		System.err.println("Before main 1");
	}

	final int		z = 20;
	final double 	t = Math.random();
	
	{
		System.err.println("Creation");
	}
	
	/* public void <init>() {
	 * super();
	 * z = 20;
	 * t = Math.random();
	 * System.err.println("Creation");
	 */
	
	public LifeCycleTest() {
		super();
	}

	/* public void <init>(int value) {
	 * super();
	 * z = 20;
	 * t = Math.random();
	 * System.err.println("Creation");
     * System.err.println("Value="+value);
	 */
	
	public LifeCycleTest(int value) {
		super();
		System.err.println("Value="+value);
	}
	
	public LifeCycleTest(double value) {
		super();
		System.err.println("Value  dfkjdhfjkdhfjk ="+value);
	}
	public static void main(String[] args) {
		System.err.println("Hello world "+x);
		/*System.err.println("Hello world "+10);*/
		LifeCycleTest	lc = new LifeCycleTest(102);
	
		System.err.println("After creation");
		
		lc.staticPrint();	// LifeCycleTest.staticPrint();
		lc.print();
	}

	static {
		System.err.println("Before main 2");
	}
	
	static void staticPrint() {
		System.err.println("Lifecycle static "+x);
	}

	void print() {
		System.err.println("Lifecycle print "+z);
	}
}

