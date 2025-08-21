/*
 * You are given the heads of two sorted linked Lists list1 and list2.
 * Merge the two listgs into one sorted list. The list should be made by splicing together the nodes of the first two lists.
 * Return the head of the merged linked List.
 */

public class mergeTwoLists {

    public class Node {
        public int value;
        public Node next;

        Node() {
        }

        Node(int value) {
            this.value = value;
        }

        Node(int value, Node next) {
            this.value = value;
            this.next = next;
        }
    }

    public Node mergeTwoLists(Node list1, Node list2) {
        Node dummy = new Node(0);
        Node current = dummy;

        while (list1 != null && list2 != null) {
            if (list1.value <= list2.value) {
                current.next = list1;
                list1 = list1.next;
            } else {
                current.next = list2;
                list2 = list2.next;
            }

            current = current.next;
        }

        if (list1 != null) {
            current.next = list1;
        } else {
            current.next = list2;
        }

        return dummy.next;
    }

    public void printlist(Node head) {
        Node temp = head;

        while (temp != null) {
            System.out.println(temp.value);
            temp = temp.next;
        }
    }

    public Node head;
    public Node tail;
    public int length;

    public Node createList(int[] nodeValue) {
        Node head = new Node(nodeValue[0]);
        Node current = head;

        for (int i = 1; i < nodeValue.length; i++) {
            current.next = new Node(nodeValue[i]);
            current = current.next;
        }

        return head;
    }

public static void main(String[] args) {
        mergeTwoLists merger = new mergeTwoLists();
        
        // Create two sorted lists: [1, 2, 4] and [1, 3, 4]
        Node list1 = merger.createList(new int[]{1, 2, 4});
        Node list2 = merger.createList(new int[]{1, 3, 4});
        
        System.out.println("List 1:");
        merger.printlist(list1);
        
        System.out.println("List 2:");
        merger.printlist(list2);
        
        // Merge the lists
        Node merged = merger.mergeTwoLists(list1, list2);
        
        System.out.println("Merged list:");
        System.out.println(merged);
    }
}
