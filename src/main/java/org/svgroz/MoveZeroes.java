package org.svgroz;

public class MoveZeroes {
    public void moveZeroes(int[] nums) {
        int left = 0;
        for (int right = 0; right < nums.length; right++) {
            if (nums[right] == 0) {
                continue;
            }

            nums[left] = nums[right];
            left = left + 1;
        }

        for (int i = left; i < nums.length; i++) {
            nums[i] = 0;
        }
    }
}
