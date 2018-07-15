package org.avlasov.leetcodeproblems.easy;

import java.util.HashMap;
import java.util.Map;

/**
 * Created By artemvlasov on 15/07/2018
 * <p>
 * https://leetcode.com/problems/reverse-bits/description/
 * <p>
 * Reverse bits of a given 32 bits unsigned integer.
 * <p>
 * Example:
 * <p>
 * Input: 43261596
 * Output: 964176192
 * Explanation: 43261596 represented in binary as 00000010100101000001111010011100,
 * return 964176192 represented in binary as 00111001011110000010100101000000.
 * <p>
 * Follow up:
 * If this function is called many times, how would you optimize it?
 **/
public class ReverseBits {

    private final static Map<Integer, Integer> REVERSE_INT_MAP;

    static {
        REVERSE_INT_MAP = new HashMap<>();
    }

    public int reverseBits(int n) {
        if (REVERSE_INT_MAP.containsKey(n)) {
            REVERSE_INT_MAP.get(n);
        }
        String binaryString = Integer.toBinaryString(n);
        char[] reverseIntChar = new char[32];
        char[] chars = binaryString.toCharArray();
        int numberLength = chars.length;
        for (int i = 0; i < reverseIntChar.length; i++) {
            if (i >= numberLength)
                reverseIntChar[i] = '0';
            else
                reverseIntChar[i] = chars[numberLength - 1 - i];
        }
        int reverseInt = Integer.parseUnsignedInt(String.valueOf(reverseIntChar), 2);
        REVERSE_INT_MAP.put(n, reverseInt);
        REVERSE_INT_MAP.put(reverseInt, n);
        return reverseInt;
    }

    public int reverseBitsSecondSolution(int n) {
        int ret = 0;
        for(int i = 0; i < 32; i++){
            ret += (n & 0x1);
            if(i < 31){
                n = n>>1;
                ret = ret<<1;
            }
        }
        return ret;
    }

}
