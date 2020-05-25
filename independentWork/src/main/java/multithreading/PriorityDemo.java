package multithreading;

public class PriorityDemo {
    public static void main(String[] args) {
        Priority mt1 = new Priority("High priority");
        Priority mt2 = new Priority("low priority.");
        Priority mt3 = new Priority("Normal priority #1");
        Priority mt4 = new Priority("Normal priority #2");
        Priority mt5 = new Priority("Normal priority #3");

        mt1.thrd.setPriority(Thread.NORM_PRIORITY+2);
        mt2.thrd.setPriority(Thread.NORM_PRIORITY-2);

        mt1.thrd.start();
        mt2.thrd.start();
        mt3.thrd.start();
        mt4.thrd.start();
        mt5.thrd.start();

        try {
            mt1.thrd.join();
            mt2.thrd.join();
            mt3.thrd.join();
            mt4.thrd.join();
            mt5.thrd.join();
        } catch (InterruptedException exc) {
            System.out.println("Main thread interruption");
        }
        System.out.println(System.lineSeparator() + "High priority thread counter: " + mt1.count);
        System.out.println("Low priority thread counter: " + mt2.count);
        System.out.println("Counter first thread with normal priority: " + mt3.count);
        System.out.println("Counter second thread with normal priority: " + mt4.count);
        System.out.println("Counter third thread with normal priority: " + mt5.count);
    }
}
