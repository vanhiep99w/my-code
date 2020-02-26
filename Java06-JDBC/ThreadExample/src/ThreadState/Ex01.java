package ThreadState;

public class Ex01 {
	public static void main(String[] args) {
		ThreadHandler_Ex01 thread = new ThreadHandler_Ex01();
		System.out.println("Thread Ex01"+thread.getState().toString());
		thread.start();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		synchronized (thread) {
			System.out.println("Thread Ex01 pre notify "+thread.getState().toString());
			thread.notify();
			System.out.println("Thread Ex01 after notify 1"+thread.getState().toString());
			System.out.println("Thread Ex01 after notify 1"+thread.getState().toString());
			System.out.println("Thread Ex01 after notify 1"+thread.getState().toString());
		}
		System.out.println("Thread Ex01 after notify 2"+thread.getState().toString());
	}
}
