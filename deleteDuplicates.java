/*
 * Leetcode question 83 Delete duplicates
 * 
 * Given the head of a sorted linked list, delete all duplicats such that each elements appears only once. Return the linked list sorted as well.
 */
public class deleteDuplicates {
    public class Node {
        public int value;
        public Node next;
    }

    Node head;
    Node tail;
    int size;

    public Node deleteDuplicates(Node head) {
        if (head == null) {
            System.out.println("The linked list does not exist.");
        } else {
            Node tempNode = head;
            for (int i = 0; i < size; i++) {
                if (tempNode.value == i + 1) {
                    head = head.next;
                    size--;
                }
                Node values = tempNode;
            }
        }
 
        return head;
    }
}
