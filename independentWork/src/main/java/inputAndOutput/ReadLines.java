package inputAndOutput;

import java.io.*;

public class ReadLines {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new
                BufferedReader(new InputStreamReader(System.in));

        String str;

        System.out.println("Enter text strings");
        System.out.println("The sing of the end - input line 'stop'");
        do {
            str = br.readLine();
            System.out.println(str);
        } while (!str.equals("stop"));
    }
}
