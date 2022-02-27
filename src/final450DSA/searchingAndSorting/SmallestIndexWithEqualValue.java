/*   Created by IntelliJ IDEA.
 *   Author: Devansh Shukla (D-Coder135)
 *   Date: 27-02-2022/02/2022
 *   Time: 10:51 PM
 *   File: SmallestIndexWithEqualValue
 */

package final450DSA.searchingAndSorting;

import java.util.ArrayList;
import java.util.Collections;

public class SmallestIndexWithEqualValue {
    static class Solution {
        public int smallestEqual(int[] nums) {
            ArrayList<Integer> list = new ArrayList<>();
            for (int i = 0; i < nums.length; i++) {
                if ((i % 10) == nums[i]) {
                    list.add(i);
                }
            }
            if (!list.isEmpty()) {
                Collections.sort(list);
                return list.get(0);
            }
        }
    }
}
