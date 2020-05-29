package EnumAutoboxStImportAnnot;

public class EnumDemo1 {
    public static void main(String[] args) {
        Transport tp;

        System.out.println("Constants Transport: ");
        for (Transport t: Transport.values()) {
            System.out.println(t);
        }
        System.out.println();

        tp = Transport.valueOf("AIRPLANE");
        System.out.println("tp contain: " + tp);
    }
}
