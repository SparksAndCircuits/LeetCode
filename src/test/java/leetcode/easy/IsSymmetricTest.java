package leetcode.easy;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class IsSymmetricTest {

    @Test
    public void testSymmetricTree() {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(2);
        root.left.left = new TreeNode(3);
        root.left.right = new TreeNode(4);
        root.right.left = new TreeNode(4);
        root.right.right = new TreeNode(3);

        IsSymmetric solution = new IsSymmetric();
        assertTrue(solution.isSymmetric(root), "Symmetric tree should return true");
    }

    @Test
    public void testNonSymmetricTree() {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(2);
        root.left.right = new TreeNode(3);
        root.right.right = new TreeNode(4);

        IsSymmetric solution = new IsSymmetric();
        assertFalse(solution.isSymmetric(root), "Non-Symmetric tree should return false");
    }

    @Test
    public void testNullTree() {
        IsSymmetric solution = new IsSymmetric();
        assertTrue(solution.isSymmetric(null), "A null tree should return true");
    }

    @Test
    public void testSingleNodeTree() {
        TreeNode root = new TreeNode(1);
        IsSymmetric solution = new IsSymmetric();
        assertTrue(solution.isSymmetric(root), "Single node tree should return true");
    }

    @Test
    public void testUnbalancedTree() {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(2);
        root.left.left = new TreeNode(3);

        IsSymmetric solution = new IsSymmetric();
        assertFalse(solution.isSymmetric(root), " Unbalanced tree should return false");
    }
}
