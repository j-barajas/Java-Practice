import java.util.concurrent.locks.ReentrantLock;

public class PerformSystemCheck implements Runnable{
	
	private String checkWhat;
	ReentrantLock lock = new ReentrantLock();
	
	public PerformSystemCheck(String checkWhat) {
		this.checkWhat = checkWhat;
	}
	
	//Synchronized prevents access from 2 threads at the same time, 
	//otherwise use java.util.concurrent.locks.ReentrantLock and lock
	//	synchronized public void run() {
	//		
	//	}
	
	public void run() {
		lock.lock();
		
		System.out.println("Checking "+this.checkWhat);
		
		lock.unlock();
	}
}
