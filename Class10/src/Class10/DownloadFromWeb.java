package Class10;

import java.io.*;
import java.net.URL;

// This program downloads a file from a given url
// and saves it to the local file
// Usage: java Download <url> <filename>

public class DownloadFromWeb {


    // Downloads a remote file to the local disk.
    // source - The url of the remote file
    // filename - The name of the target file.
    private static void download(String source, String filename) throws IOException {
        InputStream input =(new URL(source)).openStream();
        OutputStream output=new FileOutputStream(filename);

        int b;
        while ((b=input.read()) !=-1 )
        {
            output.write(b);
        }
        output.close();
        input.close();
    }

    public static void main(String[] args) {
        try {
            download("http://www.google.com/", "SHCHAFGoogle.html");

        } catch (ArrayIndexOutOfBoundsException aioobe) {
            System.err.println("Wrong usage.");

        } catch (IOException ioe) {
            System.err.println("Download failed");
        }
    }

}

