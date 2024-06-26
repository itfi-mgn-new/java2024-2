package lesson6;

public class EXceptionTest {
	static void error(int errno) throws Exception, Throwable, RuntimeException {
		switch (errno) {
			case 0 : 
				throw new RuntimeException("RTE");
			case 1 :
				throw new Exception("Exception");
			case 2 :
				throw new Throwable("Throwable");
			default :
		}
	}
	
	static void nestedError(int errno) throws Throwable {
		try {
			error(errno);
		} catch (Exception e) {
			System.err.println("Processed exception: "+e.getMessage());
			throw new RuntimeException(e);
		} finally {
			System.err.println("Nested finally");
		}
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int errno = 0; errno <= 3; errno++) {
			try {
				nestedError(errno);
				System.err.println("Success");
			} catch (RuntimeException e) {
				System.err.println("Runtime exception detected: "+e.getMessage());
			} catch (Exception e) {
				System.err.println("Exception detected: "+e.getMessage());
			} catch (Throwable e) {
				e.printStackTrace();
				System.err.println("Throwable detected: "+e.getMessage());
			} finally {
				System.err.println("Finally");
			}
		}
	}

}
