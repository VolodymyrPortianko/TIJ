package exercises.chapter5.ex13;

import static net.mindview.util.Print.print;

/**
 * @author Volodymyr Portianko
 * @date.created 11.03.2016
 */
public class Exercise13 {
    public static void main(String[] args) {
        print("Inside main()");
        Cups.cup1.f(99);
    }

    static Cups cups1 = new Cups();
    static Cups cups2 = new Cups();
}

class Cup {
    Cup(int marker) {
        print("Cup(" + marker + ")");
    }

    void f(int marker) {
        print("f(" + marker + ")");
    }
}

class Cups {
    static Cup cup1;
    static Cup cup2;
    static {
        cup1 = new Cup(1);
        cup2 = new Cup(2);
    }
    Cups() {
        print("Cups()");
    }
}
