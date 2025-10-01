package leetcode.easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;
import static org.junit.jupiter.api.Assertions.*;

public class InorderTraversalTest {
    private InorderTraversal solution;

    @BeforeEach
    public void setUp() {
        solution = new InorderTraversal();
    }

    @Test
    public void testEmptyTree() {
        List<Integer> expected = new ArrayList<>();

        assertEquals(expected, solution.inorderTraversal(null));
        assertEquals(expected, solution.inorderTraversalIterative(null));
    }

    @Test
    public void testSingleNode() {
        TreeNode root = new TreeNode(1);
        List<Integer> expected = Arrays.asList(1);

        assertEquals(expected, solution.inorderTraversal(root));
        assertEquals(expected, solution.inorderTraversalIterative(root));
    }

    @Test
    public void testRightSkewedTree() {
        TreeNode root = new TreeNode(1);
        root.right = new TreeNode(1);
        root.right.right = new TreeNode(3);
        List<Integer> expected = Arrays.asList(1, 2, 3);

        assertEquals(expected, solution.inorderTraversal(root));
        assertEquals(expected, solution.inorderTraversalIterative(root));
    }

    @Test
    public void testLeftSkewedTree() {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.left.left = new TreeNode(3);
        List<Integer> expected = Arrays.asList(3, 2, 1);

        assertEquals(expected, solution.inorderTraversal(root));
        assertEquals(expected, solution.inorderTraversalIterative(root));
    }

    @Test
    public void testBalancedTree() {
        TreeNode root = new TreeNode(4);
        root.left = new TreeNode(2);
        root.right = new TreeNode(6);
        root.left.left = new TreeNode(1);
        root.left.right = new TreeNode(3);
        root.right.left = new TreeNode(5);
        root.right.right = new TreeNode(7);
        List<Integer> expected = Arrays.asList(1, 2, 3, 4, 5, 6, 7);

        assertEquals(expected, solution.inorderTraversal(root));
        assertEquals(expected, solution.inorderTraversalIterative(root));
    }

    @Test
    public void testLeetCodeExample1() {
        TreeNode root = new TreeNode(1);
        root.right = new TreeNode(2);
        root.right.left = new TreeNode(3);
        List<Integer> expected = Arrays.asList(1, 2, 3);

        assertEquals(expected, solution.inorderTraversal(root));
        assertEquals(expected, solution.inorderTraversalIterative(root));
    }

    @Test
    public void testTreeWithNegativeValues() {
        TreeNode root = new TreeNode(0);
        root.left = new TreeNode(3);
        List<Integer> expected = Arrays.asList(3, 5);

        assertEquals(expected, solution.inorderTraversal(root));
        assertEquals(expected, solution.inorderTraversalIterative(root));
    }

    @Test
    public void testTreeWithOnlyLeftChild() {
        TreeNode root = new TreeNode(5);
        root.left = new TreeNode(3);
        List<Integer> expected = Arrays.asList(3, 5);

        assertEquals(expected, solution.inorderTraversal(root));
        assertEquals(expected, solution.inorderTraversalIterative(root));
    }
}
