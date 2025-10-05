package leetcode.easy;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import static org.junit.jupiter.api.Assertions.*;

public class SortedArrayToBSTTest {
    private SortedArrayToBST solution;

    @BeforeEach
    public void setup() {
        solution = new SortedArrayToBST();
    }

    @Test
    public void testEmptyArray() {
        int[] nums = {};
        TreeNode result = solution.sortedArrayToBST(nums);
        assertNull(result, "Empty array should return null");
    }

    @Test
    public void testNullArray() {
        int[] nums = null;
        TreeNode result = solution.sortedArrayToBST(nums);
        assertNull(result, "Null array should return null");
    }

    @Test
    public void testSingleElement() {
        int[] nums = { 1 };
        TreeNode result = solution.sortedArrayToBST(nums);

        assertNotNull(result);
        assertEquals(1, result.val);
        assertNull(result.left);
        assertNull(result.right);
    }

    @Test
    public void testTwoElements() {
        int[] nums = { 1, 3 };
        TreeNode result = solution.sortedArrayToBST(nums);

        assertNotNull(result);
        assertTrue(isBST(result));
        assertTrue(isBalanced(result));
        assertTrue(containsAllElements(result, nums));
    }

    @Test
    public void testLeetCodeExample1() {
        int[] nums = { -10, -3, 0, 5, 9 };
        TreeNode result = solution.sortedArrayToBST(nums);

        assertNotNull(result);
        assertTrue(isBST(result), "Result should be a valid BST");
        assertTrue(isBalanced(result), "Result should be height-balanced");
        assertTrue(containsAllElements(result, nums), "Result should contain all elements");
        assertEquals(5, countNodes(result), "Should have 5 nodes");
    }

    @Test
    public void testOddNumberOfElements() {
        int[] nums = { 1, 2, 3, 4, 5, 6, 7 };
        TreeNode result = solution.sortedArrayToBST(nums);

        assertNotNull(result);
        assertEquals(4, result.val, "Root should be the middle element");
        assertTrue(isBST(result), "Result should be a valid BST");
        assertTrue(isBalanced(result), "Result should be height-balanced");
        assertTrue(containsAllElements(result, nums), "Result should contain all elements");
    }

    @Test
    public void testEvenNumberOfElements() {
        int[] nums = { 1, 2, 3, 4, 5, 6 };
        TreeNode result = solution.sortedArrayToBST(nums);

        assertNotNull(result);
        assertTrue(isBST(result), "Result should be a valid BST");
        assertTrue(isBalanced(result), "Result should be height-balanced");
        assertTrue(containsAllElements(result, nums), "Result should contain all elements");
        assertEquals(6, countNodes(result), "Should have 6 nodes");
    }

    @Test
    public void testNegativeNumbers(){
        int[] nums = {-5, -4, -3, -2, -1};
        TreeNode result = solution.sortedArrayToBST(nums);

        assertNotNull(result);
        assertTrue(isBST(result), "Result should be a valid BST");
        assertTrue(isBalanced(result), "Result should be height-balanced");
        assertTrue(containsAllElements(result, nums), "Result should contain all elements");
    }

    private boolean isBST(TreeNode root) {
        return isBSTHelper(root, null, null);
    }

    private boolean isBSTHelper(TreeNode node, Integer min, Integer max) {
        if (node == null) {
            return true;
        }

        if ((min != null && node.val <= min) || (max != null && node.val >= max)) {
            return false;
        }

        return isBSTHelper(node.left, min, node.val) && 
               isBSTHelper(node.right, node.val, max);
    }

    private boolean isBalanced(TreeNode root) {
        return checkHeight(root) != -1;
    }

    public int checkHeight(TreeNode node) {
        if (node == null) {
            return 0;
        }

        int leftHeight = checkHeight(node.left);
        if (leftHeight == -1) {
            return -1;
        }

        int rightHeight = checkHeight(node.right);
        if (rightHeight == -1) {
            return -1;
        }

        if (Math.abs(leftHeight - rightHeight) > 1) {
            return -1;
        }

        return Math.max(leftHeight, rightHeight) + 1;
    }

    private int countNodes(TreeNode root) {
        if (root == null) {
            return 0;
        }

        return 1 + countNodes(root.left) + countNodes(root.right);
    }

    private boolean containsAllElements(TreeNode root, int[] nums) {
        if (countNodes(root) != nums.length) {
            return false;
        }

        for (int num : nums) {
            if (!contains(root, num)) {
                return false;
            }
        }

        return true;
    }

    private boolean contains(TreeNode root, int val) {
        if (root == null) {
            return false;
        }

        if (root.val == val) {
            return true;
        }

        return contains(root.left, val) || contains(root.right, val);
    }
}
