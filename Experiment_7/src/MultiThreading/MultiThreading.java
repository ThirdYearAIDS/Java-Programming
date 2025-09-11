package MultiThreading;

class OneToTen implements Runnable {
	
	int threadNo;
	
	public OneToTen(int threadNo) {
		this.threadNo = threadNo;
	}
	
	@Override
	public void run() {
		for (int i = 1; i <= 10; i++) {
			System.out.println(i + " by thread " + threadNo);
			if (i % 2 == 0 && i > 0) {
				Thread.yield();
			}
		}
	}
	
}

class TenToOne implements Runnable {
	
	int threadNo;
		
	public TenToOne(int threadNo) {
		this.threadNo = threadNo;
	}
		
	@Override
	public void run() {
		for (int i = 10; i > 1; i--) {
			System.out.println(i + " by thread " + threadNo);
			Thread.yield();
		}
	}
		
}
