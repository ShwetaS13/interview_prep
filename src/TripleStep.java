import java.util.Arrays;

/**
 * Created by Shweta on 8/22/2017.
 *
 * Cracking the coding interview - Chapter 8 - Recursion and Dynamic Programming
 *
 * A child is running up a staircase with n steps and can hop either 1 step, 2 steps or 3 steps at a time.
 * Implement a method to count how many possible ways the child can run up the stairs.
 */
public class TripleStep {

    public static void main(String args[]) {
        TripleStep ts = new TripleStep();
        int numberOfSteps = 5;
        int result = ts.countSteps(numberOfSteps);
        System.out.printf("For %d steps --> %d ways\n", numberOfSteps, result);
    }

    public int countSteps(int n){
        int[] memo = new int[n + 1];
        Arrays.fill(memo, -1);
        return countSteps(n, memo);
    }

    private int countSteps(int n, int[] memo) {
        if (n == 0) {
            return 1;
        } else if (n < 0) {
            return 0;
        }

        if(memo[n] == -1){
            memo[n] = countSteps(n - 1, memo) + countSteps(n - 2, memo) + countSteps(n - 3, memo);
        }

        return memo[n];
    }
}
