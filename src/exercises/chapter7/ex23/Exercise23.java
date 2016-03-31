package exercises.chapter7.ex23;

/**
 * @author Volodymyr Portianko
 * @date.created 22.03.2016
 */
public class Exercise23 {
    public static void main(String[] args) {
        System.out.println(First.VALUE);
        System.out.println(First.VALUE);
        new First();
        new Second();
        System.out.println(Second.VALUE);
    }
}

class First {
    static int VALUE = 1;
    static {
        System.out.println("Loading First!");
    }
}

class Second {
    static int VALUE = 10;
    static {
        System.out.println("Loading Second!");
    }
}
