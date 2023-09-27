package org.svgroz;

public class ProductOfArrayExceptSelf {

    public int[] productExceptSelf(int[] nums) {
        long full = 1;
        int zeroes = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                zeroes++;
                if (zeroes > 1) {
                    break;
                }
            } else {
                full = full * nums[i];
            }
        }

        if (zeroes > 1) {
            for (int i = 0; i < nums.length; i++) {
                nums[i] = 0;
            }

            return nums;
        }

        for (int i = 0; i < nums.length; i++) {
            int c = nums[i];

            if (c == 0 && zeroes == 1) {
                nums[i] = (int)full;
            } else if (zeroes > 0) {
                nums[i] = 0;
            } else {
                nums[i] = (int)(full / nums[i]);
            }
        }

        return nums;
    }
}
