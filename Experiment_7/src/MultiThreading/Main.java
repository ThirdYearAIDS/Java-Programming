package MultiThreading;

public class Main {

	public static void main(String[] args) {

		OneToTen m = new OneToTen(1);
		TenToOne m2 = new TenToOne(2);
		
		Thread t1 = new Thread(m);
		Thread t2 = new Thread(m2);
		
		t1.start();
		t2.start();

	}

}
