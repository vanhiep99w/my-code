package thread_state;

public class Ex03_ThreadWaiting {
	public static void main(String[] args) throws InterruptedException {
        MyTask3 t = new MyTask3();
        t.setName("Thread3");
        Ex01_ThreadState.runExampleThread(t);
        synchronized (Ex03_ThreadWaiting.class) {
        	Ex03_ThreadWaiting.class.notifyAll();
        }
    }

    private static class MyTask3 extends Thread {

        @Override
        public void run() {
        	Ex01_ThreadState.printState("thread run() started", this);
            //using Example3.class object monitor
            synchronized (Ex03_ThreadWaiting.class ) {
                try {
                    //this will put the thread in WAITING state
                	Ex03_ThreadWaiting.class.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            Ex01_ThreadState.printState("thread finishing", this);
        }
    }
}
