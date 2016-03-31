package exercises.chapter7.ex13;

import java.util.Arrays;
import java.util.Random;

import static net.mindview.util.Print.print;

/**
 * @author Volodymyr Portianko
 * @date.created 15.03.2016
 */
public class Exercise13 extends Root {

    public void typeInConsole(Random random) {
        print(random.nextInt());
    }

    public static void main(String[] args) {
        Exercise13 exercise13 = new Exercise13();
        exercise13.typeInConsole(1);
        exercise13.typeInConsole("123");
        exercise13.typeInConsole(new int[]{1, 2, 3, 5});
        exercise13.typeInConsole(new Random());
    }
}

class Root {
    public void typeInConsole(int[] array) {
        print(Arrays.toString(array));
    }

    public void typeInConsole(String string) {
        print(string);
    }

    public void typeInConsole(int value) {
        print(value);
    }
}
