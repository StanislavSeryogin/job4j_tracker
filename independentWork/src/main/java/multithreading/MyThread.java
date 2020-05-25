package multithreading;

public class MyThread implements Runnable {
    Thread thrd;

    MyThread(String name) {
        thrd = new Thread(this, name);
    }

    public static MyThread creatAndStart(String name) {
        MyThread myThread = new MyThread(name);
        myThread.thrd.start();
        return myThread;
    }

    public void run() {
        System.out.println(thrd.getName() + " - launch");
        try {
            for (int count = 0; count < 10; count++) {
                Thread.sleep(400);
                System.out.println("B " + thrd.getName() + ", count: " + count);
            }
        } catch (InterruptedException exc) {
            System.out.println(thrd.getName() + " - interrupted");
        }
        System.out.println(thrd.getName() + " - completion");
    }
}
