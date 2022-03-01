/*   Created by IntelliJ IDEA.
 *   Author: Devansh Shukla (D-Coder135)
 *   Date: 01-03-2022/03/2022
 *   Time: 10:26 AM
 *   File: PairGivenDifference
 */

package final450DSA.searchingAndSorting;

import java.util.Arrays;

public class PairGivenDifference {
    static class Solution {
        public boolean findPair(int[] arr, int size, int n) {
            //code here.
            Arrays.sort(arr);

            for (int i = 0; i < size; i++) {
                if (binarySearch(arr, i + 1, size - 1, arr[i] + n)) {
                    return true;
                }
            }
        }
    }
}
