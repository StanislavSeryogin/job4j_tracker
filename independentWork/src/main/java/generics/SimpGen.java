package generics;

public class SimpGen {
    public static void main(String[] args) {
        TwoGen<Integer, String> twoGen = new TwoGen<>(88, "Generics");
        twoGen.showType();

        int v = twoGen.getOb();
        System.out.println("Value: " + v);

        String str = twoGen.getOb1();
        System.out.println("Value: " + str);
    }
}
