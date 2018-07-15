package org.avlasov.leetcodeproblems.easy;

/**
 * Created By artemvlasov on 15/07/2018
 *
 * https://leetcode.com/problems/number-of-1-bits/description/
 *
 * Write a function that takes an unsigned integer and returns the number of '1' bits it has (also known as the Hamming weight).
 *
 * Example 1:
 *
 * Input: 11
 * Output: 3
 * Explanation: Integer 11 has binary representation 00000000000000000000000000001011
 *
 * Example 2:
 *
 * Input: 128
 * Output: 1
 * Explanation: Integer 128 has binary representation 00000000000000000000000010000000
 *
 **/
public class NumberOf1Bits {

    public int hammingWeight(int n) {
        int bitsCount = 0;
        while (n != 0) {
            if ((n & 0x1) == 0x1) bitsCount++;
            n = n >> 1;
        }
        return bitsCount;
    }

    public int hammingWeightSecondSolution(int n) {
        String binaryString = Integer.toBinaryString(n);
        int bitsCount = 0;
        for (char aChar : binaryString.toCharArray()) {
            if (aChar == '1') bitsCount++;
        }
        return bitsCount;
    }

}
