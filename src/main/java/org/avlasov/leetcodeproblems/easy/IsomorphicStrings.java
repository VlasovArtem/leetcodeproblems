package org.avlasov.leetcodeproblems.easy;

/**
 * Created By artemvlasov on 22/07/2018
 *
 * Given two strings s and t, determine if they are isomorphic.
 *
 * Two strings are isomorphic if the characters in s can be replaced to get t.
 *
 * All occurrences of a character must be replaced with another character while preserving the order of characters. No two characters may map to the same character but a character may map to itself.
 *
 * Example 1:
 *
 * Input: s = "egg", t = "add"
 * Output: true
 * Example 2:
 *
 * Input: s = "foo", t = "bar"
 * Output: false
 * Example 3:
 *
 * Input: s = "paper", t = "title"
 * Output: true
 * Note:
 * You may assume both s and t have the same length.
 *
 **/
public class IsomorphicStrings {

    public boolean isIsomorphic(String s, String t) {
        if (s == null || t == null || s.length() != t.length()) return false;
        for (int i = 0; i < s.length() - 1; i++) {
            int sIndex = s.indexOf(s.charAt(i), i + 1);
            int tIndex = t.indexOf(t.charAt(i), i + 1);
            if (sIndex != tIndex)
                return false;
        }
        return true;
    }

    public boolean isIsomorphicSecondSolution(String s, String t) {
        if (s == null || t == null || s.length() != t.length()) return false;
        char[] sChars = s.toCharArray();
        char[] tChars = t.toCharArray();
        int[] sValues = new int[256];
        int[] tValues = new int[256];
        for (int i = 0; i < s.length(); i++) {
            if (sValues[sChars[i]] != tValues[tChars[i]])
                return false;
            else {
                sValues[sChars[i]] = i + 1;
                tValues[tChars[i]] = i + 1;
            }
        }
        return true;
    }

}
