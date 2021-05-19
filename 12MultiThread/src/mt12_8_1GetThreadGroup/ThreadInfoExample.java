package mt12_8_1GetThreadGroup;

import java.util.Map;
import java.util.Set;

import mt12_7_DaemonThread.AutoSaveThread;

public class ThreadInfoExample {

	public static void main(String[] args) {
		AutoSaveThread ast = new AutoSaveThread();
		ast.setName("AutoSaveThread");
		ast.setDaemon(true);
		ast.start();
		
		Map<Thread, StackTraceElement[]> map = Thread.getAllStackTraces();
		Set<Thread> threads = map.keySet();
		for(Thread thread : threads) {
			System.out.println("Name: "+ thread.getName()+((thread.isDaemon())?"(����)":"��"));
			System.out.println("/t"+"�Ҽӱ׷�:"+thread.getThreadGroup().getName());
			System.out.println();
		}
	}

}
