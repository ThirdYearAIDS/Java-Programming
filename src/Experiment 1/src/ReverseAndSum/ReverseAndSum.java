package ReverseAndSum;

public class ReverseAndSum {
    public static void main(String[] args) {

        int num = 12345;
        int rev = 0;

        for (int i = 0; i < 5; i++) {
            int rem = num % 10;
            rev = rev * 10 + rem;
            num = num / 10;
        }

        System.out.println("Reversed number: " + rev);
    }
}
