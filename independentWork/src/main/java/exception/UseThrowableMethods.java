package exception;

public class UseThrowableMethods {
    public static void main(String[] args) {
        try {
            ExcTest.genException();
        }
        catch (ArrayIndexOutOfBoundsException exc) {
            System.out.println("Standard post: ");
            System.out.println(exc);
            System.out.println(System.lineSeparator() + "Call stack: ");
            exc.printStackTrace();
        }
        System.out.println("After instruction catch");
    }
}
