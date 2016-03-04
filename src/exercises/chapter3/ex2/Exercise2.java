package exercises.chapter3.ex2;

import static net.mindview.util.Print.print;

/**
 * @author Volodymyr Portianko
 * @date.created 02.03.2016
 */
public class Exercise2 {
    float f;

    public static void main(String[] args) {
        Exercise2 float1 = new Exercise2();
        float1.f = 1.5f;
        Exercise2 float2 = new Exercise2();
        float2.f = 1.8f;
        print("float1 = " + float1.f + "; float2 = " + float2.f);
        float2 = float1;
        print("float1 = " + float1.f + "; float2 = " + float2.f);
        float1.f = 1.0f;
        print("float1 = " + float1.f + "; float2 = " + float2.f);
        float2.f = 2.3f;
        print("float1 = " + float1.f + "; float2 = " + float2.f);
    }
}
