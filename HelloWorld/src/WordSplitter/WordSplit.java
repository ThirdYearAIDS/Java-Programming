package WordSplitter;
import java.util.*;

public class WordSplit {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter your text here.");
		String text = sc.nextLine();
		//String text = "hello my name is nicket";
		
		String[] words = text.split(" ");
		
		/*
		for (int i = 0; i < words.length; i++) {
			System.out.println(words[i]);
		}
		*/
		
		for (int i = 0; i < words.length; i++) {
			System.out.println(words[i].charAt(0) + "" + words[i].charAt(1) + "..." + words[i].charAt(words[i].length() - 2) + "" + words[i].charAt(words[i].length() - 1));
		}
		
		sc.close(); 
	}
}
