package exercises.chapter5.ex10;

/**
 * @author Volodymyr Portianko
 * @date.created 11.03.2016
 */
public class Exercise10 {
    @Override
    protected void finalize() throws Throwable {
        System.out.println("Cleaning object...");
        super.finalize();
    }

    public static void main(String[] args) {
        new Exercise10();
    }
}
