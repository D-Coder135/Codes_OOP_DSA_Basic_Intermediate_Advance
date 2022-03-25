/*   Created by IntelliJ IDEA.
 *   Author: Devansh Shukla (D-Coder135)
 *   Date: 25-03-2022/03/2022
 *   Time: 03:00 PM
 *   File: RemoveDupliicateElements
 */

package final450DSA.linkedList;

public class RemoveDuplicateElements {

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
        public ListNode deleteDuplicates(ListNode head) {
            if (head == null || head.next == null) {
                return head;
            }

            ListNode temp = head;

            while (temp.next != null) {
                if (temp.val == temp.next.val) {
                    temp.next = temp.next.next;
                } else {
                    temp = temp.next;
                }
            }
            return head;
        }
    }
}
