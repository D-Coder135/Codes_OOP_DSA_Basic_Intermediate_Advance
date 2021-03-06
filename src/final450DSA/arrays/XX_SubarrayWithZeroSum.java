/*   Created by IntelliJ IDEA.
 *   Author: Devansh Shukla (D-Coder135)
 *   Date: 19-01-2022/01/2022
 *   Time: 11:43 AM
 *   File: XX_SubarrayWithZeroSum
 */

/**
 * Given an array of positive and negative numbers. Find if there is a subarray (of size at-least one) with 0 sum.
 * <p>
 * Example 1:
 * Input:
 * 5
 * 4 2 -3 1 6
 * Output:
 * Yes
 * <p>
 * Explanation:
 * 2, -3, 1 is the subarray
 * with sum 0.
 */

package final450DSA.arrays;

import java.util.HashMap;

public class XX_SubarrayWithZeroSum {

    static boolean findsum(int[] arr, int n) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int sum = 0;
        map.put(0, 1);
        for (int i = 0; i < n; i++) {
            sum += arr[i];
            if (map.containsKey(sum)) {
                return true;
            } else {
                map.put(sum, 1);
            }
        }
        return false;
    }

}
