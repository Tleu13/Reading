package epamJavaLab21.classes;

/**
 * Created by TleuAkma on 09.02.2017.
 */
public class ParserMyText {

     private   char[] chars;

    public char[] getChars() {
        return chars;
    }

    public void parseText(String text) {

        Composite myText = new Composite();

        String[] paragraphs =  text.split("(?<=\\\\n)");
        String[] sentences;
        String[] words;

        for (String par:paragraphs){
            Composite myParagraph = new Composite();
            sentences =  par.split("(?<=[.!?]\\\\s)(?=[A-ZА-Я])");
            Composite mySentence = new Composite();
           for (String sent:sentences){
               words =  sent.split("(?<=\\\\w)");
               Composite myWord = new Composite();
               for (String word:words){
                    chars = word.toCharArray();
                   for(int i = 0; i < word.length(); i++)
                   {
                       myWord.add(new Symbol(chars[i]));
                   }

                   mySentence.add(myWord);
               }
               myParagraph.add(mySentence);
           }
            myText.add(myParagraph);
        }


    }


}