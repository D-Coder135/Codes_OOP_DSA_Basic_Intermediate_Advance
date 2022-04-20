/*   Created by IntelliJ IDEA.
 *   Author: Devansh Shukla (D-Coder135)
 *   Date: 20-04-2022/04/2022
 *   Time: 07:13 PM
 *   File: NextGreaterElement1
 */

package final450DSA.stackAndQueues;

import java.util.HashMap;
import java.util.Stack;

public class NextGreaterElement1 {
    static class Solution {
        public int[] nextGreaterElement(int[] nums1, int[] nums2) {
            Stack<Integer> stack = new Stack<>();
            HashMap<Integer, Integer> map = new HashMap<>();

            for (int j : nums2) {
                while (!stack.isEmpty() && j > stack.peek()) {
                    map.put(stack.pop(), j);
                }
                stack.push(j);
            }

            for (int i = 0; i < nums1.length; i++) {
                nums1[i] = map.getOrDefault(map.get(nums1[i]), -1);
            }
        }
    }
}
