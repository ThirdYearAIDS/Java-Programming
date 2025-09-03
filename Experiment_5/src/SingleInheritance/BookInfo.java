package SingleInheritance;

public class BookInfo extends Book{

	double price;
	int stock, position;
	
	BookInfo(String a, String b, String c, double p, int s) {
		super(a, b, c);
		price = p;
		stock = s;
	}

	public void show() {
		System.out.println("Price: " + price);
		System.out.println("Stock: " + stock);
		
		System.out.println("");
	}
	
}
