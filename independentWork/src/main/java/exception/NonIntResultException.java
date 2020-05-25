package exception;

public class NonIntResultException extends Exception {
    int n, d;

    NonIntResultException (int i, int j) {
        n = i;
        d = j;
    }

    public String toString() {
        return "Result operation " + n + " / " + d + " not a whole number";
    }
}
