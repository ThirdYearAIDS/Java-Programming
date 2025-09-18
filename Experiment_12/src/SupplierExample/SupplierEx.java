package SupplierExample;

import java.util.function.Supplier;

public class SupplierEx {

	public static void main(String[] args) {
		
		// makes a function-Double object, returns an object of type Double. 
		Supplier<Double> money = () -> 100.00;
		
		// Double object stored into Double 'mons'.
		Double mons = money.get();
		System.out.println("You won $" + mons + "!");

	}

}
