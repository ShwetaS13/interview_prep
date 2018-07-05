/**
 * Based on a traditional English children's game
 * Print the numbers 1..100
 * For multiples of 3, print "Fizz" instead of the number
 * For multiples of 5, print "Buzz" instead of the number
 * For multiples of 3 and 5, print "FizzBuzz" instead of the number
 * Here: fill an array instead of printing + some other complications
 */
public class FizzBuzzProblem {
    public static void main(String args[]) {
        print();
    }

    private static void print() {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0) {
                stringBuilder.append("Fizz");
            }
            if (i % 5 == 0) {
                stringBuilder.append("Buzz");
            }
            if (!(stringBuilder.length() > 0) ) {
                stringBuilder.append(i);
            }
            System.out.printf("%d %s\n", i, stringBuilder.toString());
            stringBuilder.delete(0, stringBuilder.length());
        }
    }
}