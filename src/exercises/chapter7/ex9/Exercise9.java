package exercises.chapter7.ex9;

import static net.mindview.util.Print.print;

/**
 * @author Volodymyr Portianko
 * @date.created 14.03.2016
 */
public class Exercise9 {
    public static void main(String[] args) {
        new Stem();
    }
}

class Stem extends Root {
    Component1 component1 = new Component1();
    Component2 component2 = new Component2();
    Component3 component3 = new Component3();

    public Stem() {
        print("Stem constructor.");
    }
}

class Root {
    Component1 component1 = new Component1();
    Component2 component2 = new Component2();
    Component3 component3 = new Component3();

    public Root() {
        print("Root constructor.");
    }
}

class Component1 {
    public Component1() {
        print("Component1 constructor.");
    }
}
class Component2 {
    public Component2() {
        print("Component2 constructor.");
    }
}
class Component3 {
    public Component3() {
        print("Component3 constructor.");
    }
}
