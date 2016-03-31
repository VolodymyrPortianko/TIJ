package exercises.chapter6.ex6;

/**
 * @author Volodymyr Portianko
 * @date.created 14.03.2016
 */
public class Exercise6 {
    public static void main(String[] args) {
        System.out.println(++new HelpClass().value);
    }
}

class HelpClass {
    protected int value = 1;
}
