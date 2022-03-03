/*   Created by IntelliJ IDEA.
 *   Author: Devansh Shukla (D-Coder135)
 *   Date: 03-03-2022/03/2022
 *   Time: 09:44 AM
 *   File: III_ArithmeticSlices
 */

package leetCodes.March2022;

public class III_ArithmeticSlices {
    static class Solution {
        public int numberOfArithmeticSlices(int[] nums) {
            if (nums.length < 3) {
                return 0;
            }

            int ans = 0;
            int[] dp = new int[nums.length];

            for (int i = 2; i < nums.length; i++) {
                if (nums[i] - nums[i - 1] == nums[i - 1] - nums[i - 2]) {
                    dp[i] = dp[i - 1] + 1;
                    ans += dp[i];
                }
            }
            return ans;
        }
    }
}