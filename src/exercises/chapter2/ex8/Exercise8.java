package exercises.chapter2.ex8;

/**
 * @author Volodymyr Portianko
 * @date.created 01.03.2016
 */
public class Exercise8 {
    static int value = 0;

    public static void main(String[] args) {
        Exercise8 test1 = new Exercise8();
        Exercise8 test2 = new Exercise8();
        Exercise8 test3 = new Exercise8();
        test1.value++;
        test2.value++;
        test3.value++;
        System.out.println(Exercise8.value);
    }
}
