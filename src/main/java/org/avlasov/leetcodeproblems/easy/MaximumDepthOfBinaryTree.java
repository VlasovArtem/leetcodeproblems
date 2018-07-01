package org.avlasov.leetcodeproblems.easy;

import org.avlasov.leetcodeproblems.data.TreeNode;

/**
 * Created By artemvlasov on 01/07/2018
 *
 * Given a binary tree, find its maximum depth.
 *
 * The maximum depth is the number of nodes along the longest path from the root node down to the farthest leaf node.
 *
 * Note: A leaf is a node with no children.
 *
 * Example:
 *
 * Given binary tree [3,9,20,null,null,15,7],
 *
 *     3
 *    / \
 *   9  20
 *     /  \
 *    15   7
 *
 * return its depth = 3.
 *
 **/
public class MaximumDepthOfBinaryTree {

    public int maxDepth(TreeNode root) {
        if (root == null) return 0;
        return findMaxDepth(root, 1);
    }

    private int findMaxDepth(TreeNode node, int maxDepth) {
        if (node == null || (node.right == null && node.left == null)) return maxDepth;
        int rightDepth = findMaxDepth(node.right, maxDepth + 1);
        int leftDepth = findMaxDepth(node.left, maxDepth + 1);
        return leftDepth > rightDepth ? leftDepth : rightDepth;
    }

}
