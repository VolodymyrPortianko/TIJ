package exercises.chapter7.ex6;

import static net.mindview.util.Print.print;

/**
 * @author Volodymyr Portianko
 * @date.created 14.03.2016
 */
public class Chess extends BoardGame {
    public Chess() {
        super(11);
        print("Chess constructor");
    }

    public static void main(String[] args) {
        Chess chess = new Chess();
    }
}

class Game {
    public Game(int i) {
        print("Game constructor");
    }
}

class BoardGame extends Game {
    public BoardGame(int i) {
        super(i);
        print("BoardGame constructor");
    }
}
