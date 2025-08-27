/*
 * LeetCode question 101 Symmetric Tree
 * 
 * Given the root of a binary tree, check whether it is a mirror of itself (i.e., symmetric around its center).
 */
public class isSymmetric {
    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {}

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    public boolean isSymmetric(TreeNode root) {
        if (root == null) {
            return true;
        }

        return isMirror(root.left, root.right);
    }

    private boolean isMirror(TreeNode left, TreeNode right) {
        if (left == null && right == null) {
            return true;
        }

        if (left == null || right == null) {
            return false;
        }

        return (left.val == right.val) && isMirror(left.left, right.right) && isMirror(left.right, right.left);
    }

    public static void main(String[] args) {
        isSymmetric solution = new isSymmetric();

        TreeNode test1 = null;
        System.out.println("Test 1: " + solution.isSymmetric(test1));

        TreeNode test2 = new TreeNode(1);
        System.out.println("Test 2: " + solution.isSymmetric(test2));

        TreeNode test3 = new TreeNode(1);
        test3.left = new TreeNode(2);
        test3.right = new TreeNode(2);
        test3.left.left = new TreeNode(3);
        test3.left.right = new TreeNode(4);
        test3.right.left = new TreeNode(4);
        test3.right.right = new TreeNode(3);
        System.out.println("Test 3: " + solution.isSymmetric(test3));
    }
}
