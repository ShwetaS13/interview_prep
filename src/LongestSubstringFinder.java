import java.util.HashSet;
import java.util.Set;

/**
 * Created by Shweta on 3/16/2017.
 */
public class LongestSubstringFinder {

    public static void main(String args[]){
        System.out.println(lengthOfLongestSubstring("abcdef"));
    }

    public static int lengthOfLongestSubstring(String s) {
        if (s.length() == 1) {
            return 1;
        } else if (s.length() == 0) {
            return 0;
        }
        int substringLength = 0;
        HashSet<Character> set = new HashSet<>();

        for(int i = 0; i < s.length(); i++){
            char substringStart = s.charAt(i);
            set.add(substringStart);
            for(int j = i + 1; j < s.length(); j++){
                char subString = s.charAt(j);
                if (!set.contains(subString)) {
                    set.add(subString);
                    substringLength = j - i + 1> substringLength ? j - i + 1: substringLength;
                } else {
                    substringLength = j - i > substringLength ? j - i : substringLength;
                    set.clear();
                    break;
                }
            }
        }


        return substringLength;
    }
}
