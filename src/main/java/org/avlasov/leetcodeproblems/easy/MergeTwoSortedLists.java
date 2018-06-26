package org.avlasov.leetcodeproblems.easy;

import org.avlasov.leetcodeproblems.data.ListNode;

/**
 * Created By artemvlasov on 26/06/2018
 * <p>
 * Merge two sorted linked lists and return it as a new list. The new list should be made by splicing together the nodes of the first two lists.
 * <p>
 * Example:
 * <p>
 * Input: 1->2->4, 1->3->4
 * Output: 1->1->2->3->4->4
 **/
public class MergeTwoSortedLists {

    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if (l1 == null && l2 == null) return null;
        else if (l1 == null) return l2;
        else if (l2 == null) return l1;
        ListNode temp = new ListNode(0);
        ListNode result = temp;
        while (l1 != null || l2 != null) {
            int value;
            if (l1 != null && l2 != null) {
                if (l1.val > l2.val) {
                    value = l2.val;
                    l2 = l2.next;
                } else {
                    value = l1.val;
                    l1 = l1.next;
                }
            } else if (l1 != null) {
                value = l1.val;
                l1 = l1.next;
            } else {
                value = l2.val;
                l2 = l2.next;
            }
            temp.next = new ListNode(value);
            temp = temp.next;
        }
        return result.next;
    }

    public ListNode mergeTwoListsSecondSolution(ListNode l1, ListNode l2) {
        if (l1 == null && l2 == null) return null;
        ListNode tempData = new ListNode(0);
        ListNode result = tempData;
        while (l1 != null && l2 != null) {
            if (l1.val > l2.val) {
                tempData.next = l2;
                l2 = l2.next;
            } else {
                tempData.next = l1;
                l1 = l1.next;
            }
            tempData = tempData.next;
        }
        if (l2 != null)
            tempData.next = l2;
        else
            tempData.next = l1;
        return result.next;
    }

}
