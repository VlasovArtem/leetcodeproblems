package org.avlasov.leetcodeproblems.easy;

import java.util.HashSet;
import java.util.Set;

/**
 * Created By artemvlasov on 16/07/2018
 *
 * https://leetcode.com/problems/happy-number/description/
 *
 * Write an algorithm to determine if a number is "happy".
 *
 * A happy number is a number defined by the following process: Starting with any positive integer, replace the number by the sum of the squares of its digits, and repeat the process until the number equals 1 (where it will stay), or it loops endlessly in a cycle which does not include 1. Those numbers for which this process ends in 1 are happy numbers.
 *
 * Example:
 *
 * Input: 19
 * Output: true
 * Explanation:
 * 1(2) + 9(2) = 82
 * 8(2) + 2(2) = 68
 * 6(2) + 8(2) = 100
 * 1(2) + 0(2) + 0(2) = 1
 *
 **/
public class HappyNumber {

    public boolean isHappy(int n) {
        if (n < 0) throw new IllegalArgumentException("Argument cannot be negative");
        int sum = n;
        Set<Integer> ints = new HashSet<>();
        while (sum != 1) {
            sum = findNewSum(sum);
            if (ints.contains(sum)) return false;
            ints.add(sum);
        }
        return true;
    }

    private int findNewSum(int n) {
        int sum = 0;
        while (n != 0) {
            sum += (n % 10) * (n % 10);
            n /= 10;
        }
        return sum;
    }

}
