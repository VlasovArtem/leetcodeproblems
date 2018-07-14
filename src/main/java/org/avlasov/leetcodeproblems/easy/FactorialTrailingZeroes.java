package org.avlasov.leetcodeproblems.easy;

/**
 * Created By artemvlasov on 13/07/2018
 *
 * https://leetcode.com/problems/factorial-trailing-zeroes/description/
 *
 * Given an integer n, return the number of trailing zeroes in n!.
 *
 * Example 1:
 *
 * Input: 3
 * Output: 0
 * Explanation: 3! = 6, no trailing zero.
 *
 * Example 2:
 *
 * Input: 5
 * Output: 1
 * Explanation: 5! = 120, one trailing zero.
 *
 * Note: Your solution should be in logarithmic time complexity.
 *
 **/
public class FactorialTrailingZeroes {

    public int trailingZeroes(int n) {
        if (n < 0) throw new IllegalArgumentException("Argument cannot be negative");
        return n == 0 ? 0 : (n / 5 + trailingZeroes(n / 5));
    }

}
