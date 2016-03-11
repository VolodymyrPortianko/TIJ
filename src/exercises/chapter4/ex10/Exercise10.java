package exercises.chapter4.ex10;

import static net.mindview.util.Print.print;

/**
 * @author Volodymyr Portianko
 * @date.created 11.03.2016
 */
public class Exercise10 {
    public static void main(String[] args) {
        outer:
        for (int i = 1000; i < 10000; i++) {
            String number = Integer.toString(i);
            for (int j = 0; j < 4; j++) {
                char charOne = number.charAt(j);
                String threeDigitNumber = new StringBuilder(number).deleteCharAt(j).toString();
                for (int k = 0; k < 3; k++) {
                    char charTwo = threeDigitNumber.charAt(k);
                    int firstMultipliter = Integer.valueOf(new StringBuilder().append(charOne).append(charTwo).toString());
                    String twoDigitNumber = new StringBuilder(threeDigitNumber).deleteCharAt(k).toString();
                    for (int l = 0; l < 2; l++) {
                        char charThree = twoDigitNumber.charAt(l);
                        String lastDigit = new StringBuilder(twoDigitNumber).deleteCharAt(l).toString();
                        int secondMultipliter = Integer.valueOf(new StringBuilder().append(charThree).append(lastDigit).toString());
                        if (firstMultipliter * secondMultipliter == i) {
                            print(i);
                            continue outer;
                        }
                    }
                }
            }
        }
    }
}
