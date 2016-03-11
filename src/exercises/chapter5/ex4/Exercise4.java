package exercises.chapter5.ex4;

/**
 * @author Volodymyr Portianko
 * @date.created 11.03.2016
 */
public class Exercise4 {
    public Exercise4() {
        System.out.println("Creating class...");
    }

    public Exercise4(String string) {
        this();
        System.out.println(string);
    }

    public static void main(String[] args) {
        new Exercise4("My message");
    }
}
