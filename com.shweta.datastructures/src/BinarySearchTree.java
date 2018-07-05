/**
 * Created by Shweta on 3/10/2017.
 */
public class BinarySearchTree {
    BinarySearchTreeNode root;

    public BinarySearchTree() {
        root = null;
    }

    public boolean isEmpty() {
        return root == null;
    }

    public void insert(int x) {
        insert(root, x);
    }

    private BinarySearchTreeNode insert(BinarySearchTreeNode node, int x) {
        if (node == null) {
            node = new BinarySearchTreeNode(x);
        } else {
            if (x <= node.data) {
                node.left = insert(node.left, x);
            } else if (x > node.data) {
                node.right = insert(node.right, x);
            }
        }

        return node;
    }

    public boolean search(int x) {
        return search(root, x);
    }

    private boolean search(BinarySearchTreeNode node, int x) {
        return true;
    }

    public void delete(int x) {
        delete(root, x);
    }

    private BinarySearchTreeNode delete(BinarySearchTreeNode node, int x) {
        if (node.data == x) {
            //delete this node
        } else if (x <= node.data) {
            node = delete(node.left, x);
        } else if (x > node.data) {
            node = delete(node.right, x);
        }

        return node;
    }
}
