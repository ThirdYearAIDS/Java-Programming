import java.util.Set;
import java.util.HashSet;

public class SetInterfaceEx {
	public static void main(String[] args) {
		Set<String> set = new HashSet<>();
		
		set.add("Nick");
		set.add("James");
		set.add("Phil");
		set.add("Maria");
		set.add("Nick"); // wont get added, set only takes unique values
		
		System.out.println("Set contents: " + set);
		System.out.println("Size of the set: " + set.size());
		System.out.println("Set contains 'Nick'? " + set.contains("Nick"));
		
		set.remove("Phil");
		System.out.println("Set after removal: " + set);
		
		set.remove("Nick");
		set.remove("James");
		set.remove("Maria");
		System.out.println("Set is empty? " + set.isEmpty());
	}
}