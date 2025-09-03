package useful;

import java.util.Scanner;

public class useme {

    Scanner sc = new Scanner(System.in);

    public double area(String shape) {
        switch (shape.toUpperCase()) {
            case "RECTANGLE":
                System.out.println("Enter the length and width of the rectangle:");
                double length = sc.nextDouble();
                double width = sc.nextDouble();
                double rectangleArea = length * width;
                System.out.println("The area of the rectangle is " + rectangleArea + " units squared.");
                return rectangleArea;
            case "SQUARE":
                System.out.println("Enter the side length of the square:");
                double side = sc.nextDouble();
                double squareArea = side * side;
                System.out.println("The area of the square is " + squareArea + " units squared.");
                return squareArea;
            case "CIRCLE":
                System.out.println("Enter the radius of the circle:");
                double radius = sc.nextDouble();
                double circleArea = Math.PI * radius * radius;
                System.out.println("The area of the circle is " + circleArea + " units squared.");
                return circleArea;
            default:
                System.out.println("Unknown shape. Supported shapes are RECTANGLE, SQUARE, and CIRCLE.");
                return 0.0;
        }
    }
    
    public double salary(int hours, double rate) {
    	return hours * rate;
    }
    
    public double percentage(double decimal) {
    	return decimal * 100;
    }

    public void closeScanner() {
        if (sc != null) {
            sc.close();
        }
    }
}