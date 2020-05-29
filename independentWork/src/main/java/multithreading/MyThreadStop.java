package multithreading;

public class MyThreadStop implements Runnable {
    Thread thrd;
    boolean suspended;
    boolean stopped;

    MyThreadStop(String name) {
        thrd = new Thread(this, name);
        suspended = false;
        stopped = false;
    }

    public static MyThreadStop createAndStart(String name) {
        MyThreadStop myThrd = new MyThreadStop(name);
        myThrd.thrd.start();
        return myThrd;
    }

    public void run() {
        System.out.println(thrd.getName() + " - start.");
        try {
            for (int i = 0; i < 300; i++) {
                System.out.print(i + " ");
                if ((i % 10) == 0) {
                    System.out.println();
                    Thread.sleep(100);
                }
            }
            synchronized (this) {
                while (suspended) {
                    wait();
                    if (stopped) break;
                }
            }
        } catch (InterruptedException exc) {
            System.out.println(thrd.getName() + " - interrupted.");
        }
        System.out.println(thrd.getName() + " - exit.");
    }

    synchronized void mystop() {
        stopped = true;
        suspended = false;
        notify();
    }

    synchronized void mysuspend() {
        suspended = true;
    }

    synchronized void myresume() {
        suspended = false;
        notify();
    }
}
