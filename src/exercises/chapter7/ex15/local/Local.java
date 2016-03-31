package exercises.chapter7.ex15.local;

import exercises.chapter7.ex15.Exercise15;

/**
 * @author Volodymyr Portianko
 * @date.created 15.03.2016
 */
public class Local extends Exercise15 {

    public void callProtectedMethod() {
        System.out.println(protectedString());
    }

    public static void main(String[] args) {
        new Local().callProtectedMethod();
    }
}
