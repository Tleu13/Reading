package epamJavaLab21.classes;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by TleuAkma on 09.02.2017.
 */
public class ReaderFromFile {

    String myText = "";

    char lf =  0x0A;
    String endLine = ""+lf;
   /* List<String> myTextArray = new ArrayList<>();


    public void showArray(){

        for(String str:myTextArray){
            System.out.println(str);
        }
    }*/

    public void readTextFile(){

        try (FileInputStream myFile = new FileInputStream("src\\main\\resources\\stalkingUTF.txt");
             InputStreamReader inputStreamReader = new InputStreamReader(myFile, "UTF-8");
             BufferedReader reader = new BufferedReader(inputStreamReader)) {

            String nextLine;
            boolean eof = false;
            while (!eof) {
                nextLine = reader.readLine();
                if (nextLine == null){
                    eof = true;
                } else {
                    myText += nextLine+endLine;
                   // myTextArray.add(nextLine);
                }
            }

        }catch (IOException e){
            System.out.println("Can't read Stalking.txt");
        }

    }

    public String getMyText() {

        String result = myText.replaceAll("[\r\n]+$", "");
       // String myText = String.join("", myTextArray);
       return result;
    }

}
