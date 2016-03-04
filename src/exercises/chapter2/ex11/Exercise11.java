package exercises.chapter2.ex11;

/**
 * @author Volodymyr Portianko
 * @date.created 01.03.2016
 */
public class Exercise11 {
    int anIntegerRepresentingColors;

    void changeTheHueOfTheColor(int newHue) {
        anIntegerRepresentingColors = newHue;
    }

    public static void main(String[] args) {
        Exercise11 exercise11 = new Exercise11();
        exercise11.changeTheHueOfTheColor(27);
    }
}
