package ThreadSleep;

class Ascending implements Runnable {
	
	int threadNo;
	
	Ascending(int threadNo) {
		this.threadNo = threadNo;
	}
	
	@Override
	public void run() {
		for (int i = 10; i <= 20; i++) {
			if (i % 2 == 0 && i > 0) {
				try {
					Thread.sleep(100);
				} catch (InterruptedException e) {}
			}
			System.out.println(i + " by thread " + threadNo);
		}
	}
}

class Descending implements Runnable {
	
	int threadNo;
	
	Descending(int threadNo) {
		this.threadNo = threadNo;
	}
	
	@Override
	public void run() {
		for (int i = 20; i >= 1; i--) {
			System.out.println(i + " by thread " + threadNo);
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {}
		}
	}
}

