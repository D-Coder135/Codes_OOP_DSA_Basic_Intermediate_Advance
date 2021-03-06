/*   Created by IntelliJ IDEA.
 *   Author: Devansh Shukla (D-Coder135)
 *   Date: 26-03-2022/03/2022
 *   Time: 11:01 AM
 *   File: AddTwoNumbers
 */

/**
 * LEETCODE QUESTION 2 =>
 * <p>
 * You are given two non-empty linked lists representing two non-negative integers. The digits are stored in
 * reverse order, and each of their nodes contains a single digit.
 * Add the two numbers and return the sum as a linked list.
 * <p>
 * You may assume the two numbers do not contain any leading zero, except the number 0 itself.
 * <p>
 * Example 1:
 * <p>
 * Input: l1 = [2,4,3], l2 = [5,6,4]
 * Output: [7,0,8]
 * Explanation: 342 + 465 = 807.
 * <p>
 * <p>
 * Example 2:
 * <p>
 * Input: l1 = [0], l2 = [0]
 * Output: [0]
 */

package final450DSA.linkedList;

public class AddTwoNumbers_LEETCODE {

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

        public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
            ListNode temp = new ListNode();
            ListNode ans = temp;
            int carry = 0;

            while (l1 != null || l2 != null) {
                int sum = 0;
                if (l1 != null) {
                    sum += l1.val;
                    l1 = l1.next;
                }

                if (l2 != null) {
                    sum += l2.val;
                    l2 = l2.next;
                }

                sum += carry;

                ListNode newNode = new ListNode(sum % 10);
                carry = sum / 10;
                temp.next = newNode;
                temp = temp.next;
            }

            if (carry != 0) {
                temp.next = new ListNode(carry);
            }

            return ans.next;
        }

    }

}
