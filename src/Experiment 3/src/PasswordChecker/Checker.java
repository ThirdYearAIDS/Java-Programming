 package PasswordChecker;
import java.util.Scanner;

public class Checker {
	static Scanner sc = new Scanner(System.in);
	static String password = "abc123";
	
	public static void compare() {
		System.out.println("Enter your password.");
		String input = sc.next();
		System.out.println(password.equals(input) ? "Welcome back user." : "Access Denied.");
	}
}
