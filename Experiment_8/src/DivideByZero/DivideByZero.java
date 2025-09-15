package DivideByZero;

public class DivideByZero {

	public static void main(String[] args) {
		
		try {
			int num = 10 / 0;
			System.out.println("10 divided by 0 is " + num + ".");
		} catch (ArithmeticException a) {
			System.out.println("Math Error!");
			System.out.println("The exception returned is: " + a.getMessage());
		} finally {
			System.out.println("Since you can't divide by zero, the operation will always result in an exception.");
		}
		
	}

}
