/*   Created by IntelliJ IDEA.
 *   Author: Devansh Shukla (D-Coder135)
 *   Date: 26-03-2022/03/2022
 *   Time: 11:01 AM
 *   File: AddTwoNumbers
 */

package final450DSA.linkedList;

public class AddTwoNumbers {

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
