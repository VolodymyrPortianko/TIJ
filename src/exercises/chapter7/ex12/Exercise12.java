package exercises.chapter7.ex12;

import static net.mindview.util.Print.print;

/**
 * @author Volodymyr Portianko
 * @date.created 15.03.2016
 */
public class Exercise12 {
    public static void main(String[] args) {
        Stem stem = new Stem();
        print();
        stem.dispose();
    }
}

class Stem extends Root {
    Component1 component1 = new Component1();
    Component2 component2 = new Component2();
    Component3 component3 = new Component3();

    public Stem() {
        print("Stem constructor.");
    }

    public void dispose() {
        print("Disposing Stem");
        component3.dispose();
        component2.dispose();
        component1.dispose();
        super.dispose();
    }
}

class Root {
    Component1 component1 = new Component1();
    Component2 component2 = new Component2();
    Component3 component3 = new Component3();

    public Root() {
        print("Root constructor.");
    }

    public void dispose() {
        print("Disposing Root");
        component3.dispose();
        component2.dispose();
        component1.dispose();
    }
}

class Component1 {
    public Component1() {
        print("Component1 constructor.");
    }

    public void dispose() {
        print("Disposing component1");
    }
}
class Component2 {
    public Component2() {
        print("Component2 constructor.");
    }

    public void dispose() {
        print("Disposing component2");
    }
}
class Component3 {
    public Component3() {
        print("Component3 constructor.");
    }

    public void dispose() {
        print("Disposing component3");
    }
}
