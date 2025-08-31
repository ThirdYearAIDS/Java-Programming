package GreatestOfThree;
import java.util.Scanner;

public class GreatestOfThree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter three numbers: ");

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int max = 0;

        if (a > b && a > c) {
            max = a;
        } else if (b > a && b > c) {
            max = b;
        } else {
            max = c;
        }

        System.out.println("The greatest of the three numbers is " + max + ".");

        sc.close();
    }
}