package exercises.chapter7.ex16;

/**
 * @author Volodymyr Portianko
 * @date.created 22.03.2016
 */
public class Exercise16 {
    public static void main(String[] args) {
        Amphibian amphibian = new Frog();
        amphibian.swim();
    }
}

class Amphibian {
    void swim() {
        System.out.println("Swimming...");
    }
}

class Frog extends Amphibian {}
