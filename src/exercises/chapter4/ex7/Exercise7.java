package exercises.chapter4.ex7;

import static net.mindview.util.Print.print;

/**
 * @author Volodymyr Portianko
 * @date.created 10.03.2016
 */
public class Exercise7 {
    public static void main(String[] args) {
        int i = 1;
        while (i <= 100) {
            if (i == 99) break;
            print(i);
            i++;
        }
    }
}
