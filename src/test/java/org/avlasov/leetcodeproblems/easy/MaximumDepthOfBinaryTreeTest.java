package org.avlasov.leetcodeproblems.easy;

import org.avlasov.leetcodeproblems.data.TreeNode;
import org.junit.Test;

import static org.avlasov.leetcodeproblems.utils.TreeNodeUtils.getTreeNode;
import static org.avlasov.leetcodeproblems.utils.TreeNodeUtils.getTreeNodeWithRightTreeNode;
import static org.junit.Assert.assertEquals;

/**
 * Created By artemvlasov on 01/07/2018
 **/
public class MaximumDepthOfBinaryTreeTest {

    private MaximumDepthOfBinaryTree maximumDepthOfBinaryTree;

    public MaximumDepthOfBinaryTreeTest() {
        maximumDepthOfBinaryTree = new MaximumDepthOfBinaryTree();
    }

    @Test
    public void maxDepth_WithTreeNode1_ReturnInteger() {
        TreeNode firstNode = getTreeNodeWithRightTreeNode(3, 9);
        firstNode.left = getTreeNode(20, 7, 15);
        assertEquals(3, maximumDepthOfBinaryTree.maxDepth(firstNode));
    }

    @Test
    public void maxDepth_WithNullRootTreeNode_ReturnZero() {
        assertEquals(0, maximumDepthOfBinaryTree.maxDepth(null));
    }

}