package org.avlasov.leetcodeproblems.utils;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created By artemvlasov on 09/07/2018
 **/
public class PascalsTriangleUtils {

    public static List<List<Integer>> generatePascalsTriangle(int[] ints) {
        if (ints == null || ints.length == 0) return Collections.emptyList();
        List<List<Integer>> rows = new ArrayList<>();
        List<Integer> rowNumbers = new ArrayList<>();
        int step = 1;
        int count = step;
        for (int i = 0; i < ints.length;) {
            if (count == 0) {
                rows.add(rowNumbers);
                step++;
                count = step;
                rowNumbers = new ArrayList<>();
            } else {
                rowNumbers.add(ints[i++]);
                count--;
            }
        }
        if (!rowNumbers.isEmpty()) {
            rows.add(rowNumbers);
        }
        return rows;
    }

}
