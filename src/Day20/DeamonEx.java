package Day20;

public class DeamonEx {

	public static void main(String[] args) {
		AutoSaveThread autoSaveThread = new AutoSaveThread();
		autoSaveThread.setDaemon(true);	//이 부분을 주석처리하면 쓰레드가 계속 실행됨
		autoSaveThread.start();
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		System.out.println("메인 스레드 종료");
	}

}
