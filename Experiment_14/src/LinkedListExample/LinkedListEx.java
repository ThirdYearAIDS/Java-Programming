package LinkedListExample;

import java.util.List;
import java.util.LinkedList;

public class LinkedListEx {
	public static void main(String[] args) {
		List<String> cars = new LinkedList<String>();
		
		cars.add("Mercedes");
		cars.add("Volvo");
		cars.add("Toyota");
		cars.add("Honda");
		cars.add("Lamborghini");
		
		System.out.println("LinkedList Elements: " + cars);
		System.out.println("LinkedList Size: " + cars.size());
		System.out.println("LinkedList contains 'Lamborghini'? " + cars.contains("Lamborghini"));
		
		System.out.println("\nFirst Element: " + cars.get(0));
		
		cars.set(0, "Porsche");
		
		System.out.println("\nModified LinkedList Elements: " + cars);
		
		cars.remove(2);
		System.out.println("\nRemaining LinkedList Elements: " + cars);
	}

}
