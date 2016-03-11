package exercises.chapter5.ex19;

import java.util.Arrays;

/**
 * @author Volodymyr Portianko
 * @date.created 11.03.2016
 */
public class Exercise19 {

    static void printArgs(String... strings) {
        System.out.println(Arrays.toString(strings));
    }

    public static void main(String[] args) {
        printArgs("1","2","3");
        printArgs(new String[]{"1","2","3"});
    }
}
