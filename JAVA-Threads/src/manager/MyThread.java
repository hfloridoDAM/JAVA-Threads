package manager;

public class MyThread implements Runnable {

	private int milis;
	private String name;
	
	public MyThread(int milis, String name) {
		this.milis = milis;
		this.name = name;
	}
	
	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println("Thread " + name + "counting: " + i);
			try {
				Thread.sleep(milis);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}
