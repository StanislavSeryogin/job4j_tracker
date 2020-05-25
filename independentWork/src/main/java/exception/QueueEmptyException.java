package exception;

public class QueueEmptyException extends Exception {
    public String toString() {
        return System.lineSeparator() + "Queue is empty";
    }
}
