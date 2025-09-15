package AuthenticationSystem;

import java.util.Scanner;

public class AuthenticationSystem {

	public static void passwordCheck(String password, String input) {
		if (!password.equals(input)) {
			throw new IllegalArgumentException("Access denied.");
		}
		System.out.println("Welcome back user.");
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String password = "12345678";
		
		System.out.println("Enter the password.");
		String input = sc.next();
		
		passwordCheck(password, input);
		
		sc.close();

	}

}
