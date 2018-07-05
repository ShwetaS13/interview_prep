/**
 * Write a program to calculate the nth power of an integer.
 */
public class NthPowerOfNumber {
    public static void main(String args[]) {
        System.out.println(calculate(2, 3));
    }

    private static int calculate(int n, int power) {
        if (n == 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }
        if (power == 0) {
            return 1;
        }

        return n * calculate(n, power - 1);
    }
}
