package exercises.chapter7.ex4;

/**
 * @author Volodymyr Portianko
 * @date.created 14.03.2016
 */
public class Exercise4  extends B {
    public Exercise4() {
        System.out.println("Exercise constructor");
    }

    public static void main(String[] args) {
        new Exercise4();
    }
}

class A {
    public A() {
        System.out.println("A constructor");
    }
}

class B extends A {
    public B() {
        System.out.println("B constructor");
    }
}
