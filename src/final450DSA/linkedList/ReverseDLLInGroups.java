/*   Created by IntelliJ IDEA.
 *   Author: Devansh Shukla (D-Coder135)
 *   Date: 04-04-2022/04/2022
 *   Time: 10:35 PM
 *   File: ReverseDLLInGroups
 */

package final450DSA.linkedList;

public class ReverseDLLInGroups {

    static class Node {
        int data;
        Node next, prev;
    }

    static Node reverseByN(Node head, int k) {
        if (head == null) {
            return null;
        }

        head.prev = null;
        Node temp;

    }
}
