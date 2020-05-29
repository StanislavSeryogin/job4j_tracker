package EnumAutoboxStImportAnnot.autoBox;

import java.util.Scanner;

public class AutoBox1 {
    public static void main(String[] args) {
        int iOb, iOb1;
        int i;

        iOb = 99;
        System.out.println("Initial value iOb: " + iOb);

        ++iOb;
        System.out.println("After ++iOb: " + iOb);

        iOb += 10;
        System.out.println("After iOb += 10: " + iOb);

        iOb1 = iOb + (iOb / 3);
        System.out.println("After iOb1 = iOb + (iOb / 3) = " + iOb1);

        i = iOb + (iOb / 3);
        System.out.println("After i = iOb + (iOb / 3) = " + i); //repacking isn't performed

        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        switch (n) {
            case 1 -> System.out.println("one");
            case 2 -> System.out.println("two");
            default -> System.out.println("error");
        }
    }
}
