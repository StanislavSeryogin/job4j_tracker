package multithreading;

public class ThreadCom {
    public static void main(String[] args) {
        TickTock tt = new TickTock();
        MyThreadTickTock mt1 = MyThreadTickTock.createAndStart("Tick", tt);
        MyThreadTickTock mt2 = MyThreadTickTock.createAndStart("Tock", tt);

        try {
            mt1.thrd.join();
            mt2.thrd.join();
        } catch (InterruptedException exc) {
            System.out.println("Main thread interrupted.");
        }
    }
}
