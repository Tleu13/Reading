package epamJavaLab21.classes;

import epamJavaLab21.interfaces.Printable;

/**
 * Created by TleuAkma on 09.02.2017.
 */
public class Symbol implements Printable {


   private char symbol;


    public Symbol(char symbol) {
        this.symbol = symbol;
    }


    @Override
    public String toString() {



        return ""+symbol;
    }

    @Override
    public void print() {
        System.out.println(this.symbol);

    }
}
