package org.avlasov.leetcodeproblems;

/**
 * Created By artemvlasov on 24/06/2018
 *
 * Write a function to find the longest common prefix string amongst an array of strings.
 *
 * If there is no common prefix, return an empty string "".
 *
 * Example 1:
 *
 * Input: ["flower","flow","flight"]
 * Output: "fl"
 *
 * Example 2:
 *
 * Input: ["dog","racecar","car"]
 * Output: ""
 * Explanation: There is no common prefix among the input strings.
 *
 * Note:
 *
 * All given inputs are in lowercase letters a-z.
 **/
public class LongestCommonPrefix {

    public String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) return "";
        if (strs.length == 1) return strs[0];
        char[] chars = strs[0].toCharArray();
        StringBuilder commonPrefix = new StringBuilder();
        for (int i = 0; i < chars.length; i++) {
            char currentChar = chars[i];
            for (int j = 1; j < strs.length; j++) {
                int i1 = strs[j].indexOf(currentChar, i);
                if (i != i1) return commonPrefix.toString();
            }
            commonPrefix.append(currentChar);
        }
        return commonPrefix.toString();
    }

    public String longestCommonPrefixSecondSolution(String[] strs) {
        if (strs == null || strs.length == 0) return "";
        if (strs.length == 1) return strs[0];
        char[] chars = strs[0].toCharArray();
        StringBuilder commonPrefix = new StringBuilder();
        for (int i = 0; i < chars.length; i++) {
            char currentChar = chars[i];
            for (int j = 1; j < strs.length; j++) {
                String str = strs[j];
                if (i >= str.length() || str.charAt(i) != currentChar)
                    return commonPrefix.toString();
            }
            commonPrefix.append(currentChar);
        }
        return commonPrefix.toString();
    }

    public String longestCommonPrefixThirdSolution(String[] strs) {
        if (strs == null || strs.length == 0) return "";
        String pre = strs[0];
        for (int i = 1; i < strs.length; i++)
            while(strs[i].indexOf(pre) != 0)
                pre = pre.substring(0,pre.length()-1);
        return pre;
    }
}
