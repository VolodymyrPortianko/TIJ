package exercises.chapter4.ex4;

import static net.mindview.util.Print.print;

/**
 * @author Volodymyr Portianko
 * @date.created 04.03.2016
 */
public class Exercise4 {
    public static void main(String[] args) {
        int i = 1;
        outer:
        while (i++ != Integer.MAX_VALUE) {
            for (int j = 2; j < i; j++) {
                if (i % j == 0) continue outer;
            }
            print(i);
        }
    }
}
