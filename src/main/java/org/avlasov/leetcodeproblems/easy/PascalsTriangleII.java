package org.avlasov.leetcodeproblems.easy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created By artemvlasov on 09/07/2018
 *
 * Given a non-negative index k where k ≤ 33, return the kth index row of the Pascal's triangle.
 *
 * Note that the row index starts from 0.
 *
 * In Pascal's triangle, each number is the sum of the two numbers directly above it.
 *
 * Example:
 *
 * Input: 3
 * Output: [1,3,3,1]
 *
 * Follow up:
 *
 * Could you optimize your algorithm to use only O(k) extra space?
 *
 **/
public class PascalsTriangleII {

    public List<Integer> getRow(int rowIndex) {
        if (rowIndex < 0) return Collections.emptyList();
        List<Integer> prev = Collections.singletonList(1);
        List<Integer> current = prev;
        int start = 0;
        for (int i = 1; i <= rowIndex; i++) {
            current = new ArrayList<>();
            for (int j = 0; j <= i; j++) {
                if (j == 0 || j == i) current.add(1);
                else {
                    current.add(prev.get(start) + prev.get(start + 1));
                    start++;
                }
            }
            start = 0;
            prev = current;

        }
        return current;
    }

}
