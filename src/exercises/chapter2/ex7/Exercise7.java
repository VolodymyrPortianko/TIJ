package exercises.chapter2.ex7;

/**
 * @author Volodymyr Portianko
 * @date.created 01.03.2016
 */
class StaticTest {
    static int value = 47;
}

public class Exercise7 {
    static void increment() {
        StaticTest.value++;
    }

    public static void main(String[] args) {
        Exercise7.increment();
        Exercise7 exercise7 = new Exercise7();
        exercise7.increment();
        System.out.println(StaticTest.value);
    }
}
