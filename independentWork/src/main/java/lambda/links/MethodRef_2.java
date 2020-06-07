package lambda.links;

public class MethodRef_2 {
    public static void main(String[] args) {
        boolean result;
        MyIntNum myNum = new MyIntNum(12);
        MyIntNum myNum1 = new MyIntNum(16);

        MyIntNumPredicate inp = MyIntNum::isFactor;

        result = inp.test(myNum, 3);
        if (result) System.out.println("3 is a divisor " + myNum.getNum());

        result = inp.test(myNum1, 3);
        if (!result) System.out.println("3 is not divisor " + myNum1.getNum());
    }
}
