package exercises.chapter5.ex6;

/**
 * @author Volodymyr Portianko
 * @date.created 11.03.2016
 */
public class Exercise6 {
    static void bark(int intValue, long longValue) {
        System.out.println("First method");
    }

    static void bark(long longValue, int intValue) {
        System.out.println("Second method");
    }

    public static void main(String[] args) {
        bark(1, 1L);
        bark(1L, 1);
    }
}
