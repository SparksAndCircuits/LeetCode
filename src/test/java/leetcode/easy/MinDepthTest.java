package leetcode.easy;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


public class MinDepthTest {
    private final MinDepth solution = new MinDepth();

    @Test
    void testEmptyTree() {
        assertEquals(0, solution.minDepth(null));
    }

    @Test
    void testSingleNode() {
        TreeNode root = new TreeNode(1);
        assertEquals(1, solution.minDepth(root));
    }

    @Test
    void testBalancedTree() {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        assertEquals(2, solution.minDepth(root));
    }

    @Test
    void testUnbalancedTree() {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.left.left = new TreeNode(3);
        root.left.left.left = new TreeNode(4);
        assertEquals(4, solution.minDepth(root));
    }

    @Test
    void testSinglePathTree() {
        TreeNode root = new TreeNode(1);
        root.right = new TreeNode(2);
        root.right.right = new TreeNode(3);
        assertEquals(3, solution.minDepth(root));
    }
}