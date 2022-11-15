package ie.atu.week8;

import java.io.*;
import java.io.IOException;

public class CreateFile {
    public static void main(String[] args) throws IOException {
        File myFile = new File("PaddysFile.txt");
        myFile.createNewFile();
        System.out.println("My file is located at: " + myFile.getAbsolutePath());

        try{
            FileWriter myWriter = new FileWriter(myFile, true);
            myWriter.write("My name is Paddy");
            myWriter.write("I am 19");
            myWriter.close();
        }
        catch(IOException e){
            System.out.println("There is an error");
        }


    }
}
