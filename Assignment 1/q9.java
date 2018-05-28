import java.util.Scanner;

public class q9 {

	public static void main(String[] args) {
		
		reverseWrapper();		
	}
	
	public static void reverseWrapper() {
		System.out.println("Enter a number:");
		Scanner scan = new Scanner(System.in);
		String input = scan.nextLine();
		System.out.println(reverse(input));
		scan.close();
	}
	
	
	
	/*
	 * Function parses input, stores first character onto stack
	 * Upon reaching base case (last character) goes back up stack trace
	 */
	private static String reverse (String digits) {
		if (digits.length() == 1 || digits == null) return digits; 
		return reverse(digits.substring(1)) + digits.charAt(0);
	}

}
