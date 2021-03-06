package Day19;

import java.util.Map;
import java.util.Set;
import Day20.AutoSaveThread;

public class ThreadInfoEx {

	public static void main(String[] args) {
		AutoSaveThread autoSaveTread = new AutoSaveThread();
		autoSaveTread.setName("AutoSaveThread");
		autoSaveTread.setDaemon(true);
		autoSaveTread.start();
		
		Map<Thread, StackTraceElement[]> map = Thread.getAllStackTraces();
		Set<Thread> threads = map.keySet();
		for(Thread thread : threads) {
			System.out.println("Name : " + thread.getName() + (thread.isDaemon()? "(데몬)" : "(주)"));
			System.out.println("\t" + "소속그룹 : " + thread.getThreadGroup().getName());
			System.out.println();
		}

	}

}
