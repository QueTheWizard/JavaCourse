package Class10;

import java.io.*;

public class GenerateDiceData {
    static final int NUMBER_OF_TOSSES = 600000;

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        try {
            OutputStream output = new FileOutputStream("dice.dat");

            for (long i = 0; i < NUMBER_OF_TOSSES; i++) {
                int randomThrow = (int) (Math.random() * 6) + 1;

                output.write(randomThrow);
            }
            System.out.println("Successful dice throw");
            output.close();

        } catch (IOException ioe) {
            System.err.println("Couldn't write to file");
        }

    }

}
