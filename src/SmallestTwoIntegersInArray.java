/**
 * Find the smallest two numbers in an array
 */
public class SmallestTwoIntegersInArray {
    public static void main(String args[]) {
        int[] array = new int[]{10, 2, 4, 8, 1, 3};
        SmallestTwoIntegersInArray smallestTwoIntegersInArray = new SmallestTwoIntegersInArray();
        int[] result = smallestTwoIntegersInArray.find(array);

        System.out.printf("Smallest element is %d \nSecond to smallest element is %d", result[0], result[1]);

    }

    private int[] find(int[] array) {
        if (array.length == 0) {
            return null;
        }

        int[] result = new int[2];
        int smallestElement = array[0];
        int secondToSmallestElement = -1;

        for(int i = 1; i < array.length; i++) {
            if (array[i] < smallestElement) {
                secondToSmallestElement = smallestElement;
                smallestElement = array[i];
            } else if (array[i] < secondToSmallestElement) {
                secondToSmallestElement = array[i];
            }
        }

        result[0] = smallestElement;
        result[1] = secondToSmallestElement;
        return result;
    }
}
