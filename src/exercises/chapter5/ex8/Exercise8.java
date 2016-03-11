package exercises.chapter5.ex8;

/**
 * @author Volodymyr Portianko
 * @date.created 11.03.2016
 */
public class Exercise8 {
    void method1() {
        System.out.println("First method");
    }

    void method2() {
        this.method1();
        method1();
    }

    public static void main(String[] args) {
        new Exercise8().method2();
    }
}
