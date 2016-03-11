package exercises.chapter5.ex11;

/**
 * @author Volodymyr Portianko
 * @date.created 11.03.2016
 */
public class Exercise11 {

    @Override
    protected void finalize() throws Throwable {
        System.out.println("Cleaning object...");
        super.finalize();
    }

    public static void main(String[] args) {
        new Exercise11();
        System.gc();
        System.runFinalization();
    }
}
