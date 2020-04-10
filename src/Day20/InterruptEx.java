package Day20;

public class InterruptEx {

	public static void main(String[] args) {
		Thread thread = new PrintThread2();
		thread.start();
		
		try {
			Thread.sleep(100);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		thread.interrupt();

	}

}
