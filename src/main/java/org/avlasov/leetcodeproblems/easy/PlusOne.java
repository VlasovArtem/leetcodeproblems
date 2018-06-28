package org.avlasov.leetcodeproblems.easy;

/**
 * Created By artemvlasov on 27/06/2018
 *
 * Given a non-empty array of digits representing a non-negative integer, plus one to the integer.
 *
 * The digits are stored such that the most significant digit is at the head of the list, and each element in the array contain a single digit.
 *
 * You may assume the integer does not contain any leading zero, except the number 0 itself.
 *
 * Example 1:
 *
 * Input: [1,2,3]
 * Output: [1,2,4]
 * Explanation: The array represents the integer 123.
 *
 * Example 2:
 *
 * Input: [4,3,2,1]
 * Output: [4,3,2,2]
 * Explanation: The array represents the integer 4321.
 *
 **/
public class PlusOne {

    public int[] plusOne(int[] digits) {
        if (digits == null || digits.length == 0) return new int[]{};
        int length = digits.length;
        boolean hasFloatingNumber = false;
        for (int i = length - 1; i >= 0 ; i--) {
            int digit = digits[i];
            if (hasFloatingNumber || i == length - 1) {
                digit++;
                if (digit != 10)
                    hasFloatingNumber = false;
                else {
                    hasFloatingNumber = true;
                    digit = 0;
                }
            }
            digits[i] = digit;
        }
        if (hasFloatingNumber) {
            int[] newInts = new int[length + 1];
            System.arraycopy(digits, 0, newInts, 1, length);
            newInts[0] = 1;
            return newInts;
        }
        return digits;
    }

}
