/*   Created by IntelliJ IDEA.
 *   Author: Devansh Shukla (D-Coder135)
 *   Date: 29-03-2022/03/2022
 *   Time: 02:12 PM
 *   File: IsCircularLinkedList
 */

package final450DSA.linkedList;

public class IsCircularLinkedList {
    static class Node {
        int data;
        Node next;

        Node(int d) {
            data = d;
            next = null;
        }
    }

    static class GfG {
        boolean isCircular(Node head) {
            // Your code here
            if (head == null || head.next == null) {
                return false;
            }

            Node temp = head;

        }
    }
}
