package leetcode.easy;

import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;
import static org.junit.jupiter.api.Assertions.*;

public class IsSameTreeTest {
    private IsSameTree solution;

    @BeforeEach
    public void setUp(){
        solution = new IsSameTree();
    }

    @Test
    public void testBothTreesNull(){
        assertTrue(solution.isSameTree(null, null), "Two null trees should be considered the same");
    }

    @Test
    public void testOneTreeNull(){
        TreeNode p = new TreeNode(1);
        assertFalse(solution.isSameTree(p, null), "Non-null tree and null tree should not be the same");
        assertFalse(solution.isSameTree(null, p), "Null tree and non null tree should not be the same");
    }

    @Test
    public void testSingleNodeSameTrees(){
        TreeNode p = new TreeNode(1);
        TreeNode q = new TreeNode(1);
        assertTrue(solution.isSameTree(p, q), "Two single node trees with the same value should be the same");
    }

    @Test
    public void testSingleNodeDifferentTrees(){
        TreeNode p = new TreeNode(1);
        TreeNode q = new TreeNode(2);
        assertTrue(solution.isSameTree(p, q), "Two single-node trees with different values should not be the same");
    }

    @Test
    public void testIdenticalbalancedTrees(){
        TreeNode p = new TreeNode(1);
        p.left = new TreeNode(2);
        p.right = new TreeNode(3);

        TreeNode q = new TreeNode (1);
        q.left = new TreeNode(2);
        p.right = new TreeNode(3);

        assertTrue(solution.isSameTree(p,q), "Identical balanced trees should be the same");
    }

    @Test
    public void testDifferentStructureSameValues(){
        TreeNode p = new TreeNode(1);
        p.left = new TreeNode(2);

        TreeNode q = new TreeNode(1);
        q.right = new TreeNode(2);

        assertTrue(solution.isSameTree(p, q), "Identical Balanced trees should be the same");
    }
}
