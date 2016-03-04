package exercises.chapter4.ex5;

import static net.mindview.util.Print.print;
import static net.mindview.util.Print.printnb;

/**
 * @author Volodymyr Portianko
 * @date.created 04.03.2016
 */
public class Exercise5 {
    static final int i1 = 0x45;
    static final int i2 = 0xFE;

    public static void main(String[] args) {
        printnb("i1 = "); toBinaryString(i1);
        printnb("i2 = "); toBinaryString(i2);
        printnb("i1 & i2 = "); toBinaryString(i1 & i2);
        printnb("i1 | i2 = "); toBinaryString(i1 | i2);
        printnb("i1 ^ i2 = "); toBinaryString(i1 ^ i2);
    }

    public static void toBinaryString(int i) {
        char[] buffer = new char[32];
        int bufferPosition = 32;
        do {
            buffer[--bufferPosition] =
                    ((i & 0x01) != 0) ? '1' : '0';
            i >>>= 1;
        } while (i != 0);
        for(int j = bufferPosition; j < 32; j++)
            printnb(buffer[j]);
        print();
    }
}
