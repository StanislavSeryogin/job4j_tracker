package methods;

public class VarArgs3 {
    //method overload;
    int vaTest(int ... v) {
        int result = 0;
        for (int i = 0; i < v.length; i++) {
            result = v[i];
        }
        return result;
    }
    static void vaTest(boolean ... v) {
        System.out.println("vaTest(boolean ...): " + "Number of arguments: " + v.length);
        System.out.println("Content: ");
        for (int i = 0; i < v.length; i++) {
            System.out.println(" arg " + i + ": " + v[i]);
        }
        System.out.println();
    }
    static void vaTest(String msg, int ... v) {
        System.out.println("vaTest(String, int ...): " + msg + v.length);
        System.out.println("Content: ");
        for (int i = 0; i < v.length; i++) {
            System.out.println(" arg " + i + ": " + v[i]);
        }
        System.out.println();
    }

   public static void main(String[] args) {
        VarArgs3 varArgs3 = new VarArgs3();
        System.out.println("vaTest(int ... ): "+ System.lineSeparator()
                + "Number arguments: " +  varArgs3.vaTest(1, 2, 3, 4) + System.lineSeparator());

        vaTest(true, false, false);
        vaTest("Testing: ", 10, 20);
    }
}
