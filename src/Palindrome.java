/**
 * Program to determine if a string
 */
public class Palindrome {

    public boolean isPalindrome(String s) {
        for (int i = 0, j = s.length() - 1; i <= j; i++, j--) {
            if (Character.toLowerCase(s.charAt(i)) != Character.toLowerCase(s.charAt(j))) {
                return false;
            }
        }
        return true;
    }
}
