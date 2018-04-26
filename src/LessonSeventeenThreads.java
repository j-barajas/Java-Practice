
public class LessonSeventeenThreads {

	public static void main(String[] args) {
		Thread getTime = new GetTime20();
		
		Runnable getMail = new GetTheMail(10);
		
		Runnable getMailAgain = new GetTheMail(20);
		
		//starts getTime Thread exteded class
		getTime.start();
		
		//starts getMail and getMailAgain threads using runnable interface
		new Thread(getMail).start();
		new Thread(getMailAgain).start();
	}

}
