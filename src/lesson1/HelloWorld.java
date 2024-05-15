package lesson1;

import java.lang.*;
import lesson1.*;

public class HelloWorld /*extends java.lang.Object*/ {
	static int x = 0, z, t = -1;
	int y = 10;
	
	
	public static void main(java.lang.String[] args) {
		byte	b1 = 10, b2 = 20, b3 = (byte)(b1 + b2);
	
		System.err.println("b1+b2="+(b1+b2));
		System.err.println("b1-b2="+(b1-b2));
		System.err.println("b1*b2="+(b1*b2));
		System.err.println("b1/b2="+(b1/b2));
		System.err.println("b1%b2="+(b1%b2));
	
		System.err.println("b1|b2="+(b1|b2));
		System.err.println("b1&b2="+(b1&b2));
		System.err.println("b1^b2="+(b1^b2));
		System.err.println("~b1="+(~b1));
		
		System.err.println("b1<<1="+(b1<<1));
		System.err.println("b1>>1="+(b1>>1));
		System.err.println("b1>>>1="+(b1>>>1));

		System.err.println("(-b1)>>1="+((-b1)>>1));
		System.err.println("(-b1)>>>1="+((-b1)>>>1));
	
		System.err.println("b1==b2="+(b1==b2));
		System.err.println("b1>b2="+(b1>b2));
		System.err.println("b1>=b2="+(b1>=b2));
		System.err.println("b1<b2="+(b1<b2));
		System.err.println("b1<=b2="+(b1<=b2));
		System.err.println("b1!=b2="+(b1!=b2));
	}

}
