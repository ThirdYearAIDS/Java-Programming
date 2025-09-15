package OddOrError;

import java.util.Scanner;

public class OddOrError {
	
	public static void oddCheck(int num) throws IllegalArgumentException { // technically don't need throws here, used mainly for checked exceptions like IOException
		if (num % 2 != 0) {
			throw new IllegalArgumentException("Entered an odd number.");
		}
		System.out.println("Your number is even.");
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter an even number.");
		int num = sc.nextInt();
		
		oddCheck(num);
		
		sc.close();
		
	}

}
