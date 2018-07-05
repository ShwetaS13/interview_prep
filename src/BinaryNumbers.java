import java.util.Scanner;

/**
 * Given a base- integer, n, convert it to binary (base-2). Then find and print the base-10 integer denoting
 * the maximum number of consecutive 1's in n's binary representation.
 *
 * Input Format
 * A single integer, n.
 *
 * Output Format
 * Print a single base-10 integer denoting the maximum number of consecutive 's in the binary representation of .
 *
 * Sample Input 1
 * 5
 * Sample Output 1
 * 1
 * Sample Input 2
 * 13
 * Sample Output 2
 * 2
 * Explanation
 *
 * Sample Case 1:
 * The binary representation of 5 is 101, so the maximum number of consecutive 1's is 1.
 *
 * Sample Case 2:
 * The binary representation of 13 is 1101, so the maximum number of consecutive 1's is 2.
 */
public class BinaryNumbers {
    private String getBinaryForm(int number) {
        return Integer.toBinaryString(number);
    }

    private int getConsecutiveOnes(String number) {
        int maxCount = 0;
        int count = 0;
        for (int i = 0; i < number.length(); i++) {
            if (number.charAt(i) == '0') {
                count = 0;
            } else {
                ++count;
            }

            //keep updating maxCount
            if (count > maxCount) {
                maxCount = count;
            }
        }

        return maxCount;
    }

    public int getBinary(int number) {
        return getConsecutiveOnes(getBinaryForm(number));
    }

    public static void main(String args[]) {
//        Scanner scanner = new Scanner(System.in);
//        while (scanner.hasNextInt()) {
//            int number = scanner.nextInt();
            BinaryNumbers binaryNumbers = new BinaryNumbers();
            System.out.println(binaryNumbers.getBinary(13));
//        }

    }
}
