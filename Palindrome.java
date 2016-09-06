/**
 * Palindrome.java
 * @author arinehouse
 * 
 * Tests strings input from the user to see whether they are palindromes, i.e. the string is the same
 * if read forward or backward
 */


import java.util.Scanner;

public class Palindrome 
{
	// Driver method for isPalindrome
	public static void main(String[] args) 
	{
		Scanner console = new Scanner(System.in);
		String input;
		
		System.out.println("Palindrome Tester");
		System.out.println();
		System.out.print("Enter a string, or q to quit: ");
		input = console.nextLine();
		while (!input.equals("q")) {
			if (isPalindrome(input))
				System.out.println(input + " IS a palindrome.");
			else
				System.out.println(input + " is NOT a palindrome.");
			
			System.out.println();
			System.out.print("Enter a string, or q to quit: ");
			input = console.nextLine();
		}
	}
	
	// Test a string to see if it is a palindrome, i.e. characters are the same forward and backward
	// The method is case-insensitive
	public static boolean isPalindrome(String s)
	{
		s.toLowerCase();                               // The method should be case-insensitive
		if (s.length() < 2)                         // Base case: short string will always return true
			return true;
		if (s.charAt(0) == s.charAt(s.length() - 1))   // Recursive portion.
		{                                              // Checks ends of string for equality, and
			s = s.substring(1, s.length() - 1);        // then calls the method again without these ends
			if (isPalindrome(s))
				return true;
			else
				return false;
		}                                           
		else
			return false;
	}
}