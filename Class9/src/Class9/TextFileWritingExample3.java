package Class9;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class TextFileWritingExample3 {
    public static void main(String[] args) {
        try {
            FileOutputStream outputStream = new FileOutputStream("MyFile3.txt");
            OutputStreamWriter outputStreamWriter = new OutputStreamWriter(outputStream, "UTF-16");
            BufferedWriter bufferedWriter = new BufferedWriter(outputStreamWriter); // Error - Constructor requires parameter and not provided

            bufferedWriter.write("First Line");
            bufferedWriter.newLine();
            bufferedWriter.write("Second Line");

            bufferedWriter.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
