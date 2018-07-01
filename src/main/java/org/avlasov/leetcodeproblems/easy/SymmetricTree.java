package org.avlasov.leetcodeproblems.easy;

import org.avlasov.leetcodeproblems.data.TreeNode;

/**
 * Created By artemvlasov on 01/07/2018
 *
 * Given a binary tree, check whether it is a mirror of itself (ie, symmetric around its center).
 *
 * For example, this binary tree [1,2,2,3,4,4,3] is symmetric:
 *
 *     1
 *    / \
 *   2   2
 *  / \ / \
 * 3  4 4  3
 *
 * But the following [1,2,2,null,3,null,3] is not:
 *
 *     1
 *    / \
 *   2   2
 *    \   \
 *    3    3
 *
 * Note:
 * Bonus points if you could solve it both recursively and iteratively.
 *
 **/
public class SymmetricTree {

    public boolean isSymmetric(TreeNode root) {
        if (root == null) return true;
        return verifyTreeNodes(root.left, root.right);
    }

    private boolean verifyTreeNodes(TreeNode first, TreeNode second) {
        if (first == null && second == null) return true;
        else if (first == null || second == null) return false;
        else if (first.val != second.val) return false;
        return verifyTreeNodes(first.right, second.left) && verifyTreeNodes(first.left, second.right);
    }

}
