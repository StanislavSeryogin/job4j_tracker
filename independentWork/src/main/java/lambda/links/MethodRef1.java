package lambda.links;

public class MethodRef1 {
    public static void main(String[] args) {
        boolean result;
        MyIntNum myNum = new MyIntNum(12);
        MyIntNum myNum1 = new MyIntNum(16);

        IntPredicate ip = myNum :: isFactor;

        result = ip.test(3);
        if (result) System.out.println("3 is a divisor " + myNum.getNum());

        ip = myNum1 :: isFactor;
        result = ip.test(3);
        if (!result) System.out.println("3 is not a divisor " + myNum1.getNum());

        ip = myNum::hasCommonFactor;
        result = ip.test(9);
        if (result) System.out.println("Common factor found");
    }
}
