/*   Created by IntelliJ IDEA.
 *   Author: Devansh Shukla (D-Coder135)
 *   Date: 23-02-2022/02/2022
 *   Time: 09:27 PM
 *   File: MinimumSwapsStringEqual
 */

package final450DSA.strings;

public class MinimumSwapsStringEqual {
    static class Solution {
        public int minimumSwap(String s1, String s2) {
            int numberOfX = 0, numberOfY = 0;

            for (int i = 0; i < s1.length(); i++) {
                if (s1.charAt(i) != s2.charAt(i)) {
                    if (s1.charAt(i) == 'x') numberOfX++;
                    else numberOfY++;
                }
            }
            if (numberOfX % 2 == 0 && numberOfY % 2 == 0) {
                return (numberOfX + numberOfY) / 2;
            } else if (numberOfX % 2 == 1 && numberOfY % 2 == 1) {
                return ((numberOfX + numberOfY) / 2) + 1;
            }
        }
    }
}
