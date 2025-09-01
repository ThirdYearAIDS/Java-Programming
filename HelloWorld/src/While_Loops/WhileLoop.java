package While_Loops;
import java.util.Scanner;

public class WhileLoop {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String[] words = {"apple", "ball", "car", "doll", "eagle"};
		
		int i = 0;
		while (!words[i].equals("doll")) {
			System.out.println(words[i]);
			i++;
		}

		sc.close();
		
	}

}
