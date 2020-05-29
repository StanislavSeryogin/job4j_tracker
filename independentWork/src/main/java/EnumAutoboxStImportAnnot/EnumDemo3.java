package EnumAutoboxStImportAnnot;

public class EnumDemo3 {
    public static void main(String[] args) {
        Transport tp, tp1, tp2;

        System.out.println("Enumeration constants Transport and their ordinal values: ");
        for (Transport t: Transport.values()) {
            System.out.println(t + " " + t.ordinal());
        }

        tp = Transport.AIRPLANE;
        tp1 = Transport.TRAIN;
        tp2 = Transport.AIRPLANE;
        System.out.println();

        if (tp.compareTo(tp1) < 0) {
            System.out.println(tp + " goes before " + tp1);
        }
        if (tp.compareTo(tp1) > 0) {
            System.out.println(tp1 + " goes before " + tp);
        }
        if (tp.compareTo(tp2) == 0) {
            System.out.println(tp + " coincides with " + tp2);
        }
    }
}
