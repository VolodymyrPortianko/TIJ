package exercises.chapter2.ex6;

/**
 * @author Volodymyr Portianko
 * @date.created 01.03.2016
 */
public class Exercise6 {
    int storage(String s) {
        return s.length() * 2;
    }

    public static void main(String[] args) {
        Exercise6 exercise6 = new Exercise6();
        String s = "Hello world!";
        System.out.println(s + ": " + exercise6.storage(s));
    }
}
