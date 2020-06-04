package lambda.lambdaArgument;

public class VarCapture {
    public static void main(String[] args) {
        int num  = 10;

        MyFunc myL = (n) -> {
            //num ++; wrong!
            return num + n;
        };

        System.out.println(myL.func(8));

        //num = 9; deprives the status of the final variable
    }
}
