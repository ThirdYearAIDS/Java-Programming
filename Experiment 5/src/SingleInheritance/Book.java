package SingleInheritance;

public class Book {
	
	String author, title, publisher;
	
	Book(String a, String b, String c) {
		author = a;
		title = b;
		publisher = c;
	}
	
	public void display() {
		System.out.println("Author: " + author);
		System.out.println("Title: " + title);
		System.out.println("Publisher: " + publisher);
		
		System.out.println("");
	}

}
