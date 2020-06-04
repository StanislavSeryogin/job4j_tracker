package lambda.generalizationsFI;

public class GenericFunctionalInterface {
    public static void main(String[] args) {
        SomeTest<Integer> isFactor = (n, d) -> (n % d) == 0;
        if (isFactor.test(10, 2)) {
            System.out.println("2 is a divisor 10" );
        }
        System.out.println();

        SomeTest<Double> isFactorD = (n, d) -> (n % d) == 0;
        if (isFactorD.test(212.0, 4.0)) {
            System.out.println("4.0 is a divisor 212.0");
        }
        System.out.println();

        SomeTest<String> isIn = (a, b) -> a.contains(b);
        String str = "Generic Functional Interface";
        System.out.println("Test string");
        if (isIn.test(str, "face")) {
            System.out.println("'face' found");
        } else {
            System.out.println("'face' not found");
        }
    }
}
