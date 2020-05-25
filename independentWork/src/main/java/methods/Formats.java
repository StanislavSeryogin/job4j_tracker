package methods;

import java.util.Date;

public class Formats {
    public static void main(String[] args) {
        int one = 32599876;
        double two = 9876541235.2589;
        Date tuday = new Date();
        String f = String.format("%,.1f", two);
        String d = String.format("%, d", one);
        String x = String.format("%x", 43);
        String c = String.format("%c", 43);
        String s = String.format("%, d or %,.2f", one, two);
        String tc = String.format("%tc",tuday);
        String tr = String.format("%tr", tuday);
        String tAtBtd = String.format("%tA, %<tB, %<td", tuday);
        System.out.println(f);
        System.out.println(d);
        System.out.println(x);
        System.out.println(c);
        System.out.println(s);
        System.out.println(tc);
        System.out.println(tr);
        System.out.println(tAtBtd);
    }
}
