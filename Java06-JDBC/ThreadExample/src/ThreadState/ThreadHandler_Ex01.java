package ThreadState;

public class ThreadHandler_Ex01 extends Thread {

	public ThreadHandler_Ex01() {

	}

	@Override
	public void run() {
		try {
			for (int i = 0; i < 10; i++) {
				System.out.println(i);
				if (i == 5) {
					synchronized (this) {
						wait();
						System.out.println("1");
					}
					System.out.println("--" + getState().toString());
				}
				
			}

		} catch (InterruptedException ex) {
			
		}
	}

	

}
