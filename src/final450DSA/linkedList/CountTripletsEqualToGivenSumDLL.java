/*   Created by IntelliJ IDEA.
 *   Author: Devansh Shukla (D-Coder135)
 *   Date: 31-03-2022/03/2022
 *   Time: 09:59 AM
 *   File: CountTripletsEqualToGivenSumDLL
 */

/**
 * GFG QUESTION =>
 * <p>
 * Given a sorted doubly linked list of distinct nodes(no two nodes have the same data) and a value x.
 * Count triplets in the list that sum up to a given value x.
 */

package final450DSA.linkedList;

public class CountTripletsEqualToGivenSumDLL {
    static class Node {
        int data;
        Node next, prev;
    }

    static int countTriplets(Node head, int sum) {
        if (head == null || head.next == null) {
            return 0;
        }

        Node current, ahead, last;
        int count = 0;

        last = head;

        while (last.next != null) {
            last = last.next;
        }

        for (current = head; current != null; current = current.next) {
            ahead = current.next;

            count += countPairs(ahead, last, sum - current.data);
        }

        return count;
    }

    private static int countPairs(Node first, Node last, int value) {
        int count = 0;

        while (first != null && last != null && first != last && last.next != first) {
            if (first.data + last.data == value) {
                count++;
                first = first.next;
                last = last.prev;
            } else if (first.data + last.data < value) {
                first = first.next;
            } else {
                last = last.prev;
            }
        }
        return count;
    }
}
