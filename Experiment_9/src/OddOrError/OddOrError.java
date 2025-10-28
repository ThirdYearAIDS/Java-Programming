package OddOrError;

import java.util.Scanner;

public class OddOrError {
    public static void oddCheck(int num) {
        if (num % 2 != 0) {
            throw new OddNumberException("Error: You entered an odd number.");
        }
        System.out.println("Your number is even.");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter an even number:");
        int num = sc.nextInt();

        try {
            oddCheck(num);
        } catch (OddNumberException e) {
            System.out.println(e.getMessage());
        }

        sc.close();
    }
}
