import java.util.HashMap;

/**
 * Given two Strings write a method to decide if one is a permutation of the other.
 */
public class StringPermutationChecker {

        public boolean check(String a, String b) {
        if (a.length() != b.length()) {
            return false;
        } else {
            HashMap<Character, Integer> map = new HashMap<>();
            populateMap(a, map);
            return compareWithMap(b, map);
        }
    }

    private void populateMap(String a, HashMap<Character, Integer> map) {

        for (int i = 0; i < a.length(); i++) {
            if (map.get(a.charAt(i)) != null) {
                map.put(a.charAt(i), map.get(a.charAt(i)) + 1);
            } else {
                map.put(a.charAt(i), 1);
            }
        }
    }

    private boolean compareWithMap(String b,  HashMap<Character, Integer> map) {
        for (int i = 0; i < b.length(); i++) {
            Character currentCharacter = b.charAt(i);
            if (map.get(currentCharacter) == null) {
                return false;
            } else if (map.get(currentCharacter) > 0) {
                map.put(currentCharacter, map.get(currentCharacter) - 1);
            } else {
                return false;
            }
        }

        return true;
    }

}
