package exercises.chapter6.ex5;

import java.util.Arrays;

/**
 * @author Volodymyr Portianko
 * @date.created 14.03.2016
 */
public class Exercise5 {
    public static void main(String[] args) {
        SimpleClass simpleClass = new SimpleClass();
//        System.out.println(simpleClass.value);
        System.out.println(simpleClass.string);
        System.out.println(simpleClass.doubleValue);
        System.out.println(Arrays.toString(simpleClass.array));
//        System.out.println(simpleClass.getValue());
        System.out.println(simpleClass.getString());
        System.out.println(simpleClass.getDoubleValue());
        System.out.println(Arrays.toString(simpleClass.getArray()));
    }
}
