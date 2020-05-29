package multithreading;

public class UseMain {
    public static void main(String[] args) {
        Thread thrd;
        thrd = Thread.currentThread();
        System.out.println("Name main stream: " + thrd.getName());
        System.out.println("Priority: " + thrd.getPriority() + System.lineSeparator());

        System.out.println("Set priority name" + System.lineSeparator());
        thrd.setName("Stream #1");
        thrd.setPriority(Thread.NORM_PRIORITY + 3);
        System.out.println("New name main stream: " + thrd.getName());
        System.out.println("New values priority: " + thrd.getPriority());
    }
}
