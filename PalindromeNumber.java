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

    public PalindromeNumber() {

    }

    public PalindromeNumber(int value) {
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

    private void buildList(int x) {
        head = null;
        tail = null;
        length = 0;

        if (x == 0) {
            Node node = new Node(0);
            head = tail = node;
            length = 1;
            return;
        }

        while (x > 0) {
            int digit = x % 10;
            Node node = new Node(digit);

            if (head == null) {
                head = tail = node;
            } else {
                node.next = head;
                head.prev = node;
                head = node;
            }

            length++;
            x /= 10;
        }
    }

    public boolean isPalindrome(int x) {
        if (x < 0) {
            return false;
        }

        buildList(x);

        Node frontNode = head;
        Node backNode = tail;

        for (int i = 0; i < length / 2; i++) {
            if (frontNode.value != backNode.value) {
                return false;
            }

            frontNode = frontNode.next;
            backNode = backNode.prev;
        }

        return true;
    }

    public static void main(String[] agrs) {
        PalindromeNumber solution = new PalindromeNumber();

        System.out.println("Test 1: isPalindrome(121) = " + solution.isPalindrome(121));
        System.out.println("Test 2: isPalindrome(1221) = " + solution.isPalindrome(1221));
        System.out.println("Test 3: isPalindrome(123) = " + solution.isPalindrome(123));
        System.out.println("Test 4: isPalindrome(-121) = " + solution.isPalindrome(-121));
        System.out.println("Test 5: isPalisndrome(7) = " + solution.isPalindrome(7));
        System.out.println("Test 6: isPalindrome(0) = " + solution.isPalindrome(0));
        System.out.println("Test 7: isPalindrome(10) = " + solution.isPalindrome(10));
        System.out.println("Test 8: isPalindrome(12321) = " + solution.isPalindrome(12321));
        System.out.println("Test 9: isPalindrome(12345) = " + solution.isPalindrome(12345));
        System.out.println("Test 10: isPalindrome(9) = " + solution.isPalindrome(9));
        System.out.println("Test 11: isPalindrome(11) = " + solution.isPalindrome(11));
        System.out.println("Test 12: isPalindrome(12) = " + solution.isPalindrome(21));
    }
}
