/*   Created by IntelliJ IDEA.
 *   Author: Devansh Shukla (D-Coder135)
 *   Date: 01-03-2022/03/2022
 *   Time: 07:17 PM
 *   File: ThreeSum
 */

package leetCodes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSum {
    static class Solution {
        public List<List<Integer>> threeSum(int[] nums) {
            List<List<Integer>> res = new ArrayList<>();
            int n = nums.length;
            if (n < 3) {
                return res;
            }
            Arrays.sort(nums);

            for (int i = 0; i <= n - 3; i++) {

            }
        }
    }
}
