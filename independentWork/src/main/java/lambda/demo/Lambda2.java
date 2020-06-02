package lambda.demo;

public class Lambda2 {
    public static void main(String[] args) {
        StringTest isIn = String::contains;
        String str = "This is test";
        System.out.println("Testing string: " + str);

        if (isIn.test(str, "This")) {
            System.out.println("'This' found");
        } else {
            System.out.println("'This' not found");
        }

        if (isIn.test(str, "zaq")) {
            System.out.println("'zaq' found");
        } else {
            System.out.println("'zaq' not found");
        }
    }
}
