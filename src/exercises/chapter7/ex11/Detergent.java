package exercises.chapter7.ex11;

import static net.mindview.util.Print.print;

/**
 * @author Volodymyr Portianko
 * @date.created 15.03.2016
 */
class Cleanser {
    private String s = "Cleanser";
    public void append(String a) { s += a; }
    public void dilute() {append(" dilute()"); }
    public void apply() {append(" apply()"); }
    public void scrub() {append(" scrub()"); }
    public String toString() { return s; }
    public static void main(String[] args) {
        Cleanser x = new Cleanser();
        x.dilute(); x.apply(); x.scrub();
        print(x);
    }

}

public class Detergent {

    private Cleanser cleanser = new Cleanser();

    public void append(String s) {
        cleanser.append(s);
    }

    public void dilute() {
        cleanser.dilute();
    }

    public void apply() {
        cleanser.apply();
    }

    public void scrub() {
        append(" Detergent.scrub()");
        cleanser.scrub();
    }

    @Override
    public String toString() {
        return cleanser.toString();
    }

    public void foam() { append(" foam()"); }

    public static void main(String[] args) {
        Detergent x = new Detergent();
        x.dilute(); x.apply(); x.scrub(); x.foam();
        print(x);
        print("Testing base class:");
        Cleanser.main(args);
    }
}
