/**
 * Given a sorted (increasing order) array with unique elements, write an algorithm to create a binary search tree with minimal height.
 */

class TreeNode{
    int value;
    TreeNode left;
    TreeNode right;

    public TreeNode(int n){
        this.value = n;
        this.left = null;
        this.right = null;
    }
}

public class MinimalBST {

    public static void main(String args[]) {
        MinimalBST m = new MinimalBST();
        int[] array = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9};
        TreeNode n = m.createMinimalBST(array);
        System.out.println(n.value);
        System.out.println(n.left.value);
        System.out.println(n.right.value);
    }

    public TreeNode createMinimalBST(int[] array) {
        if (array == null || array.length <= 0) {
            return null;
        }

        return createMinimalBST(array, 0, array.length - 1);
    }

    public TreeNode createMinimalBST(int[] array, int start, int end) {
        if (end < start) {
            return null;
        }

        int mid = (start + end) / 2;
        TreeNode n = new TreeNode(array[mid]);
        n.left = createMinimalBST(array, start,mid - 1);
        n.right = createMinimalBST(array, mid + 1, end);

        return n;
    }

}
