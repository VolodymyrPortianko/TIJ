package exercises.chapter3.ex7;

import java.util.Random;

/**
 * @author Volodymyr Portianko
 * @date.created 02.03.2016
 */
public class Exercise7 {
    static String coinFlip() {
        Random random = new Random();
        return  random.nextBoolean()? "Head" : "Tail";
    }

    public static void main(String[] args) {
        System.out.println(coinFlip());
        System.out.println(coinFlip());
        System.out.println(coinFlip());
        System.out.println(coinFlip());
        System.out.println(coinFlip());
        System.out.println(coinFlip());
        System.out.println(coinFlip());
    }
}
