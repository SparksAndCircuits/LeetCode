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
}
