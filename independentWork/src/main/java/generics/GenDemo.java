package generics;

public class GenDemo {
    public static void main(String[] args) {
        Gen<Integer> iOb = new Gen<>(88);
        iOb.showType();
        int v = iOb.getOb();
        System.out.println("Value: " + v + System.lineSeparator());

        Gen<String> strOb = new Gen<>("Testing generics");
        strOb.showType();
        String str = strOb.getOb();
        System.out.println("value: " + str);
    }
}
