import java.util.HashMap;
import java.util.Timer;

/**
 * Generate fibonacci series for n sequence of integers
 */
public class FibonacciSeries {
    private HashMap<Integer, Integer> map = new HashMap<>();
    public static void main(String args[]) {
        int numberOfIntegers = 6;

        FibonacciSeries fibonacciSeries = new FibonacciSeries();
        System.out.println("Fibonacci Series without Memoization for " + numberOfIntegers + " = " + fibonacciSeries.fibo(numberOfIntegers));
        System.out.println("Fibonacci Series using Memoization for " + numberOfIntegers + " = " + fibonacciSeries.fibonacciUsingMemoization(numberOfIntegers));
        System.out.println();
    }

    private int fibo(int i) {
        if (i == 0) {
            return 0;
        }

        if (i == 1) {
            return 1;
        }

        return fibo(i - 1) + fibo(i - 2);
    }

    private int fibonacciUsingMemoization(int n){
        if(n == 0 || n == 1) return n;

        if(!map.containsKey(n)){
            map.put(n, fibonacciUsingMemoization(n-1) + fibonacciUsingMemoization(n-2));
        }

        return map.get(n);
    }
}
