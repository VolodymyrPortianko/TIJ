package exercises.chapter3.ex4;

import static net.mindview.util.Print.print;

/**
 * @author Volodymyr Portianko
 * @date.created 02.03.2016
 */
public class Exercise4 {
    static float calculateVelocity(float kilometers, int hours) {
        return kilometers/hours;
    }

    public static void main(String[] args) {
        float velocity = calculateVelocity(151,2);
        print("Velocity: " + velocity);
    }
}
