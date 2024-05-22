package lesson2;

public class OperationTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean	z1 = true, z2 = false;
		
		System.err.println("z1&&z2"+(z1&&z2));
		System.err.println("z1||z2"+(z1||z2));
		System.err.println("!z1"+(!z1));

		System.err.println("z1&z2"+(z1&z2));
		System.err.println("z1|z2"+(z1|z2));
		System.err.println("z1^z2"+(z1^z2));
		
		byte	b1 = 100, b2 = (byte)200;
		short	s1 = 10000, s2 = (short)100000;
		int		i1 = 1000000000, i2 = (int)10000000000L;
		long	l1 = 1000000000000000L, l2 = 10000000000000000L;
	
		float	f1 = (float)1.5, f2 = 1.5f, f3 = 3.5e-12f;
		double	d1 = 10.5f, d2 = 1.5d, d3 = 3.5e-12f;
		
		char	c1 = 48, c2 = '0', c3 = '\060', c4 = '\u0030', c5 = '\n';
		int		i22 = '\u0030';
		
		int		val1 = 0b0010, val2 = 0xFeD0, val3 = 077;
		
		int		val = 1_000_000;
	}

}
