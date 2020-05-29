package EnumAutoboxStImportAnnot.staticImport;

import static java.lang.Math.*;
import static java.lang.System.out;

public class Quadratic {
    public static void main(String[] args) {
        double a, b, c, x;
        a = 4;
        b = 1;
        c = -3;

        x = (-b + sqrt(pow(b, 2) - 4 * a * c)) / (2 * a);
        out.println("First root: " + x);

        x = (-b - sqrt(pow(b, 2) - 4 * a * c)) / (2 * a);
        out.println("Second root: " + x);
    }
}
