package exception;

public class RethrowDome {
    public static void main(String[] args) {
        try {
            Rethrow.genException();
        }
        catch (ArrayIndexOutOfBoundsException exc) {
            System.out.println("Fatal error - program executing interrupted");
        }
    }
}
