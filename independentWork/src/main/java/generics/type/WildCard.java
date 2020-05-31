package generics.type;

public class WildCard {
    public static void main(String[] args) {
        NumericFns<Integer> iOb = new NumericFns<>(6);
        NumericFns<Double> dOb = new NumericFns<>(-6.0);
        NumericFns<Long> lOb = new NumericFns<>(5L);

        System.out.println("Comparisons iOb and dOb");
        if (iOb.absEqual(dOb)) {
            System.out.println("Absolute values match.");
        } else {
            System.out.println("Absolute values are different.");
        }

        System.out.println(System.lineSeparator() + "Comparisons iOb and lOb");
        if (iOb.absEqual(lOb)) {
            System.out.println("Absolute values match.");
        } else {
            System.out.println("Absolute values are different.");
        }
     }
}
