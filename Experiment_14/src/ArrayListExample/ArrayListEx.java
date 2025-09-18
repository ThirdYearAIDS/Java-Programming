package ArrayListExample;

import java.util.List;
import java.util.ArrayList;

public class ArrayListEx {
	public static void main(String[] args) {

		ArrayList<Integer> nums = new ArrayList<Integer>();
		
		nums.add(10);
		nums.add(20);
		nums.add(30);
		nums.add(40);
		nums.add(50);
		
		System.out.println("Original ArrayList Elements:");
		for (int i : nums) {
			System.out.print(i + " ");
		}
		
		nums.get(0);
		
		nums.set(3, 70);
		
		System.out.println("\n\nModified ArrayList Elements:");
		for (int i : nums) {
			System.out.print(i + " ");
		}
		
		nums.remove(1);
		
		System.out.println("\n\nRemaining ArrayList Elements:");
		for (int i : nums) {
			System.out.print(i + " ");
		}
		
		nums.clear();

	}

}
