package org.avlasov.leetcodeproblems.easy;

import org.avlasov.leetcodeproblems.data.TreeNode;
import org.junit.Test;

import static org.avlasov.leetcodeproblems.utils.TreeNodeUtils.getTreeNode;
import static org.avlasov.leetcodeproblems.utils.TreeNodeUtils.getTreeNodeWithLeftTreeNode;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

/**
 * Created By artemvlasov on 01/07/2018
 **/
public class SymmetricTreeTest {

    private SymmetricTree symmetricTree;

    public SymmetricTreeTest() {
        symmetricTree = new SymmetricTree();
    }

    @Test
    public void isSymmetric_WithMatchingTreeNode1_ReturnTrue() {
        TreeNode root = new TreeNode(1);
        root.right = getTreeNode(2, 4, 3);
        root.left = getTreeNode(2, 3, 4);
        assertTrue(symmetricTree.isSymmetric(root));
    }

    @Test
    public void isSymmetric_WithMatchingTreeNode2_ReturnTrue() {
        TreeNode root = new TreeNode(1);
        root.right = getTreeNode(2, 4, 3);
        root.left = getTreeNode(2, 3, 4);
        root.right.left = getTreeNode(4, 5, 1);
        root.left.right = getTreeNode(4, 1, 5);
        assertTrue(symmetricTree.isSymmetric(root));
    }

    @Test
    public void isSymmetric_WithNotMatchingTreeNode1_ReturnFalse() {
        TreeNode root = new TreeNode(1);
        root.right = getTreeNodeWithLeftTreeNode(2, 3);
        root.left = getTreeNodeWithLeftTreeNode(2, 3);
        assertFalse(symmetricTree.isSymmetric(root));
    }

    @Test
    public void isSymmetric_WithNotMatchingTreeNode2_ReturnFalse() {
        TreeNode root = new TreeNode(1);
        root.right = getTreeNode(2, 5, 3);
        root.left = getTreeNode(2, 3, 4);
        assertFalse(symmetricTree.isSymmetric(root));
    }

    @Test
    public void isSymmetric_WithNullTreeNode_ReturnTrue() {
        assertTrue(symmetricTree.isSymmetric(null));
    }
}