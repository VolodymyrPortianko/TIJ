package exercises.chapter7.ex1;

/**
 * @author Volodymyr Portianko
 * @date.created 14.03.2016
 */
public class Exercise1 {
    private AnotherClass anotherClass;

    public AnotherClass getAnotherClass() {
        if (anotherClass == null) anotherClass = new AnotherClass();
        return anotherClass;
    }
}

class AnotherClass {

}
