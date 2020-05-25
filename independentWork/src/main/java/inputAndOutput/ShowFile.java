package inputAndOutput;

import java.io.*;

public class ShowFile {
    public static void main(String[] args) {
        int i;

        if (args.length != 1) {
            System.out.println("Used: ShowFile name_file");
            return;
        }

        try (FileInputStream fin = new FileInputStream(args[0])) {

            do {
                i = fin.read();
                if (i != -1) System.out.println((char) i);
            } while (i != -1);

        } catch (IOException exc) {
            System.out.println("Error input - output: " + exc);
        }
    }
}
