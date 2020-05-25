package exception;

public class ThrowDemo {
    public static void main(String[] args) {
        try {
            System.out.println("Before instruction throw");
            throw new ArithmeticException();
        }
        catch (ArithmeticException exc) {
            System.out.println("Exception catch");
        }
        System.out.println("After block try/catch");
    }
}
