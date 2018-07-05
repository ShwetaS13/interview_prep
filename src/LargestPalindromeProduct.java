/**
 * Find the largest palindrome made from the product of two n-digit numbers.
 * Since the result could be very large, you should return the largest palindrome mod 1337.
 * Example:
 * Input: 2
 * Output: 987
 * Explanation: 99 x 91 = 9009, 9009 % 1337 = 987
 * <p>
 * Note:
 * The range of n is [1,8].
 */
public class LargestPalindromeProduct {
    public int largestPalindrome(int n) {


        return 0;
    }

    private int largestPalindrome(int first, int second){


        return 0;
    }

    private boolean isPalindrome(int n){
        String number = String.valueOf(n);
        int start = 0;
        int end = number.length();

        while (start <= end) {
            if (number.charAt(start) != number.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }

    private int findMod(int n) {
        return n % 1337;
    }
}
