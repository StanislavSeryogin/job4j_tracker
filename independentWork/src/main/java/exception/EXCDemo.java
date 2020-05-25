package exception;

public class EXCDemo {
    public static void main(String[] args) {
        int[] nums = new int[4];

        try {
            System.out.println("Before generate Exception");

            nums[0] = 10; // will not be displayed
            System.out.println("Will not be displayed");
        }
        catch (ArrayIndexOutOfBoundsException exc) {
            System.out.println("Out of bounds array");
        }
        System.out.println("After instruction catch");
    }
}
