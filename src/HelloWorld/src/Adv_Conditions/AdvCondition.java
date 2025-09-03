package Adv_Conditions;

public class AdvCondition {

	public static void main(String[] args) {
		
		int x = 5;
		int y = 7;
		int z = 12;
		String a = "hello";
		String b = "hello";
		
		boolean and = x < y && y > z;
		boolean or = x < y || y > z;
		boolean comp = a.equals(b);
		
		System.out.println(and);
		System.out.println(or);
		System.out.println(comp);

	}

}
