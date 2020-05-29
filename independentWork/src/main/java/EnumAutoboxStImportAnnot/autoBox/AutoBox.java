package EnumAutoboxStImportAnnot.autoBox;

public class AutoBox {
    static void m(Integer v) {
        System.out.println("m() got " + v);
    }

    static int m2() {
        return 10;
    }

    static Integer m3() {
        return 99;
    }

    public static void main(String[] args) {
        m(199);

        int iOb = m2();
        System.out.println("Value returned from m2(): " + iOb);

        int i = m3();
        System.out.println("Value returned from m3(): " + i);

        iOb = 100;
        System.out.println("Square root of iOb: " + Math.sqrt(iOb));
    }
}
