package org.svgroz.algs;

public class BinarySearch {
    int binarySearch(int[] nums, final int left, final int right, int target) {
        int l = left, r = right;

        while (l <= r) {
            int median = (l + r) / 2;

            if (nums[median] == target) {
                return median;
            }

            if (nums[median] > target) {
                r = median - 1;
            } else {
                l = median + 1;
            }
        }

        return - 1;
    }
}
