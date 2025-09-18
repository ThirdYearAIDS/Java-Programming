package PredicateExample;

import java.util.function.Predicate;

public class PredicateEx {
	public static void main(String[] args) {
		
		Predicate<Integer> isEven = num -> num % 2 == 0;
		
		System.out.println(isEven.test(7));
		System.out.println(isEven.test(8));
	}
}
