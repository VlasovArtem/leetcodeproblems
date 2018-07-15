package org.avlasov.leetcodeproblems.easy;

/**
 * Created By artemvlasov on 14/07/2018
 *
 * https://leetcode.com/problems/rotate-array/description/
 *
 * Given an array, rotate the array to the right by k steps, where k is non-negative.
 *
 * Example 1:
 *
 * Input: [1,2,3,4,5,6,7] and k = 3
 * Output: [5,6,7,1,2,3,4]
 * Explanation:
 * rotate 1 steps to the right: [7,1,2,3,4,5,6]
 * rotate 2 steps to the right: [6,7,1,2,3,4,5]
 * rotate 3 steps to the right: [5,6,7,1,2,3,4]
 *
 * Example 2:
 *
 * Input: [-1,-100,3,99] and k = 2
 * Output: [3,99,-1,-100]
 * Explanation:
 * rotate 1 steps to the right: [99,-1,-100,3]
 * rotate 2 steps to the right: [3,99,-1,-100]
 *
 * Note:
 *
 *     1. Try to come up as many solutions as you can, there are at least 3 different ways to solve this problem.
 *     2. Could you do it in-place with O(1) extra space?
 *
 **/
public class RotateArray {

    public void rotate(int[] nums, int k) {
        validateParameters(nums, k);
        boolean[] elements = new boolean[nums.length];
        int length = nums.length;
        k = k % (length * 2);
        int currentIndex = 0;
        int globalTemp = nums[currentIndex];
        for (int i = nums.length; i > 0; i--) {
            if (elements[currentIndex]) {
                while (elements[currentIndex]) {
                    currentIndex++;
                    if (currentIndex == length) currentIndex = 0;
                }
                globalTemp = nums[currentIndex];
            }
            int nextIndex = getNextIndex(currentIndex, length, k);
            int localTemp = nums[nextIndex];
            nums[nextIndex] = globalTemp;
            globalTemp = localTemp;
            elements[currentIndex] = true;
            currentIndex = nextIndex;
        }
    }

    public void rotateSecondSolution(int[] nums, int k) {
        validateParameters(nums, k);
        if (isRotateRequired(nums, k)) {
            for (int i = 0; i < k; i++) {
                int temp = 0;
                for (int j = 1; j < nums.length; j++) {
                    if (j == 1) {
                        temp = nums[j];
                        nums[j] = nums[j - 1];
                    } else {
                        int localTemp = nums[j];
                        nums[j] = temp;
                        temp = localTemp;
                    }
                }
                nums[0] = temp;
            }
        }
    }

    private int getNextIndex(int oldIndex, int length, int step) {
        if (oldIndex + step >= length) {
            return getNextIndex(0, length, step - (length - oldIndex));
        }
        return oldIndex + step;
    }

    private void validateParameters(int[] nums, int k) {
        if (nums == null || nums.length == 0 || k < 0) throw new IllegalArgumentException("nums argument cannot be null or empty, and k argument cannot be negative integer");
    }

    private boolean isRotateRequired(int[] nums, int k) {
        return k % nums.length * 2 != 0;
    }

}
