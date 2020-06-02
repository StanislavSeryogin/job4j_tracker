package lambda.demo;

public class Lambda {
    public static void main(String[] args) {
        MyValue myVal = () -> 98.6;
        System.out.println("Constant value: " + myVal.getValue());

        MyParamValue myPval = (n) -> 1.0 / n;
        System.out.println("The inverse of 4 is equal: " + myPval.getValue(4.0));
        System.out.println("The inverse of 8 is equal: " + myPval.getValue(8.0));
    }
}
