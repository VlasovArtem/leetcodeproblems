package org.avlasov.leetcodeproblems.easy;

import java.util.HashSet;
import java.util.Set;

/**
 * Created By artemvlasov on 09/07/2018
 *
 * https://leetcode.com/problems/single-number/description/
 *
 * Given a non-empty array of integers, every element appears twice except for one. Find that single one.
 *
 * Note:
 *
 * Your algorithm should have a linear runtime complexity. Could you implement it without using extra memory?
 *
 * Example 1:
 *
 * Input: [2,2,1]
 * Output: 1
 *
 * Example 2:
 *
 * Input: [4,1,2,1,2]
 * Output: 4
 *
 **/
public class SingleNumber {

    public int singleNumber(int[] nums) {
        if (nums == null || nums.length == 0) return -1;
        Set<Integer> ints = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];
            if (ints.contains(num))
                ints.remove(num);
            else
                ints.add(num);
        }
        return ints.iterator().next();
    }

    public int singleNumberSecondSolution(int[] nums) {
        if (nums == null || nums.length == 0) return -1;
        int sum = 0;
        for (int num : nums) {
            sum ^= num;
        }
        return sum;
    }
    
}
