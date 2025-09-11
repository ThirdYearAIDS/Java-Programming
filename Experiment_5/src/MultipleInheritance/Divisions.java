package MultipleInheritance;

class SY {
	String name, per;
	int roll_no;
	
	SY (String name, int roll_no, String per) {
		this.name = name;
		this.roll_no = roll_no;
		this.per = per;
	}
	
	public void display() {
		System.out.println("Name: " + name);
		System.out.println("Roll Number: " + roll_no);
		System.out.println("Performance: " + per);
	}
}

interface FY {
	int yoga = 5;
	public void result();
}
