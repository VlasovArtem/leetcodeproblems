package org.avlasov.leetcodeproblems.utils;

import org.avlasov.leetcodeproblems.data.TreeNode;

import java.util.*;

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

    public static void visualizeTreeNode(TreeNode treeNode) {
        if (treeNode == null) return;
        Map<Integer, List<Integer>> levelData = new TreeMap<>();
        levelData.put(1, Collections.singletonList(treeNode.val));
        calculateLevelDataLeftTreeNode(treeNode.left, levelData, 2, 0);
        calculateLevelDataRightTreeNode(treeNode.right, levelData, 2, 0);
        drawLevelDataMap(levelData);
    }

    private static void calculateLevelDataLeftTreeNode(TreeNode left, Map<Integer,List<Integer>> levelData, int currentLevel, int prevGroupNum) {
        if (left != null) {
            addData(left, levelData, currentLevel, prevGroupNum * 2);
            calculateLevelDataLeftTreeNode(left.left, levelData, currentLevel + 1, prevGroupNum + 1);
            calculateLevelDataRightTreeNode(left.right, levelData, currentLevel + 1, prevGroupNum + 1);
        }
    }

    private static void calculateLevelDataRightTreeNode(TreeNode right, Map<Integer,List<Integer>> levelData, int currentLevel, int prevGroupNum) {
        if (right != null) {
            addData(right, levelData, currentLevel, prevGroupNum * 2 + 1);
            calculateLevelDataLeftTreeNode(right.left, levelData, currentLevel + 1, prevGroupNum + 1);
            calculateLevelDataRightTreeNode(right.right, levelData, currentLevel + 1, prevGroupNum + 1);
        }
    }

    private static void addData(TreeNode treeNode, Map<Integer,List<Integer>> levelData, int currentLevel, int prevGroupNumData) {
        List<Integer> integers = levelData.get(currentLevel);
        if (integers == null || integers.size() < prevGroupNumData) {
            if (integers == null) {
                integers = new ArrayList<>();
                levelData.put(currentLevel, integers);
            }
            int currentSize = integers.size();
            for (int i = 0; i < prevGroupNumData - currentSize; i++) {
                integers.add(null);
            }
        }
        integers.add(treeNode.val);
    }

    private static void drawLevelDataMap(Map<Integer,List<Integer>> levelData) {
        int maxOffset = levelData.get(levelData.size()).size() / 2;
        for (int i = 0; i < maxOffset; i++) {
            System.out.print("\t");
        }
        System.out.print(levelData.get(1).get(0));
        System.out.println();
        for (int i = 2; i <= maxOffset; i++) {
            drawLevel(levelData.get(i), maxOffset);
        }
    }

    private static void drawLevel(List<Integer> integers, int maxOffset) {
        StringBuilder linesString = new StringBuilder();
        StringBuilder dataString = new StringBuilder();
        for (int i = 0; i < maxOffset - integers.size() / 2; i++) {
            linesString.append("\t");
            dataString.append("\t");
        }
        for (int i = 0; i < integers.size(); i++) {
            Integer value = integers.get(i);
            if (value != null) {
                if (i % 2 == 0)
                    linesString.append("/").append(" ");
                else
                    linesString.append("\\").append("\t");
                dataString.append(value).append(" ");
            } else {
                linesString.append("\t");
                dataString.append("\t");
            }
        }
        linesString.append("\n");
        dataString.append("\n");
        System.out.print(linesString.toString());
        System.out.print(dataString.toString());
    }

    public static void main(String[] args) {
        TreeNode treeNode = TreeNodeUtils.getTreeNode(1, 2, 5);
        treeNode.right = TreeNodeUtils.getTreeNode(5, 6, 7);
        treeNode.right.right = TreeNodeUtils.getTreeNode(7, 11, 9);
        treeNode.right.left = TreeNodeUtils.getTreeNode(6, 12, 4);
        visualizeTreeNode(treeNode);
    }

}
