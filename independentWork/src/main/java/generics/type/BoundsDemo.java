package generics.type;

public class BoundsDemo {
    public static void main(String[] args) {
        NumericFns<Integer> iOb = new NumericFns<>(5);

        System.out.println("Reciprocal iOb - " + iOb.reciprocal());
        System.out.println("Fractional iOb - " + iOb.fraction());
        System.out.println("Sum iOb - " + iOb.sum() + System.lineSeparator());

        NumericFns<Double> dOb = new NumericFns<>(5.25);
        System.out.println("Reciprocal dOb - " + dOb.reciprocal());
        System.out.println("Fractional dOb - " + dOb.fraction());
        System.out.println("Sum dOb - " + dOb.sum());
    }
}
