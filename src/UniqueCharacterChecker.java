/**
 * Implement an algorithm to determine if a string has all unique characters.
 * What if you cannot use additional data structures?
 */
public class UniqueCharacterChecker{
    public static void main(String args[]) {


    }

    public boolean check(String s) {
        for (int i = 0; i < s.length(); i++) {
            for (int j = i + 1; j < s.length(); j++) {
                if (s.charAt(i) == s.charAt(j)) {
                    return false;
                }
            }
        }

        return true;
    }
}
