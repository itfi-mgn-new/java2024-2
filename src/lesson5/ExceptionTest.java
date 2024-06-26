package lesson5;

public class ExceptionTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Throwable	t = new Throwable("I am fool!");
		String	s;

		try {
			throw t;
			// Something
		} catch (Throwable exc) {
			// process runtime exception
			//exc.printStackTrace();
		} finally {
			// Final actions
		}
	}

}
