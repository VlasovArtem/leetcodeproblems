package org.avlasov.leetcodeproblems.easy;

import org.avlasov.leetcodeproblems.data.TreeNode;
import org.avlasov.leetcodeproblems.utils.TreeNodeUtils;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created By artemvlasov on 07/07/2018
 **/
public class BalancedBinaryTreeTest {

    private BalancedBinaryTree balancedBinaryTree;

    public BalancedBinaryTreeTest() {
        balancedBinaryTree = new BalancedBinaryTree();
    }

    @Test
    public void isBalanced_WithBalancedTreeNode1_ReturnTrue() {
        TreeNode treeNode = TreeNodeUtils.getTreeNode(3, 9, 20);
        treeNode.right = TreeNodeUtils.getTreeNode(20, 15, 7);
        assertTrue(balancedBinaryTree.isBalanced(treeNode));
    }

    @Test
    public void isBalanced_WithBalancedTreeNode2_ReturnTrue() {
        TreeNode treeNode = TreeNodeUtils.getTreeNode(1, 2, 3);
        treeNode.right.right = new TreeNode(6);
        treeNode.left = TreeNodeUtils.getTreeNode(2, 4, 5);
        treeNode.left.left.left = new TreeNode(7);
        assertTrue(balancedBinaryTree.isBalanced(treeNode));
    }

    @Test
    public void isBalanced_WithNotBalancedTreeNode1_ReturnTrue() {
        TreeNode treeNode = TreeNodeUtils.getTreeNode(1, 2, 2);
        treeNode.left = TreeNodeUtils.getTreeNode(2, 3, 3);
        treeNode.left.left = TreeNodeUtils.getTreeNode(3, 4, 4);
        assertFalse(balancedBinaryTree.isBalanced(treeNode));
    }

    @Test
    public void isBalanced_WithNotBalancedTreeNode2_ReturnTrue() {
        TreeNode treeNode = TreeNodeUtils.getTreeNode(1, 2, 2);
        treeNode.left = TreeNodeUtils.getTreeNodeWithLeftTreeNode(2, 3);
        treeNode.left.left = TreeNodeUtils.getTreeNodeWithLeftTreeNode(3, 4);
        treeNode.right = TreeNodeUtils.getTreeNodeWithRightTreeNode(2, 3);
        treeNode.right.right = TreeNodeUtils.getTreeNodeWithRightTreeNode(3, 4);
        assertFalse(balancedBinaryTree.isBalanced(treeNode));
    }

    @Test
    public void isBalanced_WithNull_ReturnTrue() {
        assertTrue(balancedBinaryTree.isBalanced(null));
    }
}