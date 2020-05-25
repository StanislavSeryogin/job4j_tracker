package exception;

public class ExcDemo2 {
    public static void main(String[] args) {
        try {
            ExcTest.genException();
        }
        catch (ArrayIndexOutOfBoundsException exc) {
            System.out.println("Out of bounds array");
        }
        System.out.println("After instruction catch");
    }
}
