package LinkedListExample;

import java.util.List;
import java.util.LinkedList;

public class LinkedListEx {

	public static void main(String[] args) {

		LinkedList<String> cars = new LinkedList<String>();
		
		cars.add("Mercedes");
		cars.add("Volvo");
		cars.add("Toyota");
		cars.add("Honda");
		cars.add("Lamborghini");
		
		System.out.println("The first element of this list is " + cars.get(0) + ".");
		
		cars.set(0, null)
	}

}
