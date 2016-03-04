package exercises.chapter4.ex2;

import java.util.Random;

import static net.mindview.util.Print.print;
import static net.mindview.util.Print.printnb;

/**
 * @author Volodymyr Portianko
 * @date.created 04.03.2016
 */
public class Exercise2 {
    public static void main(String[] args) {
        Random random = new Random();
        int[] array = new int[25];
        for (int i = 0; i < 25; i++) {
            array[i] = random.nextInt();
        }
        for (int value : array) {
            printnb(value + ". Value is ");
            if (value == array[1])  printnb("equal to ");
            else if (value < array[1]) printnb("less than ");
            else printnb("greater than ");
            print("second item in array");
        }
    }
}
