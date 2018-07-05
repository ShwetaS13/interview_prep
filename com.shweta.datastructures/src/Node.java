/**
 * Created by Shweta on 3/7/2017.
 */
public class Node {
    public int data;
    public Node next;

    public Node(int x) {
        data = x;
        next = null;
    }

    public void setData(int x) {
        this.data = x;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    public int getData() {
        return this.data;
    }

    public Node getNext() {
        return this.next;
    }
}
