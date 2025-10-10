package ArrayListExample;

import java.util.List;
import java.util.ArrayList;

public class ArrayListEx {
	public static void main(String[] args) {

		List<Integer> nums = new ArrayList<Integer>();
		
		nums.add(10);
		nums.add(20);
		nums.add(30);
		nums.add(40);
		nums.add(50);
		
		System.out.println("LinkedList Elements: " + nums);
		System.out.println("LinkedList Size: " + nums.size());
		System.out.println("LinkedList contains 30? " + nums.contains(30));
		
		System.out.println("\nFirst element: " + nums.get(0));
		
		nums.set(3, 70);
		System.out.println("\nModified ArrayList Elements: " + nums);
		
		nums.remove(1);		
		System.out.println("\nRemaining ArrayList Elements: " + nums);
		
		nums.clear();

	}

}
