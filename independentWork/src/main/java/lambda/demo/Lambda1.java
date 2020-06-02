package lambda.demo;

public class Lambda1 {
    public static void main(String[] args) {
        NumericTest myTest;

        myTest = (n, d) -> (n % d) == 0;
        if (myTest.test(10, 2)) {
            System.out.println("2 is a divisor of 10");
        }
        if (!myTest.test(10, 3)) {
            System.out.println("3 is not a divisor 10" + System.lineSeparator());
        }

        myTest = (n, m) -> (n < m);
        if (myTest.test(2, 10)) {
            System.out.println("2 less then 10");
        }
        if (!myTest.test(10, 2)) {
            System.out.println("10 not less then 2" + System.lineSeparator());
        }

        myTest = (n, m) -> (n < 0 ? -n : n) == (m < 0 ? -m : m);
        if (myTest.test(4, -4)) {
            System.out.println("Equal 4 and -4");
        }
        if (!myTest.test(4, -5)) {
            System.out.println("Not equal 4 and -5" + System.lineSeparator());
        }
    }
}
