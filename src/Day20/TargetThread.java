package Day20;

public class TargetThread extends Thread {
	public void run() {
		String sum = "";
		for (long i=0 ; i<30_000 ; i++) {
			sum += i;
		}
		
		try {
			Thread.sleep(1500);
		} catch (Exception e) {
		}
		
		for (long i=0 ; i<30_000 ; i++) {
			sum+=i;
		}
	}
	
	public static void main(String[] args) {
		StatePrintTread spt = new StatePrintTread(new TargetThread());
		spt.start();
	}

}
