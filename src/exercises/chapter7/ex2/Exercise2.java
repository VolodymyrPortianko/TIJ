package exercises.chapter7.ex2;

import static net.mindview.util.Print.print;

/**
 * @author Volodymyr Portianko
 * @date.created 14.03.2016
 */
public class Exercise2 extends Detergent {
    @Override
    public void scrub() {
        append(" Exercise2.scrub()");
        super.scrub();
    }

    public void sterilize() { append(" sterilize()"); }

    public static void main(String[] args) {
        Exercise2 x = new Exercise2();
        x.dilute(); x.apply(); x.scrub(); x.foam(); x.sterilize();
        print(x);
        print("Base class: ");
        Detergent.main(args);
    }
}
