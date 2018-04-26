import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

import org.omg.PortableServer.ServantActivator;
public class LessonEighteenThreads2 {
	public static void main(String[] args) {
		addThreadsToPool();
		
	}
	
	public static void addThreadsToPool() {
		ScheduledThreadPoolExecutor eventPool = new ScheduledThreadPoolExecutor(5);
		
		eventPool.scheduleAtFixedRate(new CheckSystemTime(), 0, 2, TimeUnit.SECONDS);
		eventPool.scheduleAtFixedRate(new PerformSystemCheck("Mail"),5,5,TimeUnit.SECONDS);
		eventPool.scheduleAtFixedRate(new PerformSystemCheck("Calendar"),10,10,TimeUnit.SECONDS);
		
		System.out.println("Number of Threads: "+Thread.activeCount());
		
		Thread[] listOfThreads = new Thread[Thread.activeCount()];
		
		Thread.enumerate(listOfThreads);
		
		for (Thread thread : listOfThreads) {
			System.out.println(thread.getName());
		}
		
		for (Thread thread : listOfThreads) {
			System.out.println(thread.getPriority());
		}
		
		//shutdown thread pools
		//eventPool.shutdown();
		
		//to set thread priority
		//threadName.setPriority
		
		try {
			Thread.sleep(20000);
			System.out.println("Threads shutdown in try block");
		}
		catch (InterruptedException e) {}
		
	}
}
