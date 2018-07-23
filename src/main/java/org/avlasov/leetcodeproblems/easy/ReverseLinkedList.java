package org.avlasov.leetcodeproblems.easy;

import org.avlasov.leetcodeproblems.data.ListNode;

/**
 * Created By artemvlasov on 23/07/2018
 *
 * https://leetcode.com/problems/reverse-linked-list/description/
 *
 * Reverse a singly linked list.
 *
 * Example:
 *
 * Input: 1->2->3->4->5->NULL
 * Output: 5->4->3->2->1->NULL
 * Follow up:
 *
 * A linked list can be reversed either iteratively or recursively. Could you implement both?
 *
 **/
public class ReverseLinkedList {

    public ListNode reverseList(ListNode head) {
        if (head == null) return null;
        ListNode reverse = head;
        ListNode nextHead = head.next;
        reverse.next = null;
        while (nextHead != null) {
            ListNode temp = nextHead.next;
            nextHead.next = reverse;
            reverse = nextHead;
            nextHead = temp;
        }
        return reverse;
    }

}
