import java.util.ArrayList;
import java.util.HashSet;

/**
 * You are given an array of positive and negative integers. If a number n at an index is positive, then move forward n steps. Conversely, if it's negative (-n), move backward n steps. Assume the first element of the array is forward next to the last element, and the last element is backward next to the first element. Determine if there is a loop in this array. A loop starts and ends at a particular index with more than 1 element along the loop. The loop must be "forward" or "backward'.
 * Example 1: Given the array [2, -1, 1, 2, 2], there is a loop, from index 0 -> 2 -> 3 -> 0.
 * Example 2: Given the array [-1, 2], there is no loop.
 * Note: The given array is guaranteed to contain no element "0".
 * Can you do it in O(n) time complexity and O(1) space complexity?
 */
public class CircularArrayLoop {
    public static void main(String args[]) {
        int[] array = new int[]{-2, 1, -1, -2, -2};
        System.out.println(circularArrayLoop(array));
    }
    public static boolean circularArrayLoop(int[] nums) {
        if (nums.length == 0) {
            return false;
        }
        int firstElement = 0;
        HashSet<Integer> set = new HashSet<Integer>();
        set.add(0);

        while (!set.contains(firstElement)) {
            if (nums[firstElement] > 0) {
                int nextStep = firstElement + nums[firstElement];
                int nextElement = nextStep >= nums.length ? nextStep - nums.length : nextStep;
                firstElement = nextElement;
                if (!set.contains(firstElement)) {
                    set.add(firstElement);
                } else {
                    return true;
                }
            } else if (nums[firstElement] < 0) {
                int nextStep = firstElement - nums[firstElement];
                int nextElement = nextStep >= 0 ? nextStep : nextStep + nums.length;
                firstElement = nextElement;
                if (!set.contains(firstElement)) {
                    set.add(firstElement);
                } else {
                    return true;
                }
            }

        }

        return true;
    }
}
