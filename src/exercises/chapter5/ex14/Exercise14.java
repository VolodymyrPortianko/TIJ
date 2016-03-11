package exercises.chapter5.ex14;


/**
 * @author Volodymyr Portianko
 * @date.created 11.03.2016
 */
public class Exercise14 {
    static String string1 = "First parameter";
    static String string2;

    static {
        string2 = "Second parameter";
    }

    static void printStaticFields() {
        System.out.println(string1);
        System.out.println(string2);
    }
}

class Run {
    public static void main(String[] args) {
        Exercise14.printStaticFields();
    }
}
