package exercises.chapter7.ex19;

/**
 * @author Volodymyr Portianko
 * @date.created 22.03.2016
 */
public class Exercise19 {
    final String text;

    public Exercise19(String text) {
        this.text = text;
    }

    public Exercise19() {
        text = "Default";
    }

    public static void main(String[] args) {
        Exercise19 exercise19 = new Exercise19();
//        exercise19.text = "text";
    }
}
