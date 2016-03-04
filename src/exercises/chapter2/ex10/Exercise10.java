package exercises.chapter2.ex10;

/**
 * @author Volodymyr Portianko
 * @date.created 01.03.2016
 */
public class Exercise10 {
    public static void main(String[] args) {
        if (args.length < 3) {
            System.err.println("Need 3 arguments");
            System.exit(1);
        }
        System.out.println(args[0]);
        System.out.println(args[1]);
        System.out.println(args[2]);
    }
}
