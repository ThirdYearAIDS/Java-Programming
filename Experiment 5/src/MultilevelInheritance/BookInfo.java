package MultilevelInheritance;

public class BookInfo extends Book {
  double price;
  int stock;
  
  public BookInfo(String a, String t, String p, double pr, int s) {
    super(a, t, p);
    price = pr;
    stock = s;
  }
  
}
