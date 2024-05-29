package lesson3;

import java.util.Objects;

public class ObjectTest {
	int[]	y = /*new int[]*/ {2,3,4};
	
	int x;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Object	obj = new Object();
		obj.getClass();
		obj.equals(obj);
		obj.hashCode();
		obj.toString();
		
		obj = null;
		
		int[]	intArray = null;
		
		intArray = new int[10]; // .length=10
		intArray = new int[] {2,3,4,5,10,-2,17}; // .length=7
		/* 
		 * intArray = new int[7];
		 * intArray[0] = 2;
		 * . . .
		 * intArray[6] = 17;
		 */
		 intArray.clone();
		 //intArray.length;
		 
		 int[][]	matrix = new int[][] {new int[] {2,3}, null, new int[] {1}};
		 
		 /*
		  * matrix = new int[3][];
		  * matrix[0] = new int[]{2,3}
		  * matrix[1] = null;
		  * matrix[2] = new int[]{1};
		  */
		 matrix = new  int[3][2];
		 /*
		  * matrix = new int[3][];
		  * for(i = 0; i < 3; i++) {
		  * 	matrix[i] = new int[2];
		  * }
		  */
		 
		 
		 Object[][][][][]	z = null;
		 
		 int[]		array1 = new int[] {10,20,30}, array2 = array1.clone();
		 
		 System.err.println("Array[0]="+array1[0]);
		 array2[0] = 100;
		 System.err.println("Array[0]="+array1[0]);
		 
		 System.err.println("Array1: "+java.util.Arrays.toString(array1));
	
		 System.arraycopy(array1, 0, array2, 0, 1);
	}
}
