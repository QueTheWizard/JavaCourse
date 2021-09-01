package Class9;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class TextFileWriter {
    public static void main(String[] args) {
        try {
//            FileWriter writer = new FileWriter("MyFile.txt");
            FileWriter writer = new FileWriter("MyFile.txt", true);
            BufferedWriter bufferedWriter = new BufferedWriter(writer);

//            writer.write("Hello World");
//            writer.write("\r\n");
//            writer.write("Good Bye Arie!");
//            writer.write("\r\n");
//            writer.write("idan");
//            writer.close();

            bufferedWriter.write("Hello World");
            bufferedWriter.newLine();
            bufferedWriter.write("Good Bye Arie!");
            bufferedWriter.newLine();
            bufferedWriter.write("idan");
            bufferedWriter.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
