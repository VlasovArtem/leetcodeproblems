package org.avlasov.leetcodeproblems.easy;

import org.avlasov.leetcodeproblems.data.TreeNode;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

/**
 * Created By artemvlasov on 01/07/2018
 *
 * Given a binary tree, return the bottom-up level order traversal of its nodes' values. (ie, from left to right, level by level from leaf to root).
 *
 * For example:
 * Given binary tree [3,9,20,null,null,15,7],
 *
 *     3
 *    / \
 *   9  20
 *     /  \
 *    15   7
 *
 * return its bottom-up level order traversal as:
 *
 * [
 *   [15,7],
 *   [9,20],
 *   [3]
 * ]
 *
 **/
public class BinaryTreeLevelOrderTraversalII {

    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        if (root == null) return Collections.emptyList();
        List<List<Integer>> data = new LinkedList<>();
        collectData(root, data, 0);
        return data;
    }

    public void collectData(TreeNode treeNode, List<List<Integer>> data, int level) {
        if (treeNode != null) {
            if (level >= data.size()) {
                data.add(0, new LinkedList<>());
            }
            data.get(data.size() - 1 - level).add(treeNode.val);
            collectData(treeNode.left, data, level + 1);
            collectData(treeNode.right, data, level + 1);
        }
    }

}
