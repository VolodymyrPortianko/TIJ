package exercises.chapter3.ex11;

import static net.mindview.util.Print.print;

/**
 * @author Volodymyr Portianko
 * @date.created 02.03.2016
 */
public class Excercise11 {
    static int i1 = 0x80000000;

    public static void main(String[] args) {
        for (int i = 0; i < 20; i++) {
            i1 >>= 1;
            print(Integer.toBinaryString(i1));
        }
    }
}
