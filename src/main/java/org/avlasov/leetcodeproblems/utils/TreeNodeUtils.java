package org.avlasov.leetcodeproblems.utils;

import org.avlasov.leetcodeproblems.data.TreeNode;

/**
 * Created By artemvlasov on 30/06/2018
 **/
public class TreeNodeUtils {

    public static TreeNode getTreeNode(int value, int leftValue, int rightValue) {
        TreeNode treeNode = new TreeNode(value);
        treeNode.left = new TreeNode(leftValue);
        treeNode.right = new TreeNode(rightValue);
        return treeNode;
    }

    public static TreeNode getTreeNodeWithLeftTreeNode(int value, int leftValue) {
        TreeNode treeNode = new TreeNode(value);
        treeNode.left = new TreeNode(leftValue);
        return treeNode;
    }

    public static TreeNode getTreeNodeWithRightTreeNode(int value, int rightValue) {
        TreeNode treeNode = new TreeNode(value);
        treeNode.right = new TreeNode(rightValue);
        return treeNode;
    }

}
