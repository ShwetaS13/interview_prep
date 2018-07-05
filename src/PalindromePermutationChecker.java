import java.util.HashMap;
import java.util.Map;

/**
 * Palindrome Permutation : Given a string write a function to check if it is a permutation of a palindrome.
 * A palindrome is a word or phrase that is the same backwards and forwards.
 * A permutation is a rearrangement of letters. The palindrome does not need to be limited to just dictionary words.
 */
public class PalindromePermutationChecker {

    /**
     * SOLUTION 1:
     * populate the frequency of each character in a hashmap
     * if string is of even-length, then all the values of the entries in the map should be even numbers
     * if string is of odd-length, then only one value out of all entries in the map should be an odd number
     * @param inputString
     * @return
     */
    public boolean check(String inputString) {
        int inputStringLength = inputString.length();
        HashMap<Character, Integer> map = new HashMap<>();
        populateMap(inputString, map);
        if (inputStringLength % 2 == 0) {           //even length string
            for (Map.Entry<Character, Integer> entry : map.entrySet()) {
                if (entry.getValue() % 2 == 1) {
                    return false;
                }
            }
        }else if(inputStringLength % 2 == 1){       //odd length string
            int count = 0;
            for (Map.Entry<Character, Integer> entry : map.entrySet()) {
                if (entry.getValue() % 2 == 1) {
                    count = count + 1;
                }
            }
            return count == 1;
        }

        return true;
    }

    private void populateMap(String inputString, HashMap<Character, Integer> map) {
        for (int i = 0; i < inputString.length(); i++) {
            if (map.get(inputString.charAt(i)) == null) {
                map.put(inputString.charAt(i), 1);
            } else {
                map.put(inputString.charAt(i), map.get(inputString.charAt(i)) + 1);
            }
        }
    }

    /**
     * SOLUTION 2:
     * populate the frequency of each character in a hashmap
     * have a counter variable that keeps count of how many odd values are present in the map
     */

    public boolean check2(String input) {
        int inputLength = input.length();

        int countOfOddValues = 0;
        HashMap<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < inputLength; i++) {
            if (map.get(input.charAt(i)) == null) {
                map.put(input.charAt(i), 1);
                countOfOddValues++;
            } else {
                map.put(input.charAt(i), map.get(input.charAt(i)) + 1);
                if (map.get(input.charAt(i)) % 2 == 0) {
                    countOfOddValues--;
                } else {
                    countOfOddValues++;
                }
            }
        }
        return countOfOddValues <= 1;
    }
}
