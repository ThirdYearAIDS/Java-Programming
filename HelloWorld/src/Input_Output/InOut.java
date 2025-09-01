package Input_Output;
import java.util.Scanner;

public class InOut {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		String word = sc.next();
		int num = sc.nextInt();
		double doub = sc.nextDouble();
		boolean bool = sc.nextBoolean();
		
		System.out.println(word);
		System.out.println(num);
		System.out.println(doub);
		System.out.println(bool);
		
		sc.close();
		
	}

}
