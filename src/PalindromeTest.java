import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

/**
 * Created by Shweta on 2/28/2017.
 */
public class PalindromeTest {
    String[] strings = new String[]{
            "palindrome", "malayalam", "level", "civic", "Kayak", "madam", "abba", "tattarrattat"
    };

    Boolean[] palindromeValue = new Boolean[]{false, true, true, true, true, true, true, true};


    @Test
    public void testIsPalindrome() {
        Palindrome palindrome = new Palindrome();
        for (int i = 0; i < strings.length; i++) {
            boolean actual = palindrome.isPalindrome(strings[i]);
            boolean expected = palindromeValue[i];
            assertThat(expected, is(actual));

        }
    }


}