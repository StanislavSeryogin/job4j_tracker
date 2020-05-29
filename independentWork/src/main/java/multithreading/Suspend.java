package multithreading;

public class Suspend {
    public static void main(String[] args) {
        MyThreadStop mt1 = MyThreadStop.createAndStart(" My stream");

        try {
            Thread.sleep(300);

            mt1.mysuspend();
            System.out.println("Stream suspension.");
            Thread.sleep(300);

            mt1.myresume();
            System.out.println("Resume stream.");
            Thread.sleep(300);

            mt1.mysuspend();
            System.out.println("Stream suspending.");
            Thread.sleep(300);

            mt1.myresume();
            System.out.println("Resume stream.");
            Thread.sleep(300);

            mt1.mysuspend();
            System.out.println("Stream stop.");
            mt1.mystop();
        } catch (InterruptedException e) {
            System.out.println("Main stream interrupted.");
        }

        try {
            mt1.thrd.join();
        } catch (InterruptedException e) {
            System.out.println("Main stream interrupted");
        }
        System.out.println("Exit main stream interrupted.");
    }
}
