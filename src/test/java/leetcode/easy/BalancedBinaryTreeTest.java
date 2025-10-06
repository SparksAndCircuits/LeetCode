package leetcode.easy;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import static org.junit.jupiter.api.Assertions.*;

public class BalancedBinaryTreeTest {
    private BalancedBinaryTree solution;

    @BeforeEach
    public void setUp() {
        solution = new BalancedBinaryTree();
    }

    @Test
    public void testEmptyTree() {
        TreeNode root = null;
        assertTrue(solution.isBalanced(root), "Empty tree should be balanced");
    }

    @Test
    public void testSingleNode() {
        TreeNode root = new TreeNode(1);
        assertTrue(solution.isBalanced(root), "Single node tree should be balanced");
    }

    @Test
    public void testTwoNodesLeftChild() {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        assertTrue(solution.isBalanced(root), " Tree with one left child should be balanced");
    }

    @Test
    public void testLeetCodeExample1_balanced() {
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(9);
        root.right = new TreeNode(20);
        root.right.left = new TreeNode(15);
        root.right.right = new TreeNode(7);
        assertTrue(solution.isBalanced(root), "Leetcode example 1 should be balanced");
    }

    @Test
    public void testLeetCodeExample2_Unbalanced() {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(2);
        root.left.left = new TreeNode(3);
        root.left.right = new TreeNode(3);
        root.left.left.left = new TreeNode(4);
        root.left.left.right = new TreeNode(4);
        assertFalse(solution.isBalanced(root), "LeetCode example 2 should be unbalanced");
    }

    @Test
    public void testCompletlyBalancedTree(){
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.right.left = new TreeNode(6);
        root.right.right = new TreeNode(7);
        assertTrue(solution.isBalanced(root), "Perfect binary tree should be balanced");
    }
}
