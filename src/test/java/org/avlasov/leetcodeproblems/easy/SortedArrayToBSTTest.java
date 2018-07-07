package org.avlasov.leetcodeproblems.easy;

import org.avlasov.leetcodeproblems.data.TreeNode;
import org.avlasov.leetcodeproblems.utils.TreeNodeUtils;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created By artemvlasov on 03/07/2018
 *
 **/
public class SortedArrayToBSTTest {

    private SortedArrayToBST sortedArrayToBST;

    public SortedArrayToBSTTest() {
        sortedArrayToBST = new SortedArrayToBST();
    }

    @Test
    public void sortedArrayToBST_WithArray1_ReturnTreeNode() {
        TreeNode treeNode = sortedArrayToBST.sortedArrayToBST(new int[]{-10, -3, 0, 5, 9});
        TreeNode result1 = TreeNodeUtils.getTreeNode(0, -3, 9);
        result1.left.left = new TreeNode(-10);
        result1.right.left = new TreeNode(5);
        TreeNode result2 = TreeNodeUtils.getTreeNode(0, -10, 5);
        result2.left.right = new TreeNode(-3);
        result2.right.right = new TreeNode(9);
        assertTrue(result1.equals(treeNode) || result2.equals(treeNode));
    }

    @Test
    public void sortedArrayToBST_WithArray2_ReturnTreeNode() {
        TreeNode treeNode = sortedArrayToBST.sortedArrayToBST(new int[]{1, 3});
        TreeNode result1 = TreeNodeUtils.getTreeNodeWithLeftTreeNode(3, 1);
        TreeNode result2 = TreeNodeUtils.getTreeNodeWithRightTreeNode(1, 3);
        assertTrue(result1.equals(treeNode) || result2.equals(treeNode));
    }

    @Test
    public void sortedArrayToBST_WithArray3_ReturnTreeNode() {
        TreeNode treeNode = sortedArrayToBST.sortedArrayToBST(new int[]{-1, 0, 1, 2});
        TreeNode result1 = TreeNodeUtils.getTreeNode(1, 0, 2);
        result1.left.left = new TreeNode(-1);
        TreeNode result2 = TreeNodeUtils.getTreeNode(0, -1, 1);
        result2.right.right = new TreeNode(2);
        assertTrue(result1.equals(treeNode) || result2.equals(treeNode));
    }

    @Test
    public void sortedArrayToBST_WithArray4_ReturnTreeNode() {
        TreeNode treeNode = sortedArrayToBST.sortedArrayToBST(new int[]{0, 1, 2, 3, 4, 5, 6});
        TreeNode result = TreeNodeUtils.getTreeNode(3, 1, 5);
        result.right = TreeNodeUtils.getTreeNode(5, 4, 6);
        result.left = TreeNodeUtils.getTreeNode(1, 0, 2);
        assertEquals(result, treeNode);
    }

    @Test
    public void sortedArrayToBST_WithNullArray_ReturnNull() {
        assertNull(sortedArrayToBST.sortedArrayToBST(null));
    }

    @Test
    public void sortedArrayToBST_WithEmptyArray_ReturnNull() {
        assertNull(sortedArrayToBST.sortedArrayToBST(new int[]{}));
    }

}