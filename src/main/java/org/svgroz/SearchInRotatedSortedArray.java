package org.svgroz;

public class SearchInRotatedSortedArray {
    public int search(int[] nums, int target) {
        final int len = nums.length;

        int median = -1;
        for (int i = 0; i < len - 1; i++) {
            if (nums[i] > nums[i + 1]) {
                median = i;
                break;
            }
        }

        if (median < 0) {
            int res = binarySearch(nums, 0, len - 1, target);
            return res > -1 ? res : -1;
        }

        int res = binarySearch(nums, 0, median, target);
        if (res > -1) {
            return res;
        }

        res = binarySearch(nums, median + 1, len - 1, target);

        return res > -1 ? res : -1;
    }

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
