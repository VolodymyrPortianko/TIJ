package exercises.chapter5.ex5;

import static net.mindview.util.Print.print;

/**
 * @author Volodymyr Portianko
 * @date.created 11.03.2016
 */
public class Dog {
    static void bark(byte byteValue) {
        print("byting");
    }

    static void bark(short shortValue) {
        print("shorting");
    }

    static void bark(char charValue) {
        print("charing");
    }

    static void bark(int intValue) {
        print("inting");
    }

    static void bark(long longValue) {
        print("longing");
    }

    static void bark(float floatValue) {
        print("floating");
    }

    static void bark(double doubleValue) {
        print("doubling");
    }

    static void bark(boolean boleanValue) {
        print("boleaning");
    }

    public static void main(String[] args) {
        bark((byte)5);
        bark((short) 5);
        bark((char) 5);
        bark(5);
        bark(5L);
        bark(5.0f);
        bark(5.0);
        bark(true);
    }
}
