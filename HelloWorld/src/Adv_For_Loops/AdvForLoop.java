package HelloWorld.src.Adv_For_Loops;
import java.util.Scanner;

public class AdvForLoop {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String[] names = new String[5];

		for (int i = 0; i < names.length; i++) {
			System.out.print("Enter the name: ");
			String input = sc.nextLine();
			names[i] = input;
		}
		
		for (String name: names) {
			System.out.println(name);
			if (name.equals("Tim")) {
				break;
			}
		}
		
		sc.close();
		
	}
	
}
