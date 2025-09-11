package EvenOddThread;

public class Main {

	public static void main(String[] args) {
		
		EvenThread even = new EvenThread("Even");
		OddThread odd = new OddThread("Odd");
		
		Thread t1 = new Thread(even);
		Thread t2 = new Thread(odd);
		
		t1.start();
		t2.start();

	}

}
