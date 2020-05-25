package inputAndOutput;

import java.io.*;

public class KtoD {
    public static void main(String[] args) {
        String str;
        BufferedReader br = new
                BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(System.out,true);

        pw.println("Sing of the end - input line 'stop'");

        try (FileWriter fw = new FileWriter("test.txt")) {
            do {
                pw.print(": ");
                str = br.readLine();
                if (str.compareTo("stop") == 0) break;
                str = str + "\r\n";
                fw.write(str);
            } while (str.compareTo("stop") != 0);
        } catch (IOException exc) {
            pw.println("Error input - output: " + exc);
        }
    }
}
