package leetcode.easy;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import static org.junit.jupiter.api.Assertions.*;

public class DeleteDuplicatesTest {
    private DeleteDuplicates solution;

    @BeforeEach
    public void setUp() {
        solution = new DeleteDuplicates();
    }

    private DeleteDuplicates.ListNode createList(int[] values) {
        if (values == null || values.length == 0) {
            return null;
        }

        DeleteDuplicates.ListNode head = solution.new ListNode(values[0]);
        DeleteDuplicates.ListNode current = head;

        for (int i = 1; i < values.length; i++) {
            current.next = solution.new ListNode(values[i]);
            current = current.next;
        }

        return head;
    }

    private int[] listToArray(DeleteDuplicates.ListNode head) {
        if (head == null) {
            return new int[0];
        }

        int count = 0;
        DeleteDuplicates.ListNode temp = head;
        while (temp != null) {
            count++;
            temp = temp.next;
        }

        int[] result = new int[count];
        temp = head;

        for (int i = 0; i < count; i++) {
            result[i] = temp.val;
            temp = temp.next;
        }

        return result;
    }

    @Test
    public void testEmptyList() {
        DeleteDuplicates.ListNode head = null;
        DeleteDuplicates.ListNode result = solution.deleteDuplicates(head);
        assertNull(result, "Empty list should return null");
    }

    @Test
    public void testSingleNode() {
        DeleteDuplicates.ListNode head = createList(new int[] { 1 });
        DeleteDuplicates.ListNode result = solution.deleteDuplicates(head);
        assertArrayEquals(new int[] { 1 }, listToArray(result), "Single node list should remain unchanged");
    }

    @Test
    public void testNoDuplicates() {
        DeleteDuplicates.ListNode head = createList(new int[] { 1, 2, 3, 4, 5 });
        DeleteDuplicates.ListNode result = solution.deleteDuplicates(head);
        assertArrayEquals(new int[] { 1, 2, 3, 4, 5 }, listToArray(result),
                "List with no duplicates should remain unchanged");
    }

    @Test
    public void testAllDuplicates() {
        DeleteDuplicates.ListNode head = createList(new int[] { 1, 1, 1, 1, 1 });
        DeleteDuplicates.ListNode result = solution.deleteDuplicates(head);
        assertArrayEquals(new int[] { 1 }, listToArray(result), "List with all duplicates should return single node");
    }

    @Test
    public void testConsecutiveDuplicates() {
        DeleteDuplicates.ListNode head = createList(new int[] { 1, 1, 2 });
        DeleteDuplicates.ListNode result = solution.deleteDuplicates(head);
        assertArrayEquals(new int[] { 1, 2 }, listToArray(result), "Should remove consecutive duplicates");
    }

    @Test
    public void testMultipleDuplicateGroups() {
        DeleteDuplicates.ListNode head = createList(new int[] { 1, 1, 2, 3, 3 });
        DeleteDuplicates.ListNode result = solution.deleteDuplicates(head);
        assertArrayEquals(new int[] { 1, 2, 3 }, listToArray(result), "Should remove all duplicate groups");
    }

    @Test
    public void testLongerListWithDuplicates() {
        DeleteDuplicates.ListNode head = createList(new int[] { 1, 1, 1, 2, 2, 3, 4, 4, 5 });
        DeleteDuplicates.ListNode result = solution.deleteDuplicates(head);
        assertArrayEquals(new int[] { 1, 2, 3, 4, 5 }, listToArray(result),
                "Should handle longer list with multiple duplicate groups");
    }

    @Test
    public void testDuplicatesAtEnd() {
        DeleteDuplicates.ListNode head = createList(new int[] { 1, 2, 3, 3, 3 });
        DeleteDuplicates.ListNode result = solution.deleteDuplicates(head);
        assertArrayEquals(new int[] { 1, 2, 3 }, listToArray(result),
                "Should handle duplicates at the end of the list");
    }

    @Test
    public void testDuplicatesAtBegninning() {
        DeleteDuplicates.ListNode head = createList(new int[] { 1, 1, 1, 2, 3 });
        DeleteDuplicates.ListNode result = solution.deleteDuplicates(head);
        assertArrayEquals(new int[] { 1, 2, 3 }, listToArray(result),
                "Should handle duplicates at the begininning of the list");
    }

    @Test
    public void testwoNode_NoDuplicates() {
        DeleteDuplicates.ListNode head = createList(new int[] { 1, 2 });
        DeleteDuplicates.ListNode result = solution.deleteDuplicates(head);
        assertArrayEquals(new int[] { 1, 2 }, listToArray(result), "Two different should remainunchanged");
    }

    @Test
    public void testTwoNodes_WithDuplicates() {
        DeleteDuplicates.ListNode head = createList(new int[] { 1, 1 });
        DeleteDuplicates.ListNode result = solution.deleteDuplicates(head);
        assertArrayEquals(new int[] { 1 }, listToArray(result), "STwo duplicate nodes should return single node");
    }

    @Test
    public void testNegativeNumbers() {
        DeleteDuplicates.ListNode head = createList(new int[] { -3, -3, -1, 0, 0, 0, 1 });
        DeleteDuplicates.ListNode result = solution.deleteDuplicates(head);
        assertArrayEquals(new int[] { -3, -1, 0, 1 }, listToArray(result), "Should handle negative numbers correctly.");
    }
}
