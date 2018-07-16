package org.avlasov.leetcodeproblems.easy;

import org.avlasov.leetcodeproblems.data.ListNode;

/**
 * Created By artemvlasov on 16/07/2018
 *
 * https://leetcode.com/problems/remove-linked-list-elements/description/
 *
 * Remove all elements from a linked list of integers that have value val.
 *
 * Example:
 *
 * Input:  1->2->6->3->4->5->6, val = 6
 * Output: 1->2->3->4->5
 *
 **/
public class RemoveLinkedListElements {

    public ListNode removeElements(ListNode head, int val) {
        head = prepareHead(head, val);
        if (head == null) return null;
        ListNode previousNode = head;
        ListNode currentNode = head.next;
        while (currentNode != null) {
            if (currentNode.val == val) {
                previousNode.next = currentNode.next;
                currentNode = currentNode.next;
            } else {
                previousNode = currentNode;
                currentNode = currentNode.next;
            }
        }
        return head;
    }

    private ListNode prepareHead(ListNode head, int val) {
        while (head != null && head.val == val)
            head = head.next;
        return head;
    }

}
