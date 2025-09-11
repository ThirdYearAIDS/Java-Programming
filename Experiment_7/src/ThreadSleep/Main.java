package ThreadSleep;

public class Main {

	public static void main(String[] args) {

		Ascending asc = new Ascending(1);
		Descending dsc = new Descending(2);
		
		Thread t1 = new Thread(asc);
		Thread t2 = new Thread(dsc);
		
		t1.start();
		t2.start();

	}

}
