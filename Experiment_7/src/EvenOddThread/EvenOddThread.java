package EvenOddThread;

class OddThread implements Runnable {
	
	String threadNo;
	
	OddThread(String threadNo) {
		this.threadNo = threadNo;
	}
	
	@Override
	public void run() {
		for (int i = 0; i < 20; i++) {
			if (i % 2 != 0) {
				System.out.println(i + " by thread " + threadNo);
			}
		}
	}	
}

class EvenThread implements Runnable {
	
	String threadNo;
	
	EvenThread(String threadNo) {
		this.threadNo = threadNo;
	}
	
	@Override
	public void run() {
		for (int i = 0; i < 20; i++) {
			if (i % 2 == 0) {
				System.out.println(i + " by thread " + threadNo);
			}
		}
	}	
}