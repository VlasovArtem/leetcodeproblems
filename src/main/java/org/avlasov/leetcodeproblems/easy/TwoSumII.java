package org.avlasov.leetcodeproblems.easy;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * Created By artemvlasov on 12/07/2018
 *
 * https://leetcode.com/problems/two-sum-ii-input-array-is-sorted/description/
 *
 * Given an array of integers that is already sorted in ascending order, find two numbers such that they add up to a specific target number.
 *
 * The function twoSum should return indices of the two numbers such that they add up to the target, where index1 must be less than index2.
 *
 * Note:
 *
 *     Your returned answers (both index1 and index2) are not zero-based.
 *     You may assume that each input would have exactly one solution and you may not use the same element twice.
 *
 * Example:
 *
 * Input: numbers = [2,7,11,15], target = 9
 * Output: [1,2]
 * Explanation: The sum of 2 and 7 is 9. Therefore index1 = 1, index2 = 2.
 *
 **/
public class TwoSumII {

    public int[] twoSum(int[] numbers, int target) {
        if (numbers == null || numbers.length == 0) return null;
        Map<Integer, Integer> data = new HashMap<>();
        for (int i = 0; i < numbers.length; i++) {
            int diff = target - numbers[i];
            if (data.containsKey(diff)) {
                return new int[]{data.get(diff) + 1, i + 1};
            }
            data.put(numbers[i], i);
        }
        return null;
    }

    public int[] twoSumSecondSolution(int[] numbers, int target) {
        if (numbers == null || numbers.length == 0) return null;
        int length = numbers.length;
        for (int i = 0; i < length - 1 && numbers[i] <= target; i++) {
            int diff = target - numbers[i];
            int diffIndex = Arrays.binarySearch(numbers, i + 1, length, diff);
            if (diffIndex >= 0) {
                return new int[]{i + 1, diffIndex + 1};
            }
        }
        return null;
    }

    public int[] twoSumThirdSolution(int[] numbers, int target) {
        if (numbers == null || numbers.length == 0) return null;
        int start = 0;
        int end = numbers.length - 1;
        while (start < end) {
            if (numbers[start] + numbers[end] < target) start++;
            else if (numbers[start] + numbers[end] > target) end--;
            else return new int[] {start + 1, end + 1};
        }
        return null;
    }

}
