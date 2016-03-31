package exercises.chapter7.ex5;

/**
 * @author Volodymyr Portianko
 * @date.created 14.03.2016
 */
public class Exercise5 {
    public static void main(String[] args) {
        new C();
    }
}

class A {
    public A() {
        System.out.println("Class A");
    }
}

class B {
    public B() {
        System.out.println("Class B");
    }
}

class C extends A {
    B b = new B();
}
