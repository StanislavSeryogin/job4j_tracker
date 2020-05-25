package inputAndOutput;

import java.io.*;

public class AvgNums {
    public static void main(String[] args) throws IOException {
        PrintWriter pw = new PrintWriter(System.out, true);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str;
        int n;
        double sum = 0.0;
        double avg, t;

        System.out.print("How many numbers need to enter: ");
        str = br.readLine();

        try {
            n = Integer.parseInt(str);
        } catch (NumberFormatException exc) {
            pw.println("Wrong format");
            n = 0;
        }

        pw.println("Input " + n + " value");
        for (int i = 0; i < n; i++) {
            pw.print("- ");
            str = br.readLine();
            try {
                t = Double.parseDouble(str);
            } catch (NumberFormatException exc) {
                pw.println("Wrong format");
                t = 0.0;
            }
            sum += t;
        }
        avg = sum / n;
        pw.println("Average value: " + avg);
    }
}
