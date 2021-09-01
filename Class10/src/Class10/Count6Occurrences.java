package Class10;

import java.io.*;

public class Count6Occurrences {
    static final int LOOK_FOR = 6;

    public static void main(String[] args) {
        long count = 0;

        try {
            InputStream input = new FileInputStream("dice.dat");
            int result;

            while ((result = input.read()) != -1) {
                if (result == LOOK_FOR) {
                    count++;
                }
            }
            input.close();
            System.out.println(count + " occurrences");

        } catch (IOException ioe) {
            System.err.println("Couldn�t read from file");
        }

    }

}

