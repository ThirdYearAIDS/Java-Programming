package AuthenticationSystem;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String pass = "abc123";

        System.out.println("Enter your password:");
        String input = sc.next();

        try {
            if (!pass.equals(input)) {
                throw new AuthenticationFailureException("Authentication failed: Incorrect password.");
            }
            System.out.println("Login successful!");
        } catch (AuthenticationFailureException e) {
            System.out.println(e.getMessage());
        }
    }
}
