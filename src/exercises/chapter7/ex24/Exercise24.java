package exercises.chapter7.ex24;

import static net.mindview.util.Print.print;

/**
 * @author Volodymyr Portianko
 * @date.created 22.03.2016
 */
public class Exercise24 {
}

class Insect {
    private int i = 9;
    protected int j;
    Insect() {
        print("i = " + i + ", j = " + j);
        j = 39;
    }
    static int printInit(String s) {
        print(s);
        return 47;
    }
    private static int x1 = printInit("static Insect.x1 initialized");
}

class Beetle extends Insect {
    private int k = printInit("Beetle.k initialized");
    public Beetle() {
        print("k = " + k);
        print("j = " + j);
    }
    private static int x2 = printInit("static Beetle.x2 initialized");

    public static void main(String[] args) {
        print("Beetle constructor");
        Beetle beetle = new Beetle();
    }
}

class ImprovedBeetle extends Beetle {
    private int l = printInit("ImprovedBeetle initialized");
    private static int x3 = printInit("static ImprovedBeetle.x3 initialized");

    public static void main(String[] args) {
        Beetle.main(args);
        ImprovedBeetle improvedBeetle = new ImprovedBeetle();
    }
}