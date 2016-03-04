package exercises.chapter3.ex6;

import static net.mindview.util.Print.print;

/**
 * @author Volodymyr Portianko
 * @date.created 02.03.2016
 */
public class Exercise6 {
    public static void main(String[] args) {
        Dog dog1 = new Dog("spot", "Ruff!");
        Dog dog2 = new Dog("scruffy", "Wurf!");
        Dog dog3 = dog1;
        print("Comparing dog1 and dog2 objects...");
        compare(dog1, dog2);
        print("\nComparing dog1 and dog3 objects...");
        compare(dog1, dog3);
        print("\nComparing dog2 and dog3 objects...");
        compare(dog2, dog3);
    }

    static void compare(Dog dog1, Dog  dog2) {
        print("== on top references: " + (dog1 == dog2));
        print("equals() on top references: " + dog1.equals(dog2));
        print("== on names: " + (dog1.name == dog2.name));
        print("equals() on names: " + dog1.name.equals(dog2.name));
        print("== on says: " + (dog1.says == dog2.says));
        print("equals() on says: " + dog1.says.equals(dog2.says));
    }
}

class Dog {
    String name;
    String says;

    public Dog(String name, String says) {
        this.name = name;
        this.says = says;
    }

    @Override
    public String toString() {
        return name + " says " + says;
    }
}
