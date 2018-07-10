package org.avlasov.leetcodeproblems.easy;

import org.avlasov.leetcodeproblems.data.ListNode;

/**
 * Created By artemvlasov on 10/07/2018
 *
 * https://leetcode.com/problems/linked-list-cycle/description/
 *
 * Given a linked list, determine if it has a cycle in it.
 *
 * Follow up:
 * Can you solve it without using extra space?
 *
 **/
public class LinkedListCycle {

    public boolean hasCycle(ListNode head) {
        while (head != null) {
            if (head.equals(head.next)) return true;
            ListNode temp = head.next;
            head.next = head;
            head = temp;
        }
        return false;
    }

}
