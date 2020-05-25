package multithreading;

public class ExtendTread {
    public static void main(String[] args) {
        System.out.println("Main thread start.");

        for (int i = 0; i < 50; i++) {
            System.out.print(".");
            try {
                Thread.sleep(100);
            } catch (InterruptedException exc) {
                System.out.println("Main thread interruption");
            }
        }
        System.out.println("Completion of the main thread");
    }
}
