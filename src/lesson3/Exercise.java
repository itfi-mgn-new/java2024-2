package lesson3;

public class Exercise {
	public static final int[]	VALUES = {10, 15, -3, 7, 10, 31};
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double	sum = 0;
		
		for(int value : VALUES) {
			sum += value;
		}
		if (VALUES.length > 0) {
			sum /= VALUES.length; 
		}
		System.err.println("Avg="+sum);
	}

}
