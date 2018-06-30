package org.avlasov.leetcodeproblems.easy;

/**
 * Created By artemvlasov on 30/06/2018
 *
 * Given two sorted integer arrays nums1 and nums2, merge nums2 into nums1 as one sorted array.
 *
 * Note:
 *
 *     The number of elements initialized in nums1 and nums2 are m and n respectively.
 *     You may assume that nums1 has enough space (size that is greater or equal to m + n) to hold additional elements from nums2.
 *
 * Example:
 *
 * Input:
 * nums1 = [1,2,3,0,0,0], m = 3
 * nums2 = [2,5,6],       n = 3
 *
 * Output: [1,2,2,3,5,6]
 *
 **/
public class MergeSortedArray {

    public void merge(int[] nums1, int m, int[] nums2, int n) {
        if ((nums1 == null || nums1.length != m + n) || nums2 == null ) throw new IllegalArgumentException("nums1 or nums2 is null, or nums1 length is not matching formula 'nums.length == m + n'");
        int nums1Index = m - 1;
        int nums2Index = n - 1;
        for (int i = nums1.length - 1; i >= 0 ; i--) {
            if (nums2Index < 0 || (nums1Index >= 0 && nums1[nums1Index] > nums2[nums2Index])) {
                nums1[i] = nums1[nums1Index--];
            } else {
                nums1[i] = nums2[nums2Index--];
            }
        }
    }

}
