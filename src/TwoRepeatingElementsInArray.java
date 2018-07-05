import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashSet;

/**
 * Find the two repeating elements in a given array
 * You are given an array of n+2 elements. All elements of the array are in range 1 to n.
 * And all elements occur once except two numbers which occur twice. Find the two repeating numbers.
 *
 * For example, array = {4, 2, 4, 5, 2, 3, 1} and n = 5
 * The above array has n + 2 = 7 elements with all elements occurring once except 2 and 4 which occur twice. So the output should be 4 2.
 */
public class TwoRepeatingElementsInArray {
    public static void main(String args[]) {
        int[] a = new int[]{4, 2, 4, 5, 2, 3, 1};
        System.out.println("ArrayList is --> " + find(a));
    }

    private static ArrayList<Integer> find(int[] array) {
        HashSet<Integer> set = new HashSet<Integer>();
        ArrayList<Integer> result = new ArrayList<>();

        for (int i = 0; i < array.length; i++) {
            if (!set.contains(array[i])) {
                set.add(array[i]);
            } else {
                result.add(array[i]);
                if (result.size() == 2) {
                    return result;
                }
            }
        }
        return result;
    }
}
