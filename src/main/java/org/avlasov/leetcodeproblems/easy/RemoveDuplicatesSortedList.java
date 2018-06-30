package org.avlasov.leetcodeproblems.easy;

import org.avlasov.leetcodeproblems.data.ListNode;

/**
 * Created By artemvlasov on 30/06/2018
 *
 * Given a sorted linked list, delete all duplicates such that each element appear only once.
 *
 * Example 1:
 *
 * Input: 1->1->2
 * Output: 1->2
 *
 * Example 2:
 *
 * Input: 1->1->2->3->3
 * Output: 1->2->3
 *
 **/
public class RemoveDuplicatesSortedList {

    public ListNode deleteDuplicates(ListNode head) {
        if (head == null || head.next == null) return head;
        ListNode currentNode = head;
        while (currentNode != null) {
            ListNode temp = currentNode;
            while (temp.next != null && temp.val == temp.next.val)
                temp = temp.next;
            currentNode.next = temp.next;
            currentNode = temp.next;
        }
        return head;
    }

}
