package FunctionExample;

import java.util.function.Function;

public class FunctionEx {
	public static void main(String[] args) {
			
		Function<Integer, Integer> negate = num -> -num;
		
		System.out.println("Negated number: " + negate.apply(6));

	}
}
