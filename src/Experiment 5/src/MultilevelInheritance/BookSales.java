package MultilevelInheritance;

public class BookSales extends BookInfo {
  int noofcopiessold;
  
  public BookSales(String a, String t, String p, double pr, int s, int n) {
    super(a, t, p, pr, s);
    noofcopiessold = n;
  }
  
  public void RevenueGenerated() {
    System.out.println("Revenue Generated: $" + (price * noofcopiessold));
  }

  public void AllShow() {
    System.out.println("Author: " + author);
    System.out.println("Title: " + title);
    System.out.println("Publisher: " + publisher);
    System.out.println("Price: $" + price);
    System.out.println("Stock in Position: " + stock);
    System.out.println("No. of Copies Sold: " + noofcopiessold);
  }
  
}
