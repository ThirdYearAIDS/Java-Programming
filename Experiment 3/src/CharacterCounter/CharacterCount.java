package CharacterCounter;

public class CharacterCount {
	public static void main(String[] args) {

		String text = "Hello there! How are you today?";
		
		int letters = 0, digits = 0, spaces = 0, symbols = 0;
		
		for (int i = 0; i < text.length(); i++) {
			char ch = text.charAt(i);
			
			if (Character.isLetter(ch)) {
				letters++;
			} else if (Character.isDigit(ch)) {
				digits++;
			} else if (Character.isWhitespace(ch)) {
				spaces++;
			} else {
				symbols++;
			}
		}
		
		System.out.println("Letters: " + letters);
		System.out.println("Digits: " + digits);
		System.out.println("Spaces: " + spaces);
		System.out.println("Symbols: " + symbols);
	}

}
