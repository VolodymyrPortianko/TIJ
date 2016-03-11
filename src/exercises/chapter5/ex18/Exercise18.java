package exercises.chapter5.ex18;

/**
 * @author Volodymyr Portianko
 * @date.created 11.03.2016
 */
public class Exercise18 {
    public Exercise18(String string) {
        System.out.println(string);
    }

    public static void main(String[] args) {
        Exercise18[] exercise17s = new Exercise18[]{
                new Exercise18("First"),
                new Exercise18("Second"),
                new Exercise18("Third"),
                new Exercise18("Fourth"),
                new Exercise18("Fifth"),
        };
    }
}
