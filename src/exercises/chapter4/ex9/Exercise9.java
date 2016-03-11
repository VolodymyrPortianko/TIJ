package exercises.chapter4.ex9;

import static net.mindview.util.Print.print;

/**
 * @author Volodymyr Portianko
 * @date.created 10.03.2016
 */
public class Exercise9 {
    public static String fibonacci(int end) {
        StringBuilder builder = new StringBuilder();
        builder.append("1, 1");
        int firstValue = 1;
        int secondValue = 1;
        while (true) {
            firstValue = firstValue + secondValue;
            if (firstValue > end) break;
            secondValue = firstValue - secondValue;
            builder.append(", ").append(firstValue);
        }
        return builder.toString();
    }

    public static void main(String[] args) {
        print(fibonacci(21));
    }
}
