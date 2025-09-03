package Operators;

public class Operator {
	
	public static void main(String[] args) {
		
		int x = 5;
		int y = 7;
		int z = 12;
		
		int sum = x + y + z;
		int ans = z * (y - x);
		double pow = Math.pow(y, x);
		
		System.out.println(sum);
		System.out.println(ans);
		System.out.println(pow);
		
	}
	
}