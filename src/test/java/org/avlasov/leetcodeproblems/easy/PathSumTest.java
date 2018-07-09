package org.avlasov.leetcodeproblems.easy;

import org.avlasov.leetcodeproblems.data.TreeNode;
import org.avlasov.leetcodeproblems.utils.TreeNodeUtils;
import org.junit.Test;

import java.util.Optional;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

/**
 * Created By artemvlasov on 08/07/2018
 **/
public class PathSumTest {

    private PathSum pathSum;

    public PathSumTest() {
        pathSum = new PathSum();
    }

    @Test
    public void hasPathSum_WithExistingSumInTreeNode1_ReturnTrue() {
        Optional<TreeNode> root = TreeNodeUtils.getTreeNode(new Integer[]{5, 4, 8, 11, null, 13, 4, 7, 2, null, null, null, null, null, 1});
        assertTrue(root.isPresent());
        assertTrue(pathSum.hasPathSum(root.get(), 22));
    }

    @Test
    public void hasPathSum_WithNotExistingSumInTreeNode2_ReturnFalse() {
        Optional<TreeNode> root = TreeNodeUtils.getTreeNode(new Integer[]{5, 4, 8, 11, null, 13, 4, 7, 12, null, null, null, null, null, 1});
        assertTrue(root.isPresent());
        assertFalse(pathSum.hasPathSum(root.get(), 22));
    }

    @Test
    public void hasPathSum_WithNullTreeNode_ReturnFalse() {
        assertFalse(pathSum.hasPathSum(null, 10));
    }
}