/**
 * Given an array A of size N, print the reverse of it.
 * <p>
 * Input:
 * First line contains an integer denoting the test cases 'T'. T testcases follow. Each testcase contains two lines of
 * input. First line contains N the size of the array A. The second line contains the elements of the array.
 * <p>
 * Output:
 * For each testcase, in a new line, print the array in reverse order.
 */

package final450DSA.arrays;

import java.util.Scanner;

public class I_Reverse {
    public static void main(String[] args) {
        //code
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        while (test-- > 0) {
            int n = sc.nextInt();
            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
            }
            revArray(a, n);
            printArray(a, n);

        }

    }

    public static void printArray(int[] a, int n) {

        for (int i = 0; i < n; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();
    }

    public static void revArray(int[] a, int n) {

        int s = 0;
        int e = n - 1;

        while (s < e) {
            int temp = a[s];
            a[s] = a[e];
            a[e] = temp;
            s++;
            e--;
        }

    }
}
