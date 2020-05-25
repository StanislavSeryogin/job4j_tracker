package exception;

public class UseFinally {
    public static void genException(int what) {
        int t;
        int nums[] = new int[2];

        System.out.println("Received: " + what);
        try {
            switch (what) {
                case 0:
                    t = 10 / what;
                    break;
                case 1:
                    nums[4] = 4;
                    break;
                case 2:
                    return;
            }
        }
        catch (ArithmeticException exc) {
            System.out.println("Division by zero attempt");
            return;
        }
        catch (ArrayIndexOutOfBoundsException exc) {
            System.out.println("Matching item not found");
        }
        finally {
            System.out.println("Exit block try");
        }
    }
}
