package Conditions;

public class Condition {

	public static void main(String[] args) {

		int x = 5;
		int y = 7;
		
		boolean equal = x == y;
		boolean less = x < y;
		boolean more = x > y;
		boolean lessEq = x <= y;
		boolean moreEq = x >= y;
		boolean notEq = x != y;
		
		System.out.println(equal);
		System.out.println(less);
		System.out.println(more);
		System.out.println(lessEq);
		System.out.println(moreEq);
		System.out.println(notEq);

	}

}
