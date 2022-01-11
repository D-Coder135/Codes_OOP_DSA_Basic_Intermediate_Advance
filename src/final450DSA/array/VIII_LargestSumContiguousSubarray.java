package final450DSA.array;

public class VIII_LargestSumContiguousSubarray {

    long maxSubarraySum(int[] arr, int n) {

        // Your code here

        long max_sum = 0, max_end = 0;

        for (int i = 0; i < n; i++) {
            max_end += arr[i];
            if (max_end < 0) {
                max_end = 0;
            }
            if (max_end > max_sum) {
                max_sum = max_end;
            }
        }
        return max_sum;
    }

}