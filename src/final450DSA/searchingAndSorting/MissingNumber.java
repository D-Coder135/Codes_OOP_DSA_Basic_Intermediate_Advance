/*   Created by IntelliJ IDEA.
 *   Author: Devansh Shukla (D-Coder135)
 *   Date: 28-02-2022/02/2022
 *   Time: 10:00 PM
 *   File: MissingNumber
 */

package final450DSA.searchingAndSorting;

import java.util.HashSet;

public class MissingNumber {
    static class Solution {
        public int missingNumber(int[] nums) {
            HashSet<Integer> set = new HashSet<>();
            for (int num : nums) {
                set.add(num);
            }

            for (int i = 0; i <= nums.length; i++) {
                if (!set.contains(i)) {
                    return i;
                }
            }
            return -1;
        }
    }
}
