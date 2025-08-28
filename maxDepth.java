/*
 * Leet code question 104 Maximum Depth of Binary Tree
 * 
 * Given the root of a binary tree, return its maximum depth.
 * A Binary tree's maximum depth is the number of nodes along the longest path from the root node down to the farthest leaf node.
 */

import java.util.LinkedList;
import java.util.Queue;

public class maxDepth {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {

        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    public int maxDepth(TreeNode root) {

        if (root == null) {
            return 0;
        }
        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        queue.add(root);
        int depth = 0;

        while (!queue.isEmpty()) {
            int levelSize = queue.size();
            depth++;
            for (int i = 0; i < levelSize; i++) {
                TreeNode presentNode = queue.remove();
                if (presentNode.left != null) {
                    queue.add(presentNode.left);
                }
                if (presentNode.right != null) {
                    queue.add(presentNode.right);
                }
            }

        }

        return depth;
    }

    public static void main(String[] args) {
        maxDepth solution = new maxDepth();

        TreeNode test1 = null;
        System.out.println("Test 1: " + solution.maxDepth(test1));

        TreeNode test2 = solution.new TreeNode(1);
        System.out.println("Test 2: " + solution.maxDepth(test2));

        TreeNode test3 = solution.new TreeNode(3);
        test3.left = solution.new TreeNode(9);
        test3.right = solution.new TreeNode(20);
        test3.right.left = solution.new TreeNode(15);
        test3.right.right = solution.new TreeNode(7);
        System.out.println("Test 3: " + solution.maxDepth(test3));
    }
}
