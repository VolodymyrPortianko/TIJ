package exercises.chapter5.ex21;

/**
 * @author Volodymyr Portianko
 * @date.created 11.03.2016
 */
public enum PaperCurrencyTypes {
    ONE, TWO, FIVE, TEN, TWENTY, FIFTY
}

class Exercise21 {
    public static void main(String[] args) {
        for (PaperCurrencyTypes type : PaperCurrencyTypes.values()) {
            System.out.println(type + " ,ordinal: " + type.ordinal());
        }
    }
}
