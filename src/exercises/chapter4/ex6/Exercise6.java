package exercises.chapter4.ex6;

import static net.mindview.util.Print.print;

/**
 * @author Volodymyr Portianko
 * @date.created 10.03.2016
 */
public class Exercise6 {
    static boolean test(int testval, int begin, int end) {
        return (testval >= begin && testval <= end);
    }
    public static void main(String[] args) {
        print(test(10, 1, 100));
        print(test(5, 10, 100));
        print(test(99, 1, 100));
    }
}
