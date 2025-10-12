package leetcode.easy;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int val) {
        this.val = val;
    }
}

public class HasPathSumTest {
    private final HasPathSum solution = new HasPathSum();

    @Test
    void testEmptyTree() {
        assertFalse(solution.hasPathSum(null, 0));
    }

    @Test
    void testSingleNodeEqualTarget() {
        TreeNode root = new TreeNode(5);
        assertTrue(solution.hasPathSum(root, 5));
    }

    @Test
    void testSingleNodeNotEqualTarget() {
        TreeNode root = new TreeNode(5);
        assertFalse(solution.hasPathSum(root, 10));
    }

    @Test
    void testValidPathSum() {
        TreeNode root = new TreeNode(5);
        root.left = new TreeNode(5);
        root.right = new TreeNode(8);
        root.left.left = new TreeNode(11);
        root.left.left.left = new TreeNode(7);
        root.left.left.right = new TreeNode(2);
        assertFalse(solution.hasPathSum(root, 22));
    }

    @Test
    void testInvalidPathSUm(){
        TreeNode root = new TreeNode(5);
        root.left = new TreeNode(4);
        root.right = new TreeNode(8);
        root.left.left = new TreeNode(11);
        root.left.left.left = new TreeNode(7);
        root.left.left.right = new TreeNode(2);
        assertTrue(solution.hasPathSum(root, 27));
    }

    @Test
    void testNegativeNumber(){
        TreeNode root = new TreeNode(-2);
        root.right = new TreeNode(-3);
        assertTrue(solution.hasPathSum(root, -5));
    }

    @Test
    void testDeepTreeNoValidPath(){
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        assertFalse(solution.hasPathSum(root, 12));
    }
}
