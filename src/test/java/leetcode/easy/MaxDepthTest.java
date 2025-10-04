package leetcode.easy;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import static org.junit.jupiter.api.Assertions.*;

public class MaxDepthTest {
    private MaxDepth solution;

    @BeforeEach
    public void setUp() {
        solution = new MaxDepth();
    }

    @Test
    public void testEmptyTree() {
        TreeNode root = null;
        assertEquals(0, solution.maxDepth(root), "Empty tree should have a depth of 0");
    }

    @Test
    public void testSingleNode() {
        TreeNode root = new TreeNode(1);
        assertEquals(1, solution.maxDepth(root), "Single node should have a depth of 1");
    }

    @Test
    public void testBalancedTree() {
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(9);
        root.right = new TreeNode(20);
        root.right.left = new TreeNode(15);
        root.right.right = new TreeNode(7);

        assertEquals(3, solution.maxDepth(root), "Balanced tree should have a depth of 3");
    }

    @Test
    public void testLeftSkewedTree() {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.left.left = new TreeNode(3);

        assertEquals(3, solution.maxDepth(root), "Left-Skewed tree should have a depth of 3");
    }

    @Test
    public void testRightSkewedTree() {
        TreeNode root = new TreeNode(1);
        root.right = new TreeNode(2);
        root.right.right = new TreeNode(3);

        assertEquals(3, solution.maxDepth(root), "Right-skewed tree should have a depth of 3");
    }

    @Test
    public void testUnbalancedTree() {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.left.left = new TreeNode(5);

        assertEquals(4, solution.maxDepth(root), "Unbalanced tree should have a depth of 4");
    }

    @Test
    public void testTwoLevelCompleteTree() {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(1);
        root.right = new TreeNode(2);

        assertEquals(2, solution.maxDepth(root), "Two-level tree should have a depth of 2");
    }

    @Test
    public void testDeepTree() {
        TreeNode root = new TreeNode(1);
        TreeNode current = root;
        for (int i = 2; i <= 10; i++) {
            current.left = new TreeNode(i);
            current = current.left;
        }

        assertEquals(10, solution.maxDepth(root), "Deep tree should have a depth of 10");
    }
}
