package exercises.chapter7.ex17;

import static net.mindview.util.Print.print;

/**
 * @author Volodymyr Portianko
 * @date.created 22.03.2016
 */
public class Exercise17 {
    public static void main(String[] args) {
        Amphibian amphibian = new Frog();
        amphibian.moveInWater();
        amphibian.moveOnLand();
    }
}

class Amphibian {
    void moveInWater() {
        print("Amphibian in water");
    }

    void moveOnLand() {
        print("Amphibian on land");
    }
}

class Frog extends Amphibian {
    @Override
    void moveInWater() {
        print("Frog in water");
    }

    @Override
    void moveOnLand() {
        print("Frog on land");
    }
}