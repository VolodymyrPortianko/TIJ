package exercises.chapter6.ex5;

/**
 * @author Volodymyr Portianko
 * @date.created 14.03.2016
 */
public class SimpleClass {
    private int value = 100;
    String string = "Hello.";
    protected Double doubleValue = 1.5;
    public int[] array = {1, 2, 3, 4, 5};

    private int getValue() {
        return value;
    }

    String getString() {
        return string;
    }

    protected Double getDoubleValue() {
        return doubleValue;
    }

    public int[] getArray() {
        return array;
    }
}
