package org.avlasov.leetcodeproblems.easy;

/**
 * Created By artemvlasov on 27/06/2018
 *
 * Given an integer array nums, find the contiguous subarray (containing at least one number) which has the largest sum and return its sum.
 *
 * Example:
 *
 * Input: [-2,1,-3,4,-1,2,1,-5,4],
 * Output: 6
 * Explanation: [4,-1,2,1] has the largest sum = 6.
 *
 * Follow up:
 *
 * If you have figured out the O(n) solution, try coding another solution using the divide and conquer approach, which is more subtle.
 *
 **/
public class MaximumSubarray {

    public int maxSubArray(int[] nums) {
        if (nums == null || nums.length == 0) return -1;
        int maxNumber = nums[0];
        int maxSum = nums[0];
        int currentPositiveNumber = -1;
        int currentSum = 0;
        for (int i = 0; i < nums.length; i++) {
            if (currentPositiveNumber < 0 && nums[i] >= 0) {
                currentPositiveNumber = nums[i];
                if (maxSum < currentPositiveNumber) {
                    maxSum = currentPositiveNumber;
                }
                currentSum = 0;
            }
            if (currentPositiveNumber >= 0) {
                int temp = add(currentSum, nums[i]);
                if (temp <= 0) {
                    currentSum = 0;
                    currentPositiveNumber = -1;
                } else {
                    currentSum = temp;
                }
                if (currentSum > maxSum) maxSum = currentSum;
            }
            if (maxNumber < nums[i]) maxNumber = nums[i];
        }
        return maxNumber < 0 ? maxNumber : maxSum;
    }

    private int add(int first, int second) {
        return first < second ? second + first : first + second;
    }

}
