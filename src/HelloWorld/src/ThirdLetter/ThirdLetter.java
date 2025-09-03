package ThirdLetter;
import java.util.*;

public class ThirdLetter {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		StringBuffer sb = new StringBuffer();
		
		System.out.println("Enter your text here.");
		String text = sc.nextLine();
		
		String[] words = text.split(" ");
		
		for (int i = 0; i < words.length; i++) {
			sb.append(words[i].charAt(2));
		}
		
		String third = sb.toString();
		
		System.out.println("The new word created from the 3rd letters is: " + third);
		
		sc.close();
	}

}
