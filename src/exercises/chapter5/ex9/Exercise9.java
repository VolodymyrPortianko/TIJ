package exercises.chapter5.ex9;

/**
 * @author Volodymyr Portianko
 * @date.created 11.03.2016
 */
public class Exercise9 {
    public Exercise9() {
        System.out.println("Default constructor");
    }

    public Exercise9(String s) {
        this();
        System.out.println(s);
    }

    public static void main(String[] args) {
        new Exercise9("String");
    }
}
