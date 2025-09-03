package If_Else_Statements;
import java.util.Scanner;

public class IfElse {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		
		if (s.equals("hello")) {
			System.out.println("Hi! Welcome to Java!");
		} 
		else if (s.equals("nick")) {
			System.out.println("That's my name!");
		} 
		else {
			System.out.println("Sorry, what did you say?");
		}

		sc.close();

	}

}
