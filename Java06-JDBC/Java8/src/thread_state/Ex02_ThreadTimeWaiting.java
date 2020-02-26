package thread_state;



public class Ex02_ThreadTimeWaiting {
    public static void main(String[] args) {
        MyTask2 t = new MyTask2();
        t.setName("Thread2");
        Ex01_ThreadState.runExampleThread(t);
    }

    private static class MyTask2 extends Thread {
        @Override
        public void run() {
            Ex01_ThreadState.printState("thread run() started", this);
            try {
                //this will put the thread in TIMED_WAITING state
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            Ex01_ThreadState.printState("thread finishing", this);
        }
    }
}