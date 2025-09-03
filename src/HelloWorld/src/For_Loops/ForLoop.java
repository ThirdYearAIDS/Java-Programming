package For_Loops;

public class ForLoop {

	public static void main(String[] args) {
			
		int[] nums = {1, 2, 3, 4, 5, 6, 7};
		String[] names = {"Harry", "Jane", "Sam", "Natalie", "Mike"};
		
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] == 5) {
				System.out.println("Found a 5 at position " + i);	
			}
		}
		
		int pos = 0;
		for (String name: names) {
			System.out.println(name + ", at position " + pos);
			pos++;
		}
		
	}

}
