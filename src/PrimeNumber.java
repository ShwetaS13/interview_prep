/**
 * Check if a given number is prime.
 */
public class PrimeNumber {
    public boolean method(int n)  {
        if (n < 2) return false;
        for (int i = 2; i < n/2; i++) {
            if (n%i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String args[]) {
        PrimeNumber primeNumber = new PrimeNumber();
//        System.out.println("args = [" + primeNumber.method(2) + "]");
        int number = -25;
        System.out.printf("The number %d is %s", number, primeNumber.isPrime(number) ? "prime" : "not prime");
    }

    public boolean isPrime(int number) {
        return isPrime(number, number/2);
    }

    /**
     * Recursive method to check is a number is prime
     * @param number
     * @param divisor
     * @return
     */
    private boolean isPrime(int number, int divisor){
        if (number < 2) {
            return false;
        }
        if (divisor == 1) {
            return true;
        } else if (number % divisor == 0) {
            return false;
        }

        return isPrime(number, divisor - 1);
    }
}
