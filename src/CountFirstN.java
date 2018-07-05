/**
 * Summation of first n numbers
 */
public class CountFirstN {
    public static void main(String args[]) {
        int number = 10;
        System.out.printf("Summation of first %d numbers is : %d\n", number, count(number));
    }

    public static int count(int n) {
        if (n == 1) {
            return 1;
        }

        return n + count(n - 1);
    }
}
