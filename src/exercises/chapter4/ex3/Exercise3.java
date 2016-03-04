package exercises.chapter4.ex3;

import java.util.Random;

import static net.mindview.util.Print.print;
import static net.mindview.util.Print.printf;

/**
 * @author Volodymyr Portianko
 * @date.created 04.03.2016
 */
public class Exercise3 {
    public static void main(String[] args) {
        Random random = new Random();
        while (true) {
            int value1 = random.nextInt();
            int value2 = random.nextInt();
            printf("First value: %d, Second value: %d.\n", value1, value2);
            if (value1 < value2) print("Second value is bigger");
            else if (value1 > value2) print("First value is bigger");
            else print("Values are equal");
        }
    }
}
