package epamJavaLab21.classes;

import epamJavaLab21.interfaces.Printable;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by TleuAkma on 09.02.2017.
 */
public class Composite implements Printable {

    private List<Printable> childPrintable = new ArrayList<>();

    public void add(Printable printable) {
        childPrintable.add(printable);
    }

    @Override
    public void print() {
        for (Printable printable: childPrintable) {
            printable.print();
        }
    }
}
