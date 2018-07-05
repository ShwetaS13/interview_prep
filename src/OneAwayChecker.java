import java.util.HashMap;

/**
 * Created by Shweta on 3/5/2017.
 */
public class OneAwayChecker {

    public boolean check(String string1, String string2) {

        int string1Length = string1.length();
        int string2Length = string2.length();

        if (string1Length > string2Length && string1Length - string2Length > 1) {
            return false;
        } else if (string2Length > string1Length && string2Length - string1Length > 1) {
            return false;
        } else {
            HashMap<Character, Integer> map = new HashMap<>();
            int countOfOdd = 0;
            for (int i = 0; i < string1Length; i++) {
                if (map.get(string1.charAt(i)) == null) {
                    map.put(string1.charAt(i), 1);
                    countOfOdd++;
                } else {
                    map.put(string1.charAt(i), map.get(string1.charAt(i)) + 1);
                    if (map.get(string1.charAt(i)) % 2 == 0) {
                        countOfOdd--;
                    } else {
                        countOfOdd++;
                    }
                }
            }

            for (int i = 0; i < string2Length; i++) {
                if (map.get(string2.charAt(i)) == null) {
                    map.put(string2.charAt(i), 1);
                    countOfOdd++;
                } else {
                    map.put(string2.charAt(i), map.get(string2.charAt(i)) + 1);
                    if (map.get(string2.charAt(i)) % 2 == 0) {
                        countOfOdd--;
                    } else {
                        countOfOdd++;
                    }
                }
            }

            return countOfOdd <= 2;
        }

    }

}
