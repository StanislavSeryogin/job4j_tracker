package multithreading;

public class JoinThread {
    public static void main(String[] args) {
        System.out.println("Main thread start.");

        MyThread mt1 = MyThread.creatAndStart("Spawned stream #1");
        MyThread mt2 = MyThread.creatAndStart("Spawned stream #2");
        MyThread mt3 = MyThread.creatAndStart("Spawned stream #3");

        try {
            mt1.thrd.join();
            System.out.println("Spawned stream #1 - attached.");
            mt2.thrd.join();
            System.out.println("Spawned stream #2 - attached.");
            mt3.thrd.join();
            System.out.println("Spawned stream #3 - attached.");
        } catch (InterruptedException exc) {
            System.out.println("Main thread interrupted");
        }
        System.out.println("Completion main thread.");
    }
}
