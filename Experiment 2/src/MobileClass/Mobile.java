package MobileClass;

public class Mobile {
	
	int screen_size;
	String company_name;
	
	Mobile(String a, int b) {
		
		company_name = a;
		screen_size = b;
		
	}
	
	public void display() {
		
		System.out.println("Company name: " + company_name + ", Screen Size: " + screen_size);
		
	}
} 
