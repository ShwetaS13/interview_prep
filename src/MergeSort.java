/**
 * Created by Shweta on 8/6/2017.
 */
public class MergeSort {
    public static void main(String args[]) {
        int[] array = new int[]{38, 27, 43, 3, 9, 82, 10};

        MergeSort ms = new MergeSort();

        int[] result = ms.mergeSort(array);
    }

    public int[] mergeSort(int[] array) {
        int start = 0;
        int end = array.length - 1;
        int mid = (start + end) / 2;
        mergeSort(array, start, mid);
        mergeSort(array, mid + 1, end);
        return null;
    }

    private int[] mergeSort(int[] array, int start, int end) {

        return array;
    }
}
