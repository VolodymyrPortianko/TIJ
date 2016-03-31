package exercises.chapter7.ex20;

import static net.mindview.util.Print.print;

/**
 * @author Volodymyr Portianko
 * @date.created 22.03.2016
 */
public class Exercise20 {
    public static void main(String[] args) {
        OverridingPrivate2 overridingPrivate2 = new OverridingPrivate2();
        overridingPrivate2.f();
        overridingPrivate2.g();
        OverridingPrivate overridingPrivate = overridingPrivate2;
//        overridingPrivate.f();
    }
}

class WithFinals {
    private final void f() {
        print("WithFinals.f()");
    }

    private void g() {
        print("WithFinals.g()");
    }
}

class OverridingPrivate extends WithFinals {
//    @Override
    private final void f() {
        print("OverridingPrivate.f()");
    }
//    @Override
    private void g() {
        print("OverridingPrivate.g()");
    }
}

class OverridingPrivate2 extends OverridingPrivate {
//    @Override
    public final void f() {
        print("OverridingPrivate2.f()");
    }
//    @Override
    public void g() {
        print("OverridingPrivate2.g()");
    }
}