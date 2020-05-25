package exception;

public class QueueFullException extends Exception {
    int size;

    public QueueFullException(int s) {
        size = s;
    }

    public String toString() {
        return System.lineSeparator() + "The queue is full. Maximum size " + size;
    }
}
