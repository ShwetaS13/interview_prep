import java.sql.Time;
import java.time.LocalTime;

/**
 * Check if a large number is divisible by four
 */
public class LargeNumberDivisibleByFour {
    public static void main(String args[]) {
        long startTime = System.nanoTime();
        int number = 12345678;
        System.out.printf("Is %d divisible by 4 ? %b\n", number, check(number));
        long stopTime = System.nanoTime();
        System.out.println(stopTime - startTime);
    }

    private static boolean check(int number) {
        return (number % 100) % 4 == 0;
    }
}
