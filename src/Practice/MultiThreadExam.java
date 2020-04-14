package Practice;

public class MultiThreadExam {
	public static void main(String args[]) {
		Thread1 ct1 = new Thread1();
		Thread2 ct2 = new Thread2();
		Thread t1 = new Thread(ct1);
		Thread t2 = new Thread(ct2);
		t1.start();
		t2.start();

	}
}

class Thread1 implements Runnable {
	public void run() {
		for(int i=0;i<10;i++) {
			System.out.println("Thrad1 : " +i);
		}
	}
}

class Thread2 implements Runnable {
	public void run() {
		for(int i=100;i<110;i++) {
			System.out.println("Thrad2 : " +i);
		}
	}
}

