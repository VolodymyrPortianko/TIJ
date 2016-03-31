package exercises.chapter7.ex7;

/**
 * @author Volodymyr Portianko
 * @date.created 14.03.2016
 */
public class Exercise7 {
    public static void main(String[] args) {
        new C(12);
    }
}

class A {
    public A(int i) {
        System.out.println("Class A");
    }
}

class B {
    public B(int i) {
        System.out.println("Class B");
    }
}

class C extends A {
    public C(int i) {
        super(i);
    }

    B b = new B(11);
}
