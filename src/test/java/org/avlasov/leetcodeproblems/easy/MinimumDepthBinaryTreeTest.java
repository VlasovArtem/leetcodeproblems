package org.avlasov.leetcodeproblems.easy;

import org.avlasov.leetcodeproblems.data.TreeNode;
import org.avlasov.leetcodeproblems.utils.TreeNodeUtils;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created By artemvlasov on 08/07/2018
 **/
public class MinimumDepthBinaryTreeTest {

    private MinimumDepthBinaryTree minimumDepthBinaryTree;

    public MinimumDepthBinaryTreeTest() {
        minimumDepthBinaryTree = new MinimumDepthBinaryTree();
    }

    @Test
    public void minDepth_WithTreeNode1_ReturnInteger() {
        TreeNode treeNode = TreeNodeUtils.getTreeNode(3, 9, 20);
        treeNode.right = TreeNodeUtils.getTreeNode(20, 15, 7);
        assertEquals(2, minimumDepthBinaryTree.minDepth(treeNode));
    }

    @Test
    public void minDepth_WithTreeNode2_ReturnInteger() {
        TreeNode treeNode = TreeNodeUtils.getTreeNodeWithLeftTreeNode(3, 9);
        assertEquals(2, minimumDepthBinaryTree.minDepth(treeNode));
    }

    @Test
    public void minDepth_WithTreeNode3_ReturnInteger() {
        TreeNode treeNode = new TreeNode(1);
        treeNode.left = new TreeNode(2);
        treeNode.left.left = new TreeNode(3);
        treeNode.left.left.left = new TreeNode(4);
        treeNode.left.left.left.left = new TreeNode(5);
        assertEquals(5, minimumDepthBinaryTree.minDepth(treeNode));
    }

    @Test
    public void minDepth_WithNullTreeNode_ReturnZero() {
        assertEquals(0, minimumDepthBinaryTree.minDepth(null));
    }
}