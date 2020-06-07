package lambda.block;

public class FactorialLambda {
    public static void main(String[] args) {
        MyFunc<Integer> factorial = (n) -> {
            int result = 1;
            for (int i = 1; i <= n; i++){
                result = i * result;
            } return result;
        };
        System.out.println("Factorial 3 is equal to " + factorial.func(3));
        System.out.println("Factorial 5 is equal to " + factorial.func(5));
        System.out.println("Factorial 9 is equal to " + factorial.func(9));
    }
}
