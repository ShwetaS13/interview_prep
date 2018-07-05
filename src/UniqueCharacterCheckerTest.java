import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

/**
 * Created by Shweta on 2/28/2017.
 */
public class UniqueCharacterCheckerTest {
    String[] strings = new String[]{"abcd", "ddfg", "palindrome", "malayalam", "level", "civic", "Kayak", "madam", "a", "baa"};
    Boolean[] values = new Boolean[]{true, false, true, false, false, false, false, false, true, false};

    @Test
    public void test_check() {
        UniqueCharacterChecker uniqueCharacterChecker = new UniqueCharacterChecker();

        for (int i = 0; i < strings.length; i++) {
            boolean actual = uniqueCharacterChecker.check(strings[i]);
            boolean expected = values[i];

            assertThat(expected, is(actual));
        }
    }

}