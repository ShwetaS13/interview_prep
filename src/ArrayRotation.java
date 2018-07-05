/**
 * Write a function rotate(ar[], d, n) that rotates arr[] of size n by d elements.
 * Example : array = [1,2,3,4,5,6,7]
 * Rotation of the above array by d=2 will make array
 *           array = [3,4,5,6,7,1,2]
 */
public class ArrayRotation {
    public static void main(String args[]) {
        int[] array = new int[]{1,2,3,4,5,6,7};
        int[] result = rotate(array, 2, 7);
        for(int i = 0; i < 7; i++) {
            System.out.printf("%d ", result[i]);
        }
        System.out.println();
    }

    private static int[] rotate(int[] array, int d, int n) {
        int[] result = new int[n];

        for (int i = d, j = 0; i < n; i++, j++) {
            result[j] = array[i];
        }

        for (int i = 0, j = n - d; i < d; i++, j++) {
            result[j] = array[i];
        }

        return result;
    }
}
