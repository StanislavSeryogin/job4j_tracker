package multithreading;

public class MyThread implements Runnable {
    Thread thrd;
    static final SumArray sa = new SumArray();
    int[] a;
    int answer;

    MyThread(String name, int[] nums) {
        thrd = new Thread(this, name);
        a = nums;
    }

    public static MyThread creatAndStart(String name, int[] nums) {
        MyThread myThread = new MyThread(name, nums);
        myThread.thrd.start();
        return myThread;
    }

    public void run() {
        int sum;
        System.out.println(thrd.getName() + " - launch");

        synchronized (sa) {
        answer = sa.sumArray(a);
        }

        System.out.println("Sum for " + thrd.getName() + " will be " + answer);
        System.out.println(thrd.getName() + " - completion.");


        /*try {
            for (int count = 0; count < 10; count++) {
                Thread.sleep(400);
                System.out.println("B " + thrd.getName() + ", count: " + count);
            }
        } catch (InterruptedException exc) {
            System.out.println(thrd.getName() + " - interrupted");
        }
        System.out.println(thrd.getName() + " - completion");*/
    }
}
