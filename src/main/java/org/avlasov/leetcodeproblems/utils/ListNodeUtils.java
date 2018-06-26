package org.avlasov.leetcodeproblems.utils;

import org.avlasov.leetcodeproblems.data.ListNode;

/**
 * Created By artemvlasov on 26/06/2018
 **/
public class ListNodeUtils {

    public static ListNode createListNode(int... data) {
        if (data == null || data.length == 0) throw new IllegalArgumentException("Data is null or empty");
        ListNode firstNode = null;
        ListNode lastNode = null;
        for (int datum : data) {
            ListNode listNode = new ListNode(datum);
            if (lastNode != null) {
                lastNode.next = listNode;
                lastNode = listNode;
            } else {
                firstNode = listNode;
                lastNode = listNode;
            }
        }
        return firstNode;
    }

}
