/**
 * Created by Shweta on 3/11/2017.
 */
public class IntegerReverser {
    public static void main(String args[]) {
        System.out.println("Reversed Integer = "+reverse(123456789));
    }

    private static int reverse(int n) {
        int reversedInteger = 0;
        if (n >= 0 && n < 10) {
            reversedInteger = n;
        } else if (n < 0 && n > -10) {
            reversedInteger = n;
        } else {
            while (n != 0) {
                int digitToBeAdded = n % 10;
                n = n / 10;

                reversedInteger = (reversedInteger * 10) + digitToBeAdded;
            }
        }
        return reversedInteger;
    }
}
