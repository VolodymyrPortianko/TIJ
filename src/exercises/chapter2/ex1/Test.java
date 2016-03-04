package exercises.chapter2.ex1;

/**
 * @author Volodymyr Portianko
 * @date.created 01.03.2016
 */
public class Test {
    private int intValue;
    private char charValue;

    public static void main(String[] args) {
        Test test = new Test();
        System.out.println(test.intValue);
        System.out.println(new Integer(test.charValue));
    }
}
