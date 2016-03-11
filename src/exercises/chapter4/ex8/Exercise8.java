package exercises.chapter4.ex8;

import static net.mindview.util.Print.print;

/**
 * @author Volodymyr Portianko
 * @date.created 10.03.2016
 */
public class Exercise8 {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            switch (i) {
                case 0: print("Zero");
                case 1: print("One");
                case 2: print("Two");
                case 3: print("Three");
                case 4: print("Four");
            }
            print();
        }
    }
}
