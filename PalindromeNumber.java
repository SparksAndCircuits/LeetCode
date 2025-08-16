/*
 * 9. Palindrome Number
 * Given an integer x, return true if x is a palindrome, and false otherwise.
 */

public class PalindromeNumber {
    private Node head;
    private Node tail;
    private int length;

    class Node {
        int value;
        Node next;
        Node prev;

        Node(int value) {
            this.value = value;
        }
    }

    private PalindromeNumber(int value) {
        Node newNode = new Node(value);
        head = newNode;
        tail = newNode;
        length = 1;
    }

    public Node getHead() {
        return head;
    }

    public Node getTail() {
        return tail;
    }

    public boolean isPalindrome(int x) {
        if (length <= 1) {
            return true;
        }

        Node frontNode = head;
        Node backNode = head;

        for (int i = 0; i < length / 2; i++) {
            if (frontNode.value != backNode.value) {
                return false;
            }

            frontNode = frontNode.next;
            backNode = backNode.next;
        }

        return true;
    }
}
