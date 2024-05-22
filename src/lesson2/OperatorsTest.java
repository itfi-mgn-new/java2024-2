package lesson2;

public class OperatorsTest {

	public static void main(final String[] args) {
		// TODO Auto-generated method stub
		int	x, y = 0, z;
		final int t = 0;
		
		z = 2;
		x = y + z;
		
		x += y;	// x = x + y;
	
		if (z > 0) {  
			// sdkfjklsdjfkljsdlkfj
			if (x < 0) {
				
			}
		}
		else {
			// dklfjlksdfjlsjdflkjsdlkfj
		
		}	
		//x = 5;
		while (x > 0) {
			// dslfkjdsklfj
		}
		//x = 5;
		do {
			// fkjghklsdfgldfjlkgjkl
		} while (x > 0);
		
		for (int index = 0, xc = 10; index < 10; index++, xc++) {
			// something
		}
		
		(index--) // index = index - 1
		(++index) // index = index + 1;
		(x > 10 ? 100 : 200)
		
		/*
		 *	int index = 0; 
		 *
		 *  while (index < 10) {
		 *     // something
		 *     index++;
		 *  }
		 */
		for(;;/*<<<THERE>>>*/) {
			if (x > 10) {
				continue;	// go to <<<THERE>>
			}
			else {
				break;  // go to <<<HERE>>>
			}
		}
// <<<HERE>>>
loop:	for(;;/*<<<THERE 2>>>*/) {
			for(;;) {
				if (x > 10) {
					continue loop;	// go to <<<THERE 2>>
				}
				else {
					break loop;  // go to <<<HERE 2>>>
				}
			}
		}
// <<<HERE 2>>>
		switch (x) {
			case 0 :
				// kvkldjflkjfkl
				break;
			case 100 :
				// djkfjdsfjkhdf\
				break;
			case -23456 :
				// dfdklfjkldf
			default:
				// dksdkjfhkjdsfhkjh
		}
		return;
	}
}
