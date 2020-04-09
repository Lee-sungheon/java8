package Day19;

import java.awt.Toolkit;

public class BeepClass {

	public static void main(String[] args) {
		Toolkit tk = Toolkit.getDefaultToolkit();
		System.out.println("현재 스레드명 : " + Thread.currentThread().getName());
	
		Thread t1 = new Thread(new Runnable() {	//익명구현객체
			@Override
			public void run() {
				for(int i=0 ; i<5 ; i++) {
					tk.beep();
					try {
						Thread.sleep(500);
					} catch (InterruptedException e) {
					}
				}
			}
		});

	}

}
