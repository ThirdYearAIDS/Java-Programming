package OutOfBounds;

public class OutOfBounds {

	public static void main(String[] args) {

		int[] nums = {1,2,3,4,5};
		
		try {
			System.out.println("6th element of array: " + nums[5]);
		} catch (ArrayIndexOutOfBoundsException n) {
			System.out.println("Out of Bounds Error!");
			System.out.println("The exception returned is: " + "Tried to access index number " + n.getMessage() + " in array of size 5.");
		} finally {
			System.out.println("Since the user tried to access memory outside of the array, the program returned an exception.");
		}

	}

}
