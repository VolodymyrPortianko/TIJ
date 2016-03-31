package exercises.chapter7.ex18;

/**
 * @author Volodymyr Portianko
 * @date.created 22.03.2016
 */
public class Exercise18 {
    static final String STATIC_TEXT = "STATIC TEXT";
    final String TEXT = "TEXT";

    public static void main(String[] args) {
        System.out.println(Exercise18.STATIC_TEXT);
        System.out.println(new Exercise18().TEXT);
    }
}
