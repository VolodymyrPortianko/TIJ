package exercises.chapter3.ex13;

import static net.mindview.util.Print.print;

/**
 * @author Volodymyr Portianko
 * @date.created 02.03.2016
 */
public class Excercise13 {
    static String toBinaryString (char ch) {
        return Integer.toBinaryString(ch);
    }

    public static void main(String[] args) {
        print(toBinaryString('a'));
        print(toBinaryString('b'));
        print(toBinaryString('X'));
        print(toBinaryString('Y'));
        print(toBinaryString(';'));
    }
}
