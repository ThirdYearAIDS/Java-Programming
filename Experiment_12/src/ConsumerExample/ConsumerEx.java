package ConsumerExample;

import java.util.function.Consumer; 

public class ConsumerEx {
	public static void main(String[] args) {

		Consumer<String> consumer = name -> System.out.println("Hello, " + name);
		consumer.accept("Nicket");

	}

}
