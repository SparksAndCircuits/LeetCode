package leetcode.easy;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import static org.junit.jupiter.api.Assertions.*;

public class MergeTwoListsTest {
    private MergeTwoLists solution;

    @BeforeEach
    void setUp() {
        solution = new MergeTwoLists();
    }

    private MergeTwoLists.ListNode createList(int[] values) {
        if (values == null || values.length == 0) {
            return null;
        }

        MergeTwoLists.ListNode head = new MergeTwoLists.ListNode(values[0]);
        MergeTwoLists.ListNode current = head;

        for (int i = 1; i < values.length; i++) {
            current.next = new MergeTwoLists.ListNode(values[i]);
            current = current.next;
        }

        return head;
    }

    private int[] listToArray(MergeTwoLists.ListNode head) {
        if (head == null) {
            return new int[0];
        }

        MergeTwoLists.ListNode temp = head;
        int count = 0;
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
    void testBasicMerge() {
        MergeTwoLists.ListNode list1 = createList(new int[]{1, 2, 4});
        MergeTwoLists.ListNode list2 = createList(new int[]{1, 3, 4});
        MergeTwoLists.ListNode result = solution.mergeTwoLists(list1, list2);
        
        int[] expected = {1, 1, 2, 3, 4, 4};
        int[] actual = listToArray(result);
        
        assertArrayEquals(expected, actual);
    }

    @Test
    void testBothListsEmpty(){
        MergeTwoLists.ListNode list1 = null;
        MergeTwoLists.ListNode list2 = null;

        MergeTwoLists.ListNode result = solution.mergeTwoLists(list1, list2);
        assertNull(result);
    }

    @Test
    void testFirstListEmpty(){
        MergeTwoLists.ListNode list1 = null;
        MergeTwoLists.ListNode list2 = createList(new int[]{0});
        MergeTwoLists.ListNode result = solution.mergeTwoLists(list1, list2);

        int[] expected = {0};
        int[] actual = listToArray(result);

        assertArrayEquals(expected, actual);
    }

    @Test
    void testSecondListEmpty() {
        MergeTwoLists.ListNode list1 = createList(new int[]{1, 2, 3});
        MergeTwoLists.ListNode list2 = null;
        MergeTwoLists.ListNode result = solution.mergeTwoLists(list1, list2);
        
        int[] expected = {1, 2, 3};
        int[] actual = listToArray(result);
        
        assertArrayEquals(expected, actual);
    }
    
    @Test
    void testDifferentLengths() {
        MergeTwoLists.ListNode list1 = createList(new int[]{1, 5, 6});
        MergeTwoLists.ListNode list2 = createList(new int[]{2, 3, 4, 7, 8, 9});
        MergeTwoLists.ListNode result = solution.mergeTwoLists(list1, list2);
        
        int[] expected = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int[] actual = listToArray(result);
        
        assertArrayEquals(expected, actual);
    }
    
    @Test
    void testFirstListAllSmaller() {
        MergeTwoLists.ListNode list1 = createList(new int[]{1, 2, 3});
        MergeTwoLists.ListNode list2 = createList(new int[]{4, 5, 6});
        MergeTwoLists.ListNode result = solution.mergeTwoLists(list1, list2);
        
        int[] expected = {1, 2, 3, 4, 5, 6};
        int[] actual = listToArray(result);
        
        assertArrayEquals(expected, actual);
    }
    
    @Test
    void testSecondListAllSmaller() {
        MergeTwoLists.ListNode list1 = createList(new int[]{4, 5, 6});
        MergeTwoLists.ListNode list2 = createList(new int[]{1, 2, 3});
        MergeTwoLists.ListNode result = solution.mergeTwoLists(list1, list2);
        
        int[] expected = {1, 2, 3, 4, 5, 6};
        int[] actual = listToArray(result);
        
        assertArrayEquals(expected, actual);
    }
    
    @Test
    void testSingleElements() {
        MergeTwoLists.ListNode list1 = createList(new int[]{2});
        MergeTwoLists.ListNode list2 = createList(new int[]{1});
        MergeTwoLists.ListNode result = solution.mergeTwoLists(list1, list2);
        
        int[] expected = {1, 2};
        int[] actual = listToArray(result);
        
        assertArrayEquals(expected, actual);
    }
    
    @Test
    void testDuplicateValues() {
        MergeTwoLists.ListNode list1 = createList(new int[]{1, 1, 1});
        MergeTwoLists.ListNode list2 = createList(new int[]{1, 1, 2});
        MergeTwoLists.ListNode result = solution.mergeTwoLists(list1, list2);
        
        int[] expected = {1, 1, 1, 1, 1, 2};
        int[] actual = listToArray(result);
        
        assertArrayEquals(expected, actual);
    }
    
    @Test
    void testNegativeNumbers() {
        MergeTwoLists.ListNode list1 = createList(new int[]{-3, -1, 0});
        MergeTwoLists.ListNode list2 = createList(new int[]{-2, 1, 3});
        MergeTwoLists.ListNode result = solution.mergeTwoLists(list1, list2);
        
        int[] expected = {-3, -2, -1, 0, 1, 3};
        int[] actual = listToArray(result);
        
        assertArrayEquals(expected, actual);
    }
    
    @Test
    void testLargeNumbers() {
        MergeTwoLists.ListNode list1 = createList(new int[]{100, 200});
        MergeTwoLists.ListNode list2 = createList(new int[]{150, 250});
        MergeTwoLists.ListNode result = solution.mergeTwoLists(list1, list2);
        
        int[] expected = {100, 150, 200, 250};
        int[] actual = listToArray(result);
        
        assertArrayEquals(expected, actual);
    }
    
    @Test
    void testSameLists() {
        MergeTwoLists.ListNode list1 = createList(new int[]{1, 2, 3});
        MergeTwoLists.ListNode list2 = createList(new int[]{1, 2, 3});
        MergeTwoLists.ListNode result = solution.mergeTwoLists(list1, list2);
        
        int[] expected = {1, 1, 2, 2, 3, 3};
        int[] actual = listToArray(result);
        
        assertArrayEquals(expected, actual);
    }
}
