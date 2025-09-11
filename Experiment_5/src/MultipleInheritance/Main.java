package MultipleInheritance;

public class Main extends SY implements FY {

	Main(String name, int roll_no, String per) {
		super(name, roll_no, per);
	}
	
	@Override
	public void result() {
		System.out.println("Yoga Result: " + yoga);
	}
	
	public static void main(String[] args) {

		Main std1 = new Main("Nicket Shah", 70, "Excellent");
		
		std1.display();
		std1.result();

	}

}
