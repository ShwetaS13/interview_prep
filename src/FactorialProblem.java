/**
 * Calculate the factorial of a given number
 */
public class FactorialProblem {
    public static void main(String args[]) {
        int n = 3;
        System.out.printf("Factorial of %d = %d", n, generate(n));
    }

    private static int generate(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        return n * generate(n-1);
    }
}
