/*   Created by IntelliJ IDEA.
 *   Author: Devansh Shukla (D-Coder135)
 *   Date: 23-03-2022/03/2022
 *   Time: 06:35 PM
 *   File: ReverseLinkedList
 */

/**
 * LEETCODE QUESTION 206 =>
 * <p>
 * Given the head of a singly linked list, reverse the list, and return the reversed list.
 * <p>
 * Example 1:
 * <p>
 * Input: head = [1,2,3,4,5]
 * Output: [5,4,3,2,1]
 * <p>
 * Example 2:
 * <p>
 * Input: head = [1,2]
 * Output: [2,1]
 * <p>
 * Example 3:
 * <p>
 * Input: head = []
 * Output: []
 */

package final450DSA.linkedList;

public class ReverseLinkedList {

    // Definition for singly-linked list.
    public static class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    static class Solution {
        // Iterative Approach
        public ListNode reverseList(ListNode head) {
            ListNode prev = null, next = null, current = head;
            while (current != null) {
                next = current.next;
                current.next = prev;
                prev = current;
                current = next;
            }
            return prev;
        }

        // Recursive Approach
        public ListNode reverseListRecursive(ListNode head) {
            if (head == null || head.next == null) {
                return head;
            }

            ListNode rest = reverseListRecursive(head.next);
            head.next.next = head;
            head.next = null;

            return rest;
        }
    }
}
