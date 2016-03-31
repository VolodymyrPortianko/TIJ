package exercises.chapter6.ex8;

/**
 * @author Volodymyr Portianko
 * @date.created 14.03.2016
 */
public class ConnectionManager {
    static private int currentConnection = 0;
    static private Connection[] array;

    static {
        int connectionAmount = 10;
        array = new Connection[connectionAmount];
        for (int i = 0; i < connectionAmount; i++) {
            array[i] = new Connection();
        }
    }

    static public Connection getConnection() {
        return currentConnection < array.length ? array[currentConnection++] : null;
    }

    public static void main(String[] args) {
        for (int i = 0; i < 12; i++) {
            System.out.println(ConnectionManager.getConnection());
        }
    }
}

class Connection {
    @Override
    public String toString() {
        return "Connection{}";
    }
}
