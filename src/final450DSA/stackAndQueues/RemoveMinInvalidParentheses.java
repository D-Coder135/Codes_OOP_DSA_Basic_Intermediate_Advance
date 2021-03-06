/*   Created by IntelliJ IDEA.
 *   Author: Devansh Shukla (D-Coder135)
 *   Date: 26-04-2022/04/2022
 *   Time: 11:18 PM
 *   File: RemoveMinInvalidParentheses
 */

/**
 * GFG & LEETCODE QUESTION 301 =>
 * <p>
 * Given a string s that contains parentheses and letters, remove the minimum number of
 * invalid parentheses to make the input string valid.
 * <p>
 * Return all the possible results. You may return the answer in any order.
 * <p>
 * Example 1:
 * <p>
 * Input: s = "()())()"
 * Output: ["(())()","()()()"]
 * <p>
 * Example 2:
 * <p>
 * Input: s = "(a)())()"
 * Output: ["(a())()","(a)()()"]
 * <p>
 * Example 3:
 * <p>
 * Input: s = ")("
 * Output: [""]
 */

package final450DSA.stackAndQueues;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Stack;

public class RemoveMinInvalidParentheses {
    static class Solution {
        public List<String> removeInvalidParentheses(String s) {

            HashSet<String> set = new HashSet<>();
            List<String> ansList = new ArrayList<>();

            int min = getMin(s);
            solution(s, min, set, ansList);

            return ansList;

        }

        private void solution(String str, int min, HashSet<String> set, List<String> ansList) {
            if (set.contains(str)) {
                return;
            }
            set.add(str);

            if (min == 0) {
                int minNow = getMin(str);
                if (minNow == 0) {
                    ansList.add(str);
                }
                return;
            }

            for (int i = 0; i < str.length(); i++) {
                if (str.charAt(i) != '(' && str.charAt(i) != ')') {
                    continue;
                }

                String left = str.substring(0, i);
                String right = str.substring(i + 1);

                if (!set.contains(left + right)) {
                    solution(left + right, min - 1, set, ansList);
                }
            }
        }

        private int getMin(String s) {
            Stack<Character> stack = new Stack<>();

            for (int i = 0; i < s.length(); i++) {
                char ch = s.charAt(i);

                if (ch == '(') {
                    stack.push(ch);
                } else if (ch == ')') {
                    if (!stack.isEmpty() && stack.peek() == '(') {
                        stack.pop();
                    } else {
                        stack.push(ch);
                    }
                }
            }
            return stack.size();
        }
    }
}
