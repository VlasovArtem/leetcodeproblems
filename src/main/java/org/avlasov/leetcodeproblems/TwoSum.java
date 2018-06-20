package org.avlasov.leetcodeproblems;

import java.util.HashMap;

/**
 * Created By artemvlasov on 19/06/2018
 **/
public class TwoSum {

    public int[] twoSum(int[] nums, int target) {
        validateNums(nums);
        HashMap<Integer, Integer> integerIntegerHashMap = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int diff = target - nums[i];
            if (integerIntegerHashMap.containsKey(diff)) {
                return new int[] {integerIntegerHashMap.get(diff), i};
            }
            integerIntegerHashMap.put(nums[i], i);
        }
        throw new IllegalArgumentException("Sum is not found");
    }

    public int[] bruteTwoSum(int[] nums, int target) {
        validateNums(nums);
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target)
                    return new int[]{i, j};
            }
        }
        return new int[]{};
    }

    private void validateNums(int[] nums) {
        if (nums == null || nums.length < 2) throw new IllegalArgumentException("Nums should not be null or length less than 2 elements.");
    }

}
