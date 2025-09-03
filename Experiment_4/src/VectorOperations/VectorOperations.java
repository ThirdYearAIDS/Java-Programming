package VectorOperations;

import java.util.*;

public class VectorOperations {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("How many elements do you want in your vector?");
		int size = sc.nextInt();
		
		Vector<Integer> nums = new Vector<>(size);
		System.out.println("Enter your vector elements.");
		
		for (int i = 0; i < size; i++) {
			int num = sc.nextInt();
			nums.add(num);
		}
		
		System.out.println("Vector Contents: " + nums);
		System.out.println("Vector Size: " + nums.size());
		
		nums.remove(3);
		
		System.out.println("Vector Contents: " + nums);
		System.out.println("Vector Size: " + nums.size());
		
		sc.close();

	}

}
