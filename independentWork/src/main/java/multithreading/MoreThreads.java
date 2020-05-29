package multithreading;

public class MoreThreads {
    public static void main(String[] args) {
        System.out.println("Main thread start.");

       /* MyThread mt1 = MyThread.creatAndStart("Spawned stream #1");
        MyThread mt2 = MyThread.creatAndStart("Spawned stream #2");
        MyThread mt3 = MyThread.creatAndStart("Spawned stream #3");

        do {
            System.out.print(".");
            try {
                Thread.sleep(100);
            } catch (InterruptedException exc) {
                System.out.println("Main thread interruption");
            }
        } while (mt1.thrd.isAlive() || mt2.thrd.isAlive() || mt3.thrd.isAlive());
        System.out.println("Completion of the main thread.");

        /*for (int i = 0; i < 50; i++) {
            System.out.print(".");
            try {
                Thread.sleep(100);
            } catch (InterruptedException exc) {
                System.out.println("Main thread interruption.");
            }
        }
        System.out.println("Completion of the main thread.");*/
    }
}
