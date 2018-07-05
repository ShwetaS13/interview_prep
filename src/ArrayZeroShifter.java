/**
 * Given an array of integers, method to arrange array so that all the non-zero integers are at the beginning of the array and all the zero's
 * are towards the end of the array.
 *
 * eg: [1 2 0 5 0 8 7] --> [1 2 5 8 7 0 0]
 */
public class ArrayZeroShifter {
    public static void main(String args[]) {
        int[] array = new int[]{0, 1, 2, 0, 5, 0, 8, 7, 0};
        ArrayZeroShifter arrayZeroShifter = new ArrayZeroShifter();
        int[] result = arrayZeroShifter.shiftZerosToEnd(array);
        for (int i : result) {
            System.out.print(i+ " ");
        }
    }

    public int[] shiftZerosToEnd(int[] array){
        int start = 0;
        int end = array.length - 1;

        for(int i = start; i < end; i++){
            if(array[i] == 0){

                //swap non-zero integer with non-zero integer in the end
                int nonZeroIndexForSwapping = findNonZeroAtEnd(array, end);
                int temp = array[i];
                array[i] = array[nonZeroIndexForSwapping];
                array[nonZeroIndexForSwapping] = temp;
                end = nonZeroIndexForSwapping - 1;
            }
        }

        return array;
    }

    public int findNonZeroAtEnd(int[] array, int end){
        for(int i = end; i >= 0; i--){
            if(array[i] != 0){
                return i;
            }
        }

        return -1;
    }
}
