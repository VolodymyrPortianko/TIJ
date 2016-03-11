package exercises.chapter5.ex15;

/**
 * @author Volodymyr Portianko
 * @date.created 11.03.2016
 */
public class Exercise15 {
    String string;

    {
        string = "String is initialized!";
    }

    public static void main(String[] args) {
        System.out.println(new Exercise15().string);
    }
}
