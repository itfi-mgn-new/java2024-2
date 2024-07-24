package lesson7;

import java.lang.reflect.Array;
import java.lang.reflect.Field;
import java.util.Arrays;

public class ArrayTest {

	public static void main(String[] args) throws IllegalArgumentException, IllegalAccessException {
		// TODO Auto-generated method stub
		int[][]	x = new int[][] {new int[] {1,2,3}};
		Class	cl = x.getClass();
		
		System.err.println("Is array: "+cl.isArray());
		System.err.println("Content: "+cl.getComponentType());
		
		Object	y = new int[] {1,2,3};
		Class	cl1 = y.getClass();
		
		System.err.println("Is array: "+cl1.isArray());
		System.err.println("Content: "+cl1.getComponentType());
	
		System.err.println("Y[1]="+Array.get(y, 1));	// y[1]
		System.err.println("Y[0]="+Array.get(y, 0));	// y[0]
		Array.set(y, 0, -1);
		System.err.println("Y[0]="+Array.get(y, 0));	// y[0]
	
		System.err.println("Y.length="+Array.getLength(y));	// y.length
		
		int[]	z = (int[])Array.newInstance(int.class, 10);	// = new int[10];
		
		int[]  a = (int[])concat(new int[] {1,2,3}, new int[] {4,5});
		// a = {1,2,3,4,5}
		System.err.println("REsult: "+Arrays.toString(a));
		
		System.err.println("Sum="+calculate(new TestClass()));
	}

	static int calculate(final Object obj) throws IllegalArgumentException, IllegalAccessException {
		Class	current = obj.getClass();
		int		sum = 0;
		
		while (current != null) {
			for(Field f : current.getDeclaredFields()) {
				if (f.getType() == int.class) {
					f.setAccessible(true);
					sum += f.getInt(obj);
				}
			}
			current = current.getSuperclass();
		}
		return sum;
	}
	
//	class TestClass {
//		static int x = 10;
//		int y = 20;
//	}
	
	static Object concat(Object... arrays) {
		Class	retType = arrays[0].getClass().getComponentType();
//		System.err.println("Type: "+arrays.getClass());
//		Class	cl = arrays[0].getClass();
//		System.err.println("Type[0]: "+cl);
//		Class	cl2 = cl.getComponentType();
//		System.err.println("Type[0][0]: "+cl2);
		int	totalLen = 0;
		for(Object item : arrays) {
			totalLen += Array.getLength(item);
		}
		System.err.println("Total length: "+totalLen);
		Object ret = Array.newInstance(retType, totalLen);
		int	where = 0;

		for(Object item : arrays) {
			for(int index = 0; index < Array.getLength(item); index++) {
				Array.set(ret, where, Array.get(item,index));
				where++;
			}
		}
		return ret;
	}

}

class TestClass {
	static int x = 10;
	int y = 20;
}
