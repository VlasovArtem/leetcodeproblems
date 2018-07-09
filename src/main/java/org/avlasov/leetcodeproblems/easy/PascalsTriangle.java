package org.avlasov.leetcodeproblems.easy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created By artemvlasov on 09/07/2018
 *
 * https://leetcode.com/problems/pascals-triangle/description/
 *
 * Given a non-negative integer numRows, generate the first numRows of Pascal's triangle.
 *
 * In Pascal's triangle, each number is the sum of the two numbers directly above it.
 *
 * Input: 5
 * Output:
 * [
 *      [1],
 *     [1,1],
 *    [1,2,1],
 *   [1,3,3,1],
 *  [1,4,6,4,1]
 * ]
 *
 **/
public class PascalsTriangle {

    public List<List<Integer>> generate(int numRows) {
        if (numRows <= 0) return Collections.emptyList();
        List<List<Integer>> rows = new ArrayList<>();
        for (int i = 0; i < numRows; i++) {
            rows.add(createRowNumbers(rows, i));
        }
        return rows;
    }

    private List<Integer> createRowNumbers(List<List<Integer>> rows, int row) {
        List<Integer> rowNumbers = new ArrayList<>();
        List<Integer> prevRowNumbers = null;
        int start = 0;
        if (row > 0) {
            prevRowNumbers = rows.get(row - 1);
        }
        for (int i = 0; i < row + 1; i++) {
            if (i == 0 || i == row)
                rowNumbers.add(1);
            else {
                rowNumbers.add(getSum(prevRowNumbers, start++));
            }
        }
        return rowNumbers;
    }

    private int getSum(List<Integer> prevRowNumbers, int start) {
        return prevRowNumbers.get(start) + prevRowNumbers.get(start + 1);
    }

}
