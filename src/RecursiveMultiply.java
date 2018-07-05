/**
 * Write a function to multiply two positive numbers without using the * operator.
 * You can use addition, subtraction and bit shifting, but you should minimize the number of those operations.
 */
public class RecursiveMultiply {
    public int multiply(int number1, int number2) {
        if (number1 < 0 || number2 < 0) {
            return -1;
        }

        if (number1 < number2) {
            int temp = number1;
            number1 = number2;
            number2 = temp;
        }

        if (number2 == 0) {
            return 0;
        }
        return number1 + multiply(number1, number2 - 1);
    }

    public static void main(String args[]) {
        RecursiveMultiply recursiveMultiply = new RecursiveMultiply();
        int result = recursiveMultiply.multiply(210, 110);
        System.out.println(result);
    }

}
