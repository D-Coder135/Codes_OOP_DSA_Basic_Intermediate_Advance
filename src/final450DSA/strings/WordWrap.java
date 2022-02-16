/*   Created by IntelliJ IDEA.
 *   Author: Devansh Shukla (D-Coder135)
 *   Date: 16-02-2022/02/2022
 *   Time: 10:05 PM
 *   File: WordWrap
 */

/**
 * WORD WRAP GFG =>
 * <p>
 * Given an array nums[] of size n, where nums[i] denotes the number of characters in one word. Let K be the limit on
 * the number of characters that can be put in one line (line width). Put line breaks in the given sequence such that
 * the lines are printed neatly.
 * Assume that the length of each word is smaller than the line width. When line breaks are inserted there is a
 * possibility that extra spaces are present in each line. The extra spaces include spaces put at the end of every line
 * except the last one.
 * <p>
 * You have to minimize the following total cost where total cost = Sum of cost of all lines,
 * where cost of line is = (Number of extra spaces in the line)2.
 * <p>
 * Example 1:
 * <p>
 * Input: nums = {3,2,2,5}, k = 6
 * Output: 10
 * <p>
 * Explanation: Given a line can have 6
 * characters,
 * Line number 1: From word no. 1 to 1
 * Line number 2: From word no. 2 to 3
 * Line number 3: From word no. 4 to 4
 * So total cost = (6-3)2 + (6-2-2-1)2 = 32+12 = 10.
 * As in the first line word length = 3 thus
 * extra spaces = 6 - 3 = 3 and in the second line
 * there are two word of length 2 and there already
 * 1 space between two word thus extra spaces
 * = 6 - 2 -2 -1 = 1. As mentioned in the problem
 * description there will be no extra spaces in
 * the last line. Placing first and second word
 * in first line and third word on second line
 * would take a cost of 02 + 42 = 16 (zero spaces
 * on first line and 6-2 = 4 spaces on second),
 * which isn't the minimum possible cost.
 */

package final450DSA.strings;

public class WordWrap {
    final static int inf = Integer.MAX_VALUE;

    public int solveWordWrap(int[] nums, int k) {

    }
}
