import java.util.HashSet;

/**
 * Given an array of integers, every element appears twice except for one. Find that single one.
 * Note: Your algorithm should have a linear runtime complexity. Could you implement it without using extra memory?
 */
public class NonRepeatedNumberFinder {
    public static void main(String args[]) {
        int[] array = new int[]{1, 1, 2, 2, 3, 3, 4};
        int[] array2 = new int[]{1,1,2,3,3,4,4,8,8};
//        System.out.println(find(array));
        System.out.println(singleNonDuplicate(array2));
    }

    public static int find(int[] array) {
        HashSet<Integer> set = new HashSet<>();

        for (int i = 0; i < array.length; i++) {
            if (set.contains(array[i])) {
                set.remove(array[i]);
            } else {
                set.add(array[i]);
            }
        }

        for (Integer i : set) {
            return i;
        }
        return -1;
    }

    public static int singleNonDuplicate(int[] nums) {
        if(nums.length %2 == 0){
            return -1;
        }else{
            int nonRepeatedNumber = -1;
            for(int i = 0, j = i + 1; j < nums.length; i+=2, j+=2){
                if (nums[i] != nums[j]) {
                    nonRepeatedNumber = nums[i];
                    return nonRepeatedNumber;
                }
            }
            if (nonRepeatedNumber == -1) {
                return nums[nums.length - 1];
            }
        }

        return -1;
    }
}
