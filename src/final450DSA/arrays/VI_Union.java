/**
 * Given two arrays a[] and b[] of size n and m respectively. The task is to find union between these two arrays.
 * <p>
 * Union of the two arrays can be defined as the set containing distinct elements from both the arrays.
 * If there are repetitions, then only one occurrence of element should be printed in the union.
 * <p>
 * Example 1:
 * <p>
 * Input:
 * 5 3
 * 1 2 3 4 5
 * 1 2 3
 * Output:
 * 5
 * Explanation:
 * 1, 2, 3, 4 and 5 are the
 * elements which comes in the union set
 * of both arrays. So count is 5.
 */


package final450DSA.arrays;

import java.util.HashSet;

public class VI_Union {
    public static int doUnion(int[] a, int n, int[] b, int m) {
        //Your code here
        HashSet<Integer> hashSet = new HashSet<>();

        for (int i = 0; i < n; i++) {
            hashSet.add(a[i]);
        }

        for (int i = 0; i < m; i++) {
            hashSet.add(b[i]);
        }
        return hashSet.size();
    }
}
