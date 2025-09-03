package SwitchCase;

import java.util.Scanner;

public class SwitchCase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter two numbers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.println("Which operation do you want to do?");
        char op = sc.next().charAt(0);

        int ans = 0;

        switch (op) {
            case '+':
                ans = a + b;
                break;
            case '-':
                ans = a - b;
                break;
            case '*':
                ans = a * b;
                break;
            case '/':
                ans = a / b;
                break;
            default:
                System.out.println("Enter a valid operation.");
                break;
        }

        System.out.println("The answer is " + ans);
        sc.close();
    }
}
