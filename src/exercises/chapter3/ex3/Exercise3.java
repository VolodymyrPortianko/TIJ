package exercises.chapter3.ex3;

import static net.mindview.util.Print.print;

/**
 * @author Volodymyr Portianko
 * @date.created 02.03.2016
 */
public class Exercise3 {
    float v;

    public static void main(String[] args) {
        Exercise3 exercise3 = new Exercise3();
        exercise3.v = 1.0f;
        print("Value of exercise3:" + exercise3.v);
        newValue(exercise3);
        print("Value of exercise3:" + exercise3.v);
    }

    static void newValue(Exercise3 givenValue) {
        givenValue.v = 4.5f;
    }
}
