package exercises.chapter5.ex22;

import exercises.chapter5.ex21.PaperCurrencyTypes;

/**
 * @author Volodymyr Portianko
 * @date.created 11.03.2016
 */
public class Exercise22 {

    static String printDescription(PaperCurrencyTypes type) {
        switch (type) {
            case ONE: return "One paper";
            case TWO: return "Two paper";
            case FIVE: return "Five paper";
            case TEN: return "Ten paper";
            case TWENTY: return "Twenty paper";
            case FIFTY: return "Fifty paper";
            default: return "Nothing";
        }
    }

    public static void main(String[] args) {
        for (PaperCurrencyTypes type : PaperCurrencyTypes.values()) {
            System.out.println(printDescription(type));
        }
    }
}
