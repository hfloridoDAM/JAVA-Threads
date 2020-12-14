package main;

import manager.MyThread;

public class Main {

	public static void main(String[] args) {
		throwThread(1000, "Thread_1_second");
		throwThread(2000, "Thread_2_second");
		throwThread(5000, "Thread_5_second");
	}
	
	private static void throwThread(int milis, String name) {
		Runnable myThread = new MyThread(milis, name);
		Thread t = new Thread(myThread);
		t.start();
	}

}
