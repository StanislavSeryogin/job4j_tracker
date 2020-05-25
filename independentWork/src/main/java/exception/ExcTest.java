package exception;

public class ExcTest {
    static void genException() {
        int[] nums = new int[4];

        System.out.println("Before generate exception");
        nums[7] = 10;
        System.out.println("This line will not be displayed");
    }
}
