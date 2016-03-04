package exercises.chapter3.ex10;

import static net.mindview.util.Print.print;

/**
 * @author Volodymyr Portianko
 * @date.created 02.03.2016
 */
public class Excercise10 {
    static final int i1 = 0x45;
    static final int i2 = 0xFE;

    public static void main(String[] args) {
        print("i1 = " + Integer.toBinaryString(i1) + "; i2 = " + Integer.toBinaryString(i2));
        print("i1 & i2 = " + Integer.toBinaryString(i1 & i2));
        print("i1 | i2 = " + Integer.toBinaryString(i1 | i2));
        print("i1 ^ i2 = " + Integer.toBinaryString(i1 ^ i2));
    }
}
