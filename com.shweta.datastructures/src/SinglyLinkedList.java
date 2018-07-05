import java.util.HashMap;
import java.util.LinkedList;

/**
 * Created by Shweta on 3/7/2017.
 */
public class SinglyLinkedList {
    private Node first;

    public SinglyLinkedList() {
        first = null;
    }

    /**
     * This funtion will insert the very first node in the linked list.
     */
    public void insertFirst(int x) {
        Node ptr = new Node(x);

        if (ptr == null) {
            System.out.println("Memory overflow, unable to create.");
            return;
        }
        first = ptr;
    }

    /**
     * This function will insert a new node with value 'x' after a node with value 'k' in an already existing linked list.
     */
    public void insertAfter(int x, int k) {
        Node ptr = new Node(x);
        if (ptr == null) {
            System.out.println("Memory overflow, unable to create.");
        }

        Node p = first;
        while (p != null) {
            if (p.data == k) {
                break;
            }
            p = p.next;
        }

        if (p == null) {
            System.out.println("Required node not found.");
        } else {
            //actual insertion
            ptr.next = p.next;
            p.next = ptr;
        }
    }

    /**
     * This function will insert a new node with value 'x' before a node with value 'k' in an already existing linked list.
     */
    public void insertBefore(int x, int k) {
        Node ptr = new Node(x);
        if (ptr == null) {
            System.out.println("Memory overflow, unable to create");
            return;
        }

        Node p = first, follow = null;
        while (p != null) {
            if (p.data == k) {
                break;
            }
            follow = p;
            p = p.next;
        }

        if (p == null) {
            System.out.println("Required node not found.");
        } else {
            //actual insertion
            if (p == first) {
                ptr.next = first;
                first = ptr;
            } else {
                follow.next = ptr;
                ptr.next = p;
            }
        }
    }

    /**
     * This function will delete a node with value 'k' from the SinglyLinkedList if it exists
     */
    public void deleteNode(int k) {
        Node p = first, follow = null;
        while (p != null) {
            if (p.data == k) {
                break;
            }
            follow = p;
            p = p.next;
        }

        if (p == null) {
            System.out.println("Required node not found.");
        } else {
            if (p == first) {
                first = first.next;
            } else {
                follow.next = p.next;
            }
        }
    }

    /**
     * This function will search for a node with value 'k'  from the SinglyLinkedList if it exists
     */
    public boolean search(int k) {
        Node p = first;
        while (p != null) {
            if (p.data == k) {
                break;
            }
            p = p.next;
        }

        if (p == null) {
            System.out.println("REQUIRED NODE NOT FOUND.");
            return false;
        } else {
            System.out.println("Required Node found at address " + p);
            return true;
        }
    }

    /**
     * This function will reverse a given linked list without using additional memory allocation
     */
    public void reverse() {
        Node p, follow, ahead;
        p = first;
        follow = ahead = null;

        while (p != null) {
            ahead = p.next;
            p.next = follow;
            follow = p;
            p = ahead;
        }

        first = follow;
    }

    /**
     * This function will count the number of nodes in the SinglyLinkedList
     */
    public int count() {
        Node p = first;
        int count = 0;
        while (p != null) {
            count++;
            p = p.next;
        }
        return count;
    }

    /**
     * This function determines if the SinglyLinkedList is empty
     *
     * @return true if it is empty, false otherwise
     */
    public boolean isEmpty() {
        return first == null;
    }

    /**
     * This function will go through all the nodes of the SinglyLinkedList exactly once and will display the data value of each node
     */
    public void traverse() {
        StringBuilder stringBuilder = new StringBuilder();
        if (first == null) {
            stringBuilder.append("SinglyLinkedList is empty!");
        } else {
            Node p = first;
            stringBuilder.append("[");
            while (p != null) {
                stringBuilder.append(String.format(" %d,", p.data));
                p = p.next;
            }
            stringBuilder.deleteCharAt(stringBuilder.length() - 1);
            stringBuilder.append("]");
        }
        System.out.println(stringBuilder.toString());
    }


    /**
     * Write code to remove duplicates from an unsorted linked list.
     * How would you solve this problem if a temporary buffer is not allowed? is allowed?
     */
    public void removeDuplicatesWithoutTemporaryBuffer() {
        if (first == null) {
            System.out.println("Empty Linked List.");
            return;
        }

        Node p = first;
        Node comparingNode = p.next;
        Node follow = first;

        while (p != null) {
            while (comparingNode != null) {
                if (p.data == comparingNode.data) {
                    //duplicate node found, remove node.
                    follow.next = comparingNode.next;
                    comparingNode = comparingNode.next;
                } else {
                    comparingNode = comparingNode.next;
                    follow = follow.next;
                }
            }
            p = p.next;
            //condition needed when p is the last element
            if (p.next == null) {
                return;
            } else {
                comparingNode = p.next;
                follow = p;
            }
        }
    }

    /**
     * The above problem except a temporary buffer is allowed
     */
    public void removeDuplicates() {
        if (first == null) {
            System.out.println("Empty Linked List.");
            return;
        }

        HashMap<Integer, Integer> map = new HashMap<>();
        Node p = first;
        Node comparingNode = p.next;
        Node follow = first;

        while (p != null) {
            if (map.get(p.data) == null) {
                map.put(p.data, 1);
            } else {
                map.put(p.data, map.get(p.data) + 1);
            }
            while (comparingNode != null) {
                if (map.get(comparingNode.data) == null) {
                    map.put(comparingNode.data, 1);
                } else {
                    map.put(comparingNode.data, map.get(comparingNode.data) + 1);
                }

                if (map.get(comparingNode.data) > 1) {
                    follow.next = comparingNode.next;
                    comparingNode = comparingNode.next;
                } else {
                    comparingNode = comparingNode.next;
                    follow = follow.next;
                }
            }
            p = p.next;
        }

    }

    /**
     * Implement an algorithm to find the kth to the last element of a singly linked list
     */
    public int returnKToTheLast(int k) {
        if (first == null) {
            System.out.println("Empty Linked List.");
        }
        Node p = first;
        Node kthElement = first;

        for (int i = 0; i < k; i++) {
            kthElement = kthElement.next;
        }

        while (kthElement != null) {
            p = p.next;
            kthElement = kthElement.next;
        }
        return p.data;
    }

    /**
     * Delete Middle Node : Implement an algorithm to delete a node in the middle (i.e., any node but the first and the last node
     * , not necessarily the exact middle) of a singly linked list, given only access to that node.
     * Example,
     * INPUT: the node c from the linked list a->b->c->d->e->f
     * OUTPUT: nothing is returned, but hte new linked list looks like a->b->d->e->f
     */
    public void deleteMiddleNode(int x) {
        if (first == null) {
            System.out.println("Empty Linked List!");
            return;
        }

        Node p = first;
        Node follow = null;
        while (p != null) {
            if (p.data == x) {
                break;
            }
            follow = p;
            p = p.next;
        }

        if (p == first) {
            System.out.println("The first element cannot be deleted!");
        } else if (p.next == null) {
            System.out.println("The last element cannot be deleted!");
        } else {
            follow.next = p.next;
        }
    }

    /**
     * SUM LISTS: You have two numbers represented by a linked list, where each node contains a single digit The digits
     * are stored in reverse order, such that the 1's digit is at the head of the list.
     * Write a method that adds the two numbers and returns the sum as a linked list
     * Example:
     * INPUT: (7->1->6) + (5->9->2)
     * OUTPUT: (2->1->9). That is, 912.
     */
    public LinkedList<Integer> sumLists(SinglyLinkedList firstLinkedList, SinglyLinkedList secondLinkedList) {
        Node firstHead = firstLinkedList.first;
        Node secondHead = secondLinkedList.first;

        Node pointerForFirstLinkedList = firstHead;
        Node pointerForSecondLinkedList = secondHead;

        LinkedList<Integer> sumLinkedList = new LinkedList<>();
        int carry = 0;
        while (pointerForFirstLinkedList != null || pointerForSecondLinkedList != null) {
            int firstLinkedListNodeValue = pointerForFirstLinkedList == null ? 0 : pointerForFirstLinkedList.data;
            int secondLinkedListNodeValue = pointerForSecondLinkedList == null ? 0 : pointerForSecondLinkedList.data;
            int sum = (carry + firstLinkedListNodeValue + secondLinkedListNodeValue);
            sumLinkedList.add(sum % 10);
            carry = sum / 10;

            //increment pointers
            pointerForFirstLinkedList = pointerForFirstLinkedList.next;
            pointerForSecondLinkedList = pointerForSecondLinkedList.next;
        }

        if (carry > 0) {
            sumLinkedList.add(carry);
        }
        return sumLinkedList;
    }

    /**
     * *Detect a cycle in a linked list. Note that the head pointer may be 'null' if the list is empty.
    */

    boolean hasCycle() {
        if(first == null){
            System.out.println("The linked list is empty");
            return false;
        }else{
            Node pointer1 = first;
            Node pointer2 = pointer1.next;
            for(int numberOfRotations = 0; numberOfRotations < 100; numberOfRotations++){
                if(pointer1 != null && pointer2 != null){
                    if(pointer1 == pointer2){
                        return true;
                    }
                    pointer1 = pointer1.next;
                    pointer2 = pointer1.next;
                }else{
                    return false;
                }
            }
            return false;
        }

    }

}
