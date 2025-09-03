package SingleInheritance;

public class Main {
	public static void main(String[] args) {

		Book b1 = new Book("J. R. R. Tolkein", "The Hobbit", "McGrawHill");
		BookInfo b2 = new BookInfo("J. R. R. Tolkein", "The Hobbit", "McGrawHill", 29.99, 17);
		
		b1.display();
		b2.show();
		b2.display();

	}

}
