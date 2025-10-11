package leetcode.easy;

import java.util.LinkedList;
import java.util.Queue;

/*
 * Leetcode question 112: Path Sum
 * 
 * Given the root of a binary tree and an integer targetSum, return true if the tree has a root-to-leaf path such that adding all the values along the path equals targetSum.
 * 
 * A leaf is a node with no children.
 * 
 * Constraints:
 * 1) The number of nodes in the tree is in the range [0, 5000]
 * 2) -1000 <= Node.val <= 1000
 * 3) -1000 <= targetSum <= 1000
 */

public class HasPathSum {
    public boolean hasPathSum(TreeNode root, int targetSum) {
        if (root == null) {
            return false;
        }

        Queue<TreeNode> nodes = new LinkedList<>();
        Queue<Integer> sums = new LinkedList<>();
        nodes.add(root);
        sums.add(root.val);

        while (!nodes.isEmpty()) {
            TreeNode node = nodes.poll();
            int currentSum = sums.poll();

            if (node.left == null && node.right == null && currentSum == targetSum) {
                return true;
            }

            if (node.left != null) {
                nodes.add(node.left);
                sums.add(currentSum + node.left.val);
            }

            if (node.right != null) {
                nodes.add(node.right);
                sums.add(currentSum + node.right.val);
            }
        }

        return false;
    }
}