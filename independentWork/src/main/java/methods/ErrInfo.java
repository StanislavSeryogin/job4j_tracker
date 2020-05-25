package methods;

public class ErrInfo {
    public static void main(String[] args) {
        ErrorInfo err = new ErrorInfo();
        Err e;

        e = err.getErrorInfo(3);
        System.out.println(e.msg + " level: " + e.severity);

        e = err.getErrorInfo(7);
        System.out.println(e.msg + " level: " + e.severity);
    }
}
