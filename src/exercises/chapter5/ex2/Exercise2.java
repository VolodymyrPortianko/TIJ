package exercises.chapter5.ex2;

/**
 * @author Volodymyr Portianko
 * @date.created 11.03.2016
 */
public class Exercise2 {
    String string;
    String string2;

    {
        string = "First";
    }

    public Exercise2(String string2) {
        this.string2 = string2;
        System.out.println(string);
        System.out.println(string2);
    }

    public static void main(String[] args) {
        new Exercise2("Second");
    }
}
