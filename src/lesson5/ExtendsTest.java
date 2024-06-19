package lesson5;

public abstract class ExtendsTest {
	public ExtendsTest() {
	}
	
	public abstract void eat();
	
	public abstract void voice();
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ExtendsTest		et = new SuperPuperEagle();

		et.eat();
		et.voice();
	}
}

abstract class Eagle extends ExtendsTest {
	@Override
	public void eat() {
		System.err.println("hrum=hrum");
	}

	@Override
	public abstract void voice();
}

abstract class SuperEagle extends Eagle {

	@Override
	public void voice() {
		System.err.println("Wau!!!");
	}
	
}

final class SuperPuperEagle extends SuperEagle {
	
}