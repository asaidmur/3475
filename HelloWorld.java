package helloworld;

import java.util.Random;

public class HelloWorld {

	public static void main(String[] args) {

		int num = 4;
		System.out.println("Hello Comrade");
		
//		System.out.println(fib(10));
		
		writeLine("*", 10);
		
//		for (int i = 1; i <= num; i++) System.out.println(i + ": " + fib(i));
		
		
		
		
//		System.out.println(fact(num));
//		countDown(10);
	}

	
	
	
	
	// write recursive java method writeLine that writes a character repeatedly to form a line of n characters for example 
	// writeLine ('*', 5) produces the line *****
	public static void writeLine(String c, int i) {
		if (i == 1) {
			System.out.println(c);
			return;
		}
		String s = new String(c);
		s = s.substring(0, 1);
		writeLine(s.concat(c), i-1);
	}
	
	
	
	public static int fib(int n) {
		if (n <= 1) return 1;
		return fib(n-1) + fib(n-2);
		
		
		
		
	}
	
	
	
	public static void countDown(int i) {

		System.out.println(i);
		if (i == 1) return;
		countDown(i - 1);

	}
	
	public static int fact(int n) {
		if (n==1) return n;
		return n*fact(n-1);
	}
	
	public static int[] genArray (int size) {
		int[] array = new int[size];
		

		for (int i = 0; i < array.length; i++) {
			array[i] = randomNumberGenerator();
			System.out.println(i + ", ");
		}
		return array;
	}
	
	
	
	private static int randomNumberGenerator() {
		
		
		Random rand = new Random();

		int  n = rand.nextInt(100) + 1;
		return n;
	}
 
}
