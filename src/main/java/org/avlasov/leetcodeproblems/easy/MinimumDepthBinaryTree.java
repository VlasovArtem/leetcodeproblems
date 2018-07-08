package org.avlasov.leetcodeproblems.easy;

import org.avlasov.leetcodeproblems.data.TreeNode;

/**
 * Created By artemvlasov on 08/07/2018
 *
 * Given a binary tree, find its minimum depth.
 *
 * The minimum depth is the number of nodes along the shortest path from the root node down to the nearest leaf node.
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
 * return its minimum depth = 2.
 *
 **/
public class MinimumDepthBinaryTree {

    public int minDepth(TreeNode root) {
        if (root == null) return 0;
        return getMinDepth(root, 1);
    }

    private int getMinDepth(TreeNode node, int depth) {
        if (node == null) return  -1;
        if (node.left == null && node.right == null) {
            return depth;
        }
        int leftDepth = getMinDepth(node.left, depth + 1);
        int rightDepth = getMinDepth(node.right, depth + 1);
        if (leftDepth == -1)
            return rightDepth;
        else if (rightDepth == -1)
            return leftDepth;
        return Math.min(leftDepth, rightDepth);
    }

}
