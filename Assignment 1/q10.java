import java.util.Scanner;

public class q10 {

	public static void main(String[] args) {

		writeLineWrapper();

		writeBlockWrapper();
		
	}

	
	public static void writeLineWrapper() {
		System.out.println("input characters for writeLine:");
		Scanner scan = new Scanner(System.in);
		String character = scan.nextLine();
		
		System.out.println("input number of characters for writeLine:");
		scan = new Scanner(System.in);
		int num = scan.nextInt();
		System.out.println(writeLine(character, num));
		

	}
	
	
	public static void writeBlockWrapper() {
		System.out.println("input characters for writeBlock:");
		Scanner scan = new Scanner(System.in);
		String character = scan.nextLine();
		
		System.out.println("input number of characters for writeBlock:");
		scan = new Scanner(System.in);
		int num = scan.nextInt();
		
		System.out.println("input number of lines for writeBlock:");
		scan = new Scanner(System.in);
		int lineCount = scan.nextInt();
		
		System.out.println(writeBlock(character, num, lineCount));

	}
	
	
	/*
	 * write recursive java method writeLine that writes a character repeatedly to
	 * form a line of n characters for example writeLine ('*', 5) produces the line *****
	 * 
	 * gets a single star
	 * appends star to final string
	 */

	private static String writeLine(String c, int count) {
		// base case
		if (count == 1) return c; 
		return writeLine(c.substring(0, 1).concat(c), count - 1);
		
	}
	
	private static String writeBlock(String c, int charCount, int lineCount) {
		
		String line = writeLine(c.substring(0, 1), charCount);
		
		if (lineCount == 1) return c;
		
		if (c.length() == 1) c = line;
		
		return writeBlock(c.concat("\n"+line), charCount, lineCount-1);
		
	}

}
