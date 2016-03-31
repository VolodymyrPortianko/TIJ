package exercises.chapter7.ex8;

/**
 * @author Volodymyr Portianko
 * @date.created 14.03.2016
 */
public class Exercise9 extends BaseClass {

    public Exercise9() {
        super(1);
    }

    public Exercise9(int i) {
        super(i);
    }

    public static void main(String[] args) {
        new Exercise9();
        new Exercise9(12);
    }
}

class BaseClass {
    public BaseClass(int i) {
        System.out.println(i);
    }
}
