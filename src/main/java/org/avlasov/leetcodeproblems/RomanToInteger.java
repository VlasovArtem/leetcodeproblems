package org.avlasov.leetcodeproblems;

import java.util.HashMap;
import java.util.Map;

/**
 * Created By artemvlasov on 24/06/2018
 *
 * Roman numerals are represented by seven different symbols: I, V, X, L, C, D and M.
 *
 * Symbol       Value
 * I             1
 * V             5
 * X             10
 * L             50
 * C             100
 * D             500
 * M             1000
 *
 * For example, two is written as II in Roman numeral, just two one's added together. Twelve is written as, XII, which is simply X + II. The number twenty seven is written as XXVII, which is XX + V + II.
 *
 * Roman numerals are usually written largest to smallest from left to right. However, the numeral for four is not IIII. Instead, the number four is written as IV. Because the one is before the five we subtract it making four. The same principle applies to the number nine, which is written as IX. There are six instances where subtraction is used:
 *
 *     I can be placed before V (5) and X (10) to make 4 and 9.
 *     X can be placed before L (50) and C (100) to make 40 and 90.
 *     C can be placed before D (500) and M (1000) to make 400 and 900.
 *
 * Given a roman numeral, convert it to an integer. Input is guaranteed to be within the range from 1 to 3999.
 *
 * Example 1:
 *
 * Input: "III"
 * Output: 3
 *
 * Example 2:
 *
 * Input: "IV"
 * Output: 4
 *
 * Example 3:
 *
 * Input: "IX"
 * Output: 9
 *
 * Example 4:
 *
 * Input: "LVIII"
 * Output: 58
 * Explanation: C = 100, L = 50, XXX = 30 and III = 3.
 *
 * Example 5:
 *
 * Input: "MCMXCIV"
 * Output: 1994
 * Explanation: M = 1000, CM = 900, XC = 90 and IV = 4.
 **/
public class RomanToInteger {

    private final static int[] INTEGERS;
    private final static char[] ROMANS;
    private final static Map<Character, Integer> ROMAN_TO_INTEGER_MAP;

    static {
        INTEGERS = new int[]{1000, 500, 100, 50, 10, 5, 1};
        ROMANS = new char[]{'M', 'D', 'C', 'L', 'X', 'V', 'I'};
        ROMAN_TO_INTEGER_MAP = new HashMap<>();
        ROMAN_TO_INTEGER_MAP.put('M', 1000);
        ROMAN_TO_INTEGER_MAP.put('D', 500);
        ROMAN_TO_INTEGER_MAP.put('C', 100);
        ROMAN_TO_INTEGER_MAP.put('L', 50);
        ROMAN_TO_INTEGER_MAP.put('X', 10);
        ROMAN_TO_INTEGER_MAP.put('V', 5);
        ROMAN_TO_INTEGER_MAP.put('I', 1);
    }

    public int romanToInt(String s) {
        if (s == null || s.isEmpty()) return 0;
        int sum = 0;
        char[] chars = s.toCharArray();
        int lastFoundElementIndex = 0;
        for (int i = 0; i < chars.length; i++) {
            int doubleCharsNumber = findDoubleCharsNumber(chars, i);
            if (doubleCharsNumber == 0) {
                for (int j = lastFoundElementIndex; j < ROMANS.length; j++) {
                    if (chars[i] == ROMANS[j]) {
                        sum += INTEGERS[j];
                        lastFoundElementIndex = j;
                    }
                }
            } else {
                sum += doubleCharsNumber;
                i++;
            }
        }
        return sum;
    }

    public int romanToIntSecondSolution(String s) {
        if (s == null || s.isEmpty()) return 0;
        int sum = 0;
        char[] chars = s.toCharArray();
        int lastElementFound = 0;
        for (char aChar : chars) {
            int charNumber = findCharNumber(aChar);
            if (charNumber > lastElementFound) {
                sum = sum + (charNumber - lastElementFound * 2);
            } else {
                sum += charNumber;
            }
            lastElementFound = charNumber;
        }
        return sum;
    }

    public int romanToIntThirdSolution(String s) {
        if (s == null || s.isEmpty()) return 0;
        int sum = 0;
        char[] chars = s.toCharArray();
        int lastElementFound = 0;
        for (char aChar : chars) {
            Integer charNumber = ROMAN_TO_INTEGER_MAP.get(aChar);
            if (charNumber > lastElementFound) {
                sum = sum + (charNumber - lastElementFound * 2);
            } else {
                sum += charNumber;
            }
            lastElementFound = charNumber;
        }
        return sum;
    }

    //1 place
    public int romanToIntFourthSolution(String s) {
        int[] numbers = new int[s.length()];
        char[] chars = s.toCharArray();
        for (int i = 0; i < s.length(); i++) {
            switch (chars[i]) {
                case 'M':
                    numbers[i] = 1000;
                    break;
                case 'D':
                    numbers[i] = 500;
                    break;
                case 'C':
                    numbers[i] = 100;
                    break;
                case 'L':
                    numbers[i] = 50;
                    break;
                case 'X':
                    numbers[i] = 10;
                    break;
                case 'V':
                    numbers[i] = 5;
                    break;
                case 'I':
                    numbers[i] = 1;
                    break;
            }
        }
        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            int number = numbers[i];
            if (i + 1 < numbers.length) {
                if (numbers[i] < numbers[i + 1])
                    number = -number;
            }
            sum += number;
        }
        return sum;
    }

    private int findCharNumber(char aChar) {
        for (int i = 0; i < ROMANS.length; i++) {
            if (ROMANS[i] == aChar) return INTEGERS[i];
        }
        return 0;
    }

    private int findDoubleCharsNumber(char[] chars, int start) {
        if (start + 1 < chars.length) {
            char nextChar = chars[start + 1];
            switch (chars[start]) {
                case 'C':
                    if ('M' == nextChar) return 900;
                    else if ('D' == nextChar) return 400;
                    break;
                case 'X':
                    if ('C' == nextChar) return 90;
                    else if ('L' == nextChar) return 40;
                    break;
                case 'I':
                    if ('X' == nextChar) return 9;
                    else if ('V' == nextChar) return 4;
                    break;
            }
        }
        return 0;
    }

}
