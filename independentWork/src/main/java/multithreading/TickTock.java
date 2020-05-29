package multithreading;

public class TickTock {
    String state;

    synchronized void tick(boolean running) {
        if (!running) {
            state = "ticked";
            notify();
            return;
        }
        System.out.print("Tick ");

        try {
            Thread.sleep(500);
        } catch (InterruptedException exc) {
            System.out.println("Stop thread execution");
        }

        state = "ticked";
        notify();
        try {
            while (!state.equals("tocked")) {
                wait();
            }
        } catch (InterruptedException exc) {
            System.out.println("Flow interruption");
        }
    }

    synchronized void tock(boolean running) {
        if (!running) {
            state = "tocked";
            notify();
            return;
        }
        System.out.println("Tock");

        try {
            Thread.sleep(500);
        } catch (InterruptedException exc) {
            System.out.println("Stop thread execution");
        }

        state = "tocked";
        notify();
        try {
            while (!state.equals("ticked")) {
                wait();
            }
        } catch (InterruptedException exc) {
            System.out.println("Flow interruption");
        }
    }
}
