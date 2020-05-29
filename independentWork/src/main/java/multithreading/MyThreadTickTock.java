package multithreading;

public class MyThreadTickTock implements  Runnable {
    Thread thrd;
    TickTock ttOb;

    MyThreadTickTock(String name, TickTock tt) {
        thrd = new Thread(this, name);
        ttOb = tt;
    }

    public static MyThreadTickTock createAndStart(String name, TickTock tt) {
        MyThreadTickTock myThrd = new MyThreadTickTock(name, tt);
        myThrd.thrd.start();
        return myThrd;
    }

    public void run() {
        if (thrd.getName().compareTo("Tick") == 0) {
            for (int i = 0; i < 7; i++) ttOb.tick(true);
                ttOb.tick(false);
        } else {
            for (int i = 0; i < 7; i++) ttOb.tock(true);
                ttOb.tock(false);
        }
    }
}
