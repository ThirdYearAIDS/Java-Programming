package useful;

public class Main {

    public static void main(String[] args) {
        
        useme u = new useme();
        
        u.area("circle");
        u.area("rectangle");
        u.area("square");
        
        System.out.println("Salary: $" + u.salary(8, 12.25));
        
        System.out.println("Percentage: " + u.percentage(0.69) + "%");
        
        u.closeScanner();
    }
}