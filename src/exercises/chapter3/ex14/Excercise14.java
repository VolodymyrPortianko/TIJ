package exercises.chapter3.ex14;

import static net.mindview.util.Print.print;

/**
 * @author Volodymyr Portianko
 * @date.created 02.03.2016
 */
public class Excercise14 {
    static void stringTest(String s1, String s2) {
        print(s1 == s2);
        print(s1 != s2);
        print(s1.equals(s2));
    }

    public static void main(String[] args) {
        stringTest("text1", "text2");
    }
}
