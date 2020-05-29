package multithreading;

public class SumArray {
    private int sum;

    synchronized int sumArray(int[] nums) {
        sum = 0;
        for (int num : nums) {
            sum += num;
            System.out.println("Current value for " + Thread.currentThread().getName() + " will be " + sum);
            try {
                Thread.sleep(10);
            } catch (InterruptedException exc) {
                System.out.println("Stream interrupted");
            }
        }
        return sum;
    }
}
