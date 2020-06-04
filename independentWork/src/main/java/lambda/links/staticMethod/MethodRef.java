package lambda.links.staticMethod;

public class MethodRef {
    static boolean numTest(IntPredicate p, int v) {
        return p.test(v);
    }

    public static void main(String[] args) {
        boolean result;

        result = numTest(MyIntPredicates :: isPrime, 17);
        if (result) System.out.println("17 - prime number");

        result = numTest(MyIntPredicates :: isEven, 12);
        if (result) System.out.println("12 - even number");

        result = numTest(MyIntPredicates :: isPositive, 11);
        if (result) System.out.println("11 - positive number");
    }
}
