package exception;

public class Rethrow {
    public static void genException() {
        int[] numer = {4, 8, 16, 32, 64, 128, 256, 512};
        int[] denom = { 2, 0, 4, 4, 0, 8};

        for (int i = 0; i < numer.length; i++) {
            try {
                System.out.println(numer[i] + " / " + denom[i] + " = " + numer[i] / denom[i]);
            }
            catch (ArithmeticException exc) {
                System.out.println("Division by zero attempt");
            }
            catch (ArrayIndexOutOfBoundsException exc) {
                System.out.println("Matching item not found");
                throw exc;
            }
        }
    }
}
