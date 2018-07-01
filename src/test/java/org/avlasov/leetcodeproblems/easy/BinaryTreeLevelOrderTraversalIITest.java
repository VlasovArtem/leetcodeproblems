package org.avlasov.leetcodeproblems.easy;

import org.avlasov.leetcodeproblems.data.TreeNode;
import org.avlasov.leetcodeproblems.utils.TreeNodeUtils;
import org.hamcrest.collection.IsEmptyCollection;
import org.junit.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;

/**
 * Created By artemvlasov on 01/07/2018
 **/
public class BinaryTreeLevelOrderTraversalIITest {

    private BinaryTreeLevelOrderTraversalII binaryTreeLevelOrderTraversalII;

    public BinaryTreeLevelOrderTraversalIITest() {
        binaryTreeLevelOrderTraversalII = new BinaryTreeLevelOrderTraversalII();
    }

    @Test
    public void levelOrderBottom_WithTreeNode1_ReturnCollection() {
        TreeNode treeNode = TreeNodeUtils.getTreeNode(3, 9, 20);
        treeNode.right = TreeNodeUtils.getTreeNode(20, 15, 7);
        List<List<Integer>> lists = Arrays.asList(Arrays.asList(15, 7), Arrays.asList(9, 20), Collections.singletonList(3));
        assertEquals(lists, binaryTreeLevelOrderTraversalII.levelOrderBottom(treeNode));
    }

    @Test
    public void levelOrderBottom_WithNullTreeNode_ReturnEmptyCollection() {
        assertThat(binaryTreeLevelOrderTraversalII.levelOrderBottom(null), IsEmptyCollection.empty());
    }
}