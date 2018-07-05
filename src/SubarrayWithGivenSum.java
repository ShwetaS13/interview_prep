import sun.java2d.ScreenUpdateManager;

/**
 * Given an unsorted array of non-negative integers, find a continuous subarray which adds to a given number.
 * Examples:
 * Input: arr[] = {1, 4, 20, 3, 10, 5}, sum = 33
 * Output: Sum found between indexes 2 and 4
 * Input: arr[] = {1, 4, 0, 0, 3, 10, 5}, sum = 7
 * Output: Sum found between indexes 1 and 4
 * Input: arr[] = {1, 4}, sum = 0
 * Output: No subarray found
 * There may be more than one subarrays with sum as the given sum. The following solutions print first such subarray.
 */
public class SubarrayWithGivenSum {
    public static void main(String args[]) {
//        int[] array = new int[]{1, 4, 20, 3, 10, 5};
//        int sum = 33;
//        int[] result = compute(array, sum);
//        System.out.printf("The subarray with given sum %d is between %d and %d.\n", sum, result[0], result[1]);
//
//        int array1[] = new int[]{1, 4, 0, 0, 3, 10, 5};
//        int sum1 = 7;
//        result = compute(array, sum);
//        System.out.printf("The subarray with given sum %d is between %d and %d.\n", sum1, result[0], result[1]);
//
//        int array2[] = new int[]{33, 4, 0, 0, 3, 10, 5};
//        int sum2 = 7;
//        result = compute(array2, sum2);
//        System.out.printf("The subarray with given sum %d is between %d and %d.\n", sum2, result[0], result[1]);
//
//        int array3[] = new int[]{1, 4};
//        int sum3 = 6;
//        result = compute(array3, sum3);
//        System.out.printf("The subarray with given sum %d is between %d and %d.\n", sum3, result[0], result[1]);

        int[] array = new int[]{1, 4, 20, 3, 10, 5};
        int sum = 33;
        int[] result = computeEfficient(array, sum);
        System.out.printf("The subarray with given sum %d is between %d and %d.\n", sum, result[0], result[1]);

        int array1[] = new int[]{1, 4, 0, 0, 3, 10, 5};
        int sum1 = 7;
        result = computeEfficient(array, sum);
        System.out.printf("The subarray with given sum %d is between %d and %d.\n", sum1, result[0], result[1]);

        int array2[] = new int[]{33, 4, 0, 0, 3, 10, 5};
        int sum2 = 7;
        result = computeEfficient(array2, sum2);
        System.out.printf("The subarray with given sum %d is between %d and %d.\n", sum2, result[0], result[1]);

        int array3[] = new int[]{1, 4};
        int sum3 = 6;
        result = computeEfficient(array3, sum3);
        System.out.printf("The subarray with given sum %d is between %d and %d.\n", sum3, result[0], result[1]);
    }

    /**
     * The following method solves the problem with time complexity O(n^2)
     * @param array
     * @param sum
     * @return
     */
    private static int[] compute(int[] array, int sum) {
        int[] result = new int[]{Integer.MIN_VALUE, Integer.MIN_VALUE};

        for(int i = 0; i < array.length; i++) {
            int resultantSum = array[i];
            if (resultantSum == sum) {
                result[0] = result[1] = i;
                break;
            }
            for(int j = i + 1; j < array.length; j++) {
                resultantSum += array[j];
                if (resultantSum == sum) {
                    result[0] = i;
                    result[1] = j;
                    return result;
                } else if (resultantSum > sum) {
                    break;
                }
            }
        }

        return result;
    }

    private static int[] computeEfficient(int[] array, int sum) {
        int[] result = new int[]{Integer.MIN_VALUE, Integer.MIN_VALUE};
        int startIndex = 0;
        int resultantSum = 0;
        int next = startIndex;

        while (startIndex < array.length && next < array.length) {
            resultantSum += array[next];

            if (resultantSum > sum) {
                resultantSum = 0;
                startIndex += 1;
                next = startIndex;
            } else if (resultantSum < sum) {
                next += 1;
            } else if (resultantSum == sum) {
                result[0] = startIndex;
                result[1] = next;
                break;
            }
        }

        return result;
    }
}
