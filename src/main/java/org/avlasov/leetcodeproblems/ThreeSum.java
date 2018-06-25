package org.avlasov.leetcodeproblems;

import java.util.*;

/**
 * Created By artemvlasov on 24/06/2018
 * <p>
 * Given an array nums of n integers, are there elements a, b, c in nums such that a + b + c = 0? Find all unique triplets in the array which gives the sum of zero.
 * <p>
 * Note:
 * <p>
 * The solution set must not contain duplicate triplets.
 * <p>
 * Example:
 * <p>
 * Given array nums = [-1, 0, 1, 2, -1, -4],
 * <p>
 * A solution set is:
 * [
 * [-1, 0, 1],
 * [-1, -1, 2]
 * ]
 **/
public class ThreeSum {

    public List<List<Integer>> threeSum(int[] nums) {
        if (nums == null || nums.length == 0) return Collections.emptyList();
        int length = nums.length;
        Arrays.sort(nums);
        List<List<Integer>> data = new ArrayList<>();
        for (int i = 0; i < length && nums[i] <= 0; i++) {
            int intI = nums[i];
            for (int j = i + 1; j < length - 1; j++) {
                int intJ = nums[j];
                int indexK = Arrays.binarySearch(nums, j + 1, length, -(intI + intJ));
                if (indexK > 0) {
                    boolean isSumExists = false;
                    for (List<Integer> datum : data) {
                        if (datum.get(0) == nums[i] && datum.get(1) == nums[j])
                            isSumExists = true;
                    }
                    if (!isSumExists)
                    data.add(Arrays.asList(intI, intJ, nums[indexK]));
                }
            }
        }
        return data;
    }

    public List<List<Integer>> threeSumSecondSolution(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> data = new ArrayList<>();
        for (int i = 0; i < nums.length - 2; i++) {
            if(i == 0 || nums[i] != nums[i-1]) {
                int first = nums[i], low = i + 1, high = nums.length - 1;
                while (low < high) {
                    int second = nums[low], third = nums[high];
                    if (first + second + third == 0) {
                        data.add(Arrays.asList(first, second, third));
                        while (high > low && nums[low] == nums[low + 1])
                            low++;
                        while (low < high && nums[high] == nums[high - 1])
                            high--;
                        low++;
                        high--;
                    } else if (first + second + third > 0) {
                        high--;
                    } else {
                        low++;
                    }
                }
            }
        }
        return data;
    }

}
