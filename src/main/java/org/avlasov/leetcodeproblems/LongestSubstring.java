package org.avlasov.leetcodeproblems;

import java.util.HashMap;
import java.util.Map;

/**
 * Created By artemvlasov on 20/06/2018
 * Longest Substring Without Repeating Characters
 *
 * Given a string, find the length of the longest substring without repeating characters.
 *
 * Examples:
 * Given "abcabcbb", the answer is "abc", which the length is 3.
 * Given "bbbbb", the answer is "b", with the length of 1.
 * Given "pwwkew", the answer is "wke", with the length of 3. Note that the answer must be a substring, "pwke" is a subsequence and not a substring.
 *
 **/
public class LongestSubstring {

    public int lengthOfLongestSubstring(String s) {
        if (s == null) throw new IllegalArgumentException("String value should not be null or empty.");
        int size = 0;
        Map<Character, Integer> map = new HashMap<>();
        for (int j = 0, i = 0; j < s.length(); j++) {
            if (map.containsKey(s.charAt(j))) {
                i = Math.max(map.get(s.charAt(j)), i);
            }
            size = Math.max(size, j - i + 1);
            map.put(s.charAt(j), j + 1);
        }
        return size;
    }

}
