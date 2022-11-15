package ie.atu.week8;

import java.io.*;
import java.io.IOException;

public class CreateFile {
    public static void main(String[] args) throws IOException {
        File myFile = new File("PaddysFile.txt");
        myFile.createNewFile();
        System.out.println("My file is located at: " + myFile.getAbsolutePath());

        try {
            PrintWriter outWriter = new PrintWriter(new FileWriter(myFile,true));
            outWriter.write("My name is paddy");
            outWriter.write("I am 19");
            outWriter.close();
        }
        catch(IOException e){
            System.out.println("Error occured");
        }

    }
}
