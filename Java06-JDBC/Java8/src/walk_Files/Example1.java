package walk_Files;

public class Example1 {
	public static void main(String[] args) {
		MyTask t = new MyTask();
		t.setName("Thread1");
		runExampleThread(t);
	}

	static void runExampleThread(Thread t) {
		printState("Before start()", t);
		t.start();
		printState("Start() called", t);
		printState("main sleeping for 1/2 sec", t);
		try {
			Thread.currentThread().sleep(500);
			System.out.println(Thread.currentThread().getState());
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		printState("main woke up", Thread.currentThread());
		Runtime.getRuntime().addShutdownHook(new Thread(() -> {
			printState("Shutting down", Thread.currentThread());
		}));
	}

	static void printState(String msg, Thread t) {
		System.out.printf("%s - %s state: %s%n", msg, t.getName(), t.getState());
	}

	private static class MyTask extends Thread {

		@Override
		public void run() {
			printState("Started-Run", this);
			// doing something
			for (int i = 0; i < 100; i++) {
				
				//System.out.print(Math.random());
			}
			printState("Finishing", this);
		}
	}
}