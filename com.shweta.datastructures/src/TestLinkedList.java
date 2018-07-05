import java.util.LinkedList;

/**
 * Created by Shweta on 3/9/2017.
 */
public class TestLinkedList {
    public static void main(String args[]) {
        SinglyLinkedList singlyLinkedList = new SinglyLinkedList();
        singlyLinkedList.insertFirst(1);
//        singlyLinkedList.insertAfter(2, 1);
//        singlyLinkedList.insertAfter(3, 2);
//        singlyLinkedList.insertAfter(4, 3);
//        singlyLinkedList.insertAfter(10, 4);
//        singlyLinkedList.insertAfter(1, 10);
//        singlyLinkedList.insertBefore(1, 10);
//        singlyLinkedList.insertBefore(1, 3);
//        singlyLinkedList.insertBefore(1, 4);
//        singlyLinkedList.insertBefore(2, 10);
//        singlyLinkedList.insertAfter(3, 10);
        singlyLinkedList.traverse();
        System.out.println(singlyLinkedList.hasCycle());

//        singlyLinkedList.traverse();
//
//        singlyLinkedList.deleteMiddleNode(2);
//        singlyLinkedList.traverse();
//        SinglyLinkedList ll1 = new SinglyLinkedList();
//        ll1.insertFirst(7);
//        ll1.insertAfter(1, 7);
//        ll1.insertAfter(6, 1);
//        ll1.insertAfter(5, 6);
//        ll1.traverse();
//
//        SinglyLinkedList ll2 = new SinglyLinkedList();
//        ll2.insertFirst(5);
//        ll2.insertAfter(9, 5);
//        ll2.insertAfter(2, 9);
//        ll2.insertAfter(8, 2);
//        ll2.traverse();

//        SinglyLinkedList singlyLinkedList1 = new SinglyLinkedList();
//        LinkedList<Integer> ll = singlyLinkedList1.sumLists(ll1, ll2);
//        System.out.println(ll);

//        System.out.println(singlyLinkedList.returnKToTheLast(3));
//        singlyLinkedList.removeDuplicatesWithoutTemporaryBuffer();
//        singlyLinkedList.removeDuplicates();
//        SinglyLinkedList myLL = new SinglyLinkedList();
//        myLL.removeDuplicatesWithoutTemporaryBuffer();

    }

}
