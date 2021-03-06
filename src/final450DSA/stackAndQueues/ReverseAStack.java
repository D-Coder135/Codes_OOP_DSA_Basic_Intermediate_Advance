/*   Created by IntelliJ IDEA.
 *   Author: Devansh Shukla (D-Coder135)
 *   Date: 22-04-2022/04/2022
 *   Time: 04:26 PM
 *   File: ReverseAStack
 */

package final450DSA.stackAndQueues;

import java.util.Stack;

public class ReverseAStack {
    public static void reverseStack(Stack<Integer> stack) {
        if (stack.isEmpty()) {
            return;
        }
        int item = stack.pop();
        reverseStack(stack);
        insertBottom(stack, item);
    }

    private static void insertBottom(Stack<Integer> stack, int item) {
        if (stack.isEmpty()) {
            stack.push(item);
            return;
        }
        int topItem = stack.pop();
        insertBottom(stack, item);
        stack.push(topItem);
    }
}
