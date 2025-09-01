package Roller_Coaster;
import java.util.Scanner;

public class Age {

	public static void main(String[] args) {

		System.out.println("What is your age? ");
		Scanner sc = new Scanner(System.in);
		String ageS = sc.nextLine();
		int age = Integer.parseInt(ageS);
		
		if (age >= 13) {
			System.out.println("Prove it. Who made 'Astroworld'?");
			String rap = sc.nextLine();
			if (rap.toUpperCase().equals("TRAVIS SCOTT")) {
				System.out.println("Welcome aboard! Enjoy the roller coaster!");
			}
			else {
				System.out.println("Nice try bud, but that isn't right. Come back when you're older.");
			}
			
		} 
		else {
			System.out.println("Sorry, you're too young to go on this ride.");
		}

		sc.close();
		
	}

}
