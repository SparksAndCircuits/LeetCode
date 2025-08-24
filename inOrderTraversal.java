import java.util.*;

/*
 * Leet code question 94: Binary Tree inOrder traversal
 * 
 * Given the root of a binary tree, return the inorder traversal of its nodes' values
 */
class TreeNode {
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
        this.right = right;
        this.left = left;
    }
}

public class inOrderTraversal {
    public List<Integer> inOrderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        inOrderHelper(root, result);
        return result;
    }

    private void inOrderHelper(TreeNode node, List<Integer> result) {
        if (node == null) {
            return;
        }

        inOrderHelper(node.left, result);
        result.add(node.val);
        inOrderHelper(node.right, result);
    }

    public static void main(String[] args) {
        inOrderTraversal solution = new inOrderTraversal();

        TreeNode test1 = new TreeNode(1);
        test1.right = new TreeNode(2);
        test1.right.left = new TreeNode(3);

        System.out.println("Test 1: " + solution.inOrderTraversal(test1));
        System.out.println("Test 2: " + solution.inOrderTraversal(null));

        TreeNode test3 = new TreeNode(1);
        System.out.println("Test 3: " + solution.inOrderTraversal(test3));
    }
}
