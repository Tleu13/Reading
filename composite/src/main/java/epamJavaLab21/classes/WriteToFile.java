package epamJavaLab21.classes;

import java.io.*;

/**
 * Created by TleuAkma on 09.02.2017.
 */
public class WriteToFile {

    private String text;

    public WriteToFile(String text) {
        this.text = text;
    }

    public void writeTextToFile(){


        try {

            FileOutputStream myFile = new FileOutputStream("stalkingUTF.txt");

            PrintWriter out = new PrintWriter(myFile);

            out.print(text);

            out.close();

        } catch (IOException e){
            System.out.println("Don't write date to File");
        }
    }
}
