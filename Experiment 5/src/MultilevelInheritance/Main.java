package MultilevelInheritance;

public class Main {
  public static void main(String[] args) {
    BookSales book1 = new BookSales("J.K. Rowling", "Harry Potter and the Sorcerer's Stone", "Bloomsbury", 20.0, 100, 500);
    book1.AllShow();
    book1.RevenueGenerated();
  }
}
