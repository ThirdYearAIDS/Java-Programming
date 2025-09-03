package PalindromeChecker;

import java.util.*;

public class PalindromeCheck {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter your word here.");
		String word = sc.next();
		
		StringBuffer sb = new StringBuffer(word);
		String reverse = sb.reverse().toString();
		
		System.out.println(word.equals(reverse) ? "Palindrome" : "Not Palindrome");
		
		sc.close();
	}
}
