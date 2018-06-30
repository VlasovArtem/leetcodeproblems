package org.avlasov.leetcodeproblems.easy;

import org.avlasov.leetcodeproblems.data.TreeNode;
import org.avlasov.leetcodeproblems.utils.TreeNodeUtils;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created By artemvlasov on 30/06/2018
 **/
public class SameTreeTest {

    private SameTree sameTree;

    public SameTreeTest() {
        sameTree = new SameTree();
    }

    @Test
    public void isSameTree_WithMatchingTreeNodes_ReturnTrue() {
        TreeNode first = TreeNodeUtils.getTreeNode(1, 2, 3);
        TreeNode second = TreeNodeUtils.getTreeNode(1, 2, 3);
        assertTrue(sameTree.isSameTree(first, second));
    }

    @Test
    public void isSameTree_WithNotMatchingTreeNodes1_ReturnFalse() {
        TreeNode first = TreeNodeUtils.getTreeNodeWithLeftTreeNode(1, 2);
        TreeNode second = TreeNodeUtils.getTreeNodeWithRightTreeNode(1, 2);
        assertFalse(sameTree.isSameTree(first, second));
    }

    @Test
    public void isSameTree_WithNotMatchingTreeNodes2_ReturnFalse() {
        TreeNode first = TreeNodeUtils.getTreeNode(1, 2, 1);
        TreeNode second = TreeNodeUtils.getTreeNode(1, 1, 2);
        assertFalse(sameTree.isSameTree(first, second));
    }

    @Test
    public void isSameTree_WillNullQTreeNode_ReturnFalse() {
        assertFalse(sameTree.isSameTree(null, new TreeNode(1)));
    }

    @Test
    public void isSameTree_WillNullPTreeNode_ReturnFalse() {
        assertFalse(sameTree.isSameTree(new TreeNode(1), null));
    }

}