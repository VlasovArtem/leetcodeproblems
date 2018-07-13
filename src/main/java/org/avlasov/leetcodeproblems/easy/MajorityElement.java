package org.avlasov.leetcodeproblems.easy;

/**
 * Created By artemvlasov on 13/07/2018
 *
 * https://leetcode.com/problems/majority-element/description/
 *
 * Given an array of size n, find the majority element. The majority element is the element that appears more than ⌊ n/2 ⌋ times.
 *
 * You may assume that the array is non-empty and the majority element always exist in the array.
 *
 * Example 1:
 *
 * Input: [3,2,3]
 * Output: 3
 *
 * Example 2:
 *
 * Input: [2,2,1,1,1,2,2]
 * Output: 2
 *
 **/
public class MajorityElement {

    public int majorityElement(int[] nums) {
        if (nums == null || nums.length <= 0) throw new IllegalArgumentException("Nums should not be null or empty");
        int major = nums[0];
        int count = 1;
        for (int i = 1; i < nums.length; i++) {
            if (count == 0)
                major = nums[i];
            if (major == nums[i])
                count++;
            else
                count--;
        }
        return major;
    }

}
