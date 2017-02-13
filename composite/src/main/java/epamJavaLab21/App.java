package epamJavaLab21;

import epamJavaLab21.classes.ParserMyText;
import epamJavaLab21.classes.ReaderFromFile;
import epamJavaLab21.classes.WriteToFile;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ReaderFromFile readerFromFile = new ReaderFromFile();

        readerFromFile.readTextFile();

        String text = readerFromFile.getMyText();

        ParserMyText parser = new ParserMyText();

       parser.parseText(text);


      String s = String.valueOf(parser.getChars());


      WriteToFile writeToFile = new WriteToFile(s);
      writeToFile.writeTextToFile();
    }
}
