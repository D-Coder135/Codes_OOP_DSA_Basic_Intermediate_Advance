/*   Created by IntelliJ IDEA.
 *   Author: Devansh Shukla (D-Coder135)
 *   Date: 28-03-2022/03/2022
 *   Time: 11:26 PM
 *   File: QuickSortLinkedList
 */

/**
 * GFG QUESTION =>
 * <p>
 * Sort the given Linked List using quicksort. which takes O(n^2) time in worst case and O(nLogn) in average and best
 * cases, otherwise you may get TLE.
 */

package final450DSA.linkedList;

public class QuickSortLinkedList {
    static class Node {
        int data;
        Node next;

        Node(int key) {
            data = key;
            next = null;
        }
    }

    static class GfG {

        public static Node partition(Node node) {
            Node ahead = node.next;
            Node temp1 = node;
            Node prev = temp1;

            while (ahead != null) {
                if (ahead.data <= node.data) {
                    prev = temp1;
                    temp1 = temp1.next;
                    int data = ahead.data;
                    ahead.data = temp1.data;
                    temp1.data = data;
                }
                ahead = ahead.next;
            }

            int temp = temp1.data;
            temp1.data = node.data;
            node.data = temp;

            return prev;
        }

        public static Node quickSort(Node node) {
            //Your code here
            if (node == null) {
                return null;
            }

            Node partition = partition(node);
            Node temp = partition.next;
            partition.next = null;

            if (node != partition) {
                quickSort(node);
            }
            if (node == partition) {
                quickSort(temp);
            } else if (temp != null) {
                quickSort(temp.next);
            }

            partition.next = temp;

            return node;
        }


    }
}
