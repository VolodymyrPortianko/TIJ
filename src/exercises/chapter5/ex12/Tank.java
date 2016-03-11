package exercises.chapter5.ex12;

/**
 * @author Volodymyr Portianko
 * @date.created 11.03.2016
 */
public class Tank {
    boolean filled;

    void fill() { filled = true; }
    void emptied() { filled = false; }

    @Override
    protected void finalize() throws Throwable {
        if (filled) System.out.println("Object is not empty..");
        super.finalize();
    }

    public static void main(String[] args) {
        Tank tank1 = new Tank();
        Tank tank2 = new Tank();
        tank2.fill();
        tank1 = null;
        tank2 = null;
        System.gc();
        System.runFinalization();
    }
}
