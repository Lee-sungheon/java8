package Day20;

public class DeamonEx {

	public static void main(String[] args) {
		AutoSaveThread autoSaveThread = new AutoSaveThread();
		autoSaveThread.setDaemon(true);	//�� �κ��� �ּ�ó���ϸ� �����尡 ��� �����
		autoSaveThread.start();
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		System.out.println("���� ������ ����");
	}

}
