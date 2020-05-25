package inputAndOutput;

import methods.Err;

import java.io.*;

public class DtoS {
    public static void main(String[] args) {
        PrintWriter pw = new PrintWriter(System.out, true);
        String s;

        try (BufferedReader br = new
                BufferedReader(new FileReader("test.txt"))) {
            while ((s = br.readLine()) != null) {
                pw.println(s);
            }
        } catch (IOException exc) {
            pw.println("Error input - output: " + exc);
        }
    }
}
