package exercises.chapter7.ex10;

import static net.mindview.util.Print.print;

/**
 * @author Volodymyr Portianko
 * @date.created 14.03.2016
 */
public class Exercise10 {
    public static void main(String[] args) {
        new Stem("from main()");
    }
}

class Stem extends Root {
    Component1 component1 = new Component1("Stem component");
    Component2 component2 = new Component2("Stem component");
    Component3 component3 = new Component3("Stem component");

    public Stem(String s) {
        super("from Stem");
        print("Stem constructor." + s);
    }
}

class Root {
    Component1 component1 = new Component1("Root component");
    Component2 component2 = new Component2("Root component");
    Component3 component3 = new Component3("Root component");

    public Root(String s) {
        print("Root constructor." + s);
    }
}

class Component1 {
    public Component1(String s) {
        print("Component1 constructor." + s);
    }
}
class Component2 {
    public Component2(String s) {
        print("Component2 constructor." + s);
    }
}
class Component3 {
    public Component3(String s) {
        print("Component3 constructor." + s);
    }
}
